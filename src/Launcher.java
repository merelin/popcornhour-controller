import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Launcher {
    private static URL extract(String jar, String name, String ext)
            throws IOException {
        File tmp = File.createTempFile(name, ext);
        tmp.deleteOnExit();
        URL url = Launcher.class.getResource(jar);
        InputStream in = url.openStream();
        try {
            OutputStream out = new FileOutputStream(tmp);
            try {
                byte[] buf = new byte[8192];
                for (int len = in.read(buf); len >= 0; len = in.read(buf)) {
                    out.write(buf, 0, len);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }

        return tmp.toURI().toURL();
    }

    private static ClassLoader makeClassLoader(ClassLoader parent, URL... urls) {
        if (urls.length == 0) {
            return parent;
        }

        while (parent instanceof URLClassLoader) {
            URLClassLoader loader = (URLClassLoader) parent;
            List<URL> list = new ArrayList<URL>();
            list.addAll(Arrays.asList(loader.getURLs()));
            list.addAll(Arrays.asList(urls));
            urls = list.toArray(new URL[list.size()]);
            parent = loader.getParent();
        }

        return parent == null
                ? new URLClassLoader(urls)
                : new URLClassLoader(urls, parent);
    }

    public static void main(String[] args)
            throws ClassNotFoundException,
                InstantiationException, IllegalAccessException,
                SecurityException, NoSuchMethodException,
                IllegalArgumentException, InvocationTargetException,
                URISyntaxException, IOException {
        ProtectionDomain domain = Launcher.class.getProtectionDomain();
        URL location = domain.getCodeSource().getLocation();
        System.setProperty("module.location", location.toExternalForm());

        String module = System.getProperty("module.name");
        URL url = extract("WEB-INF/lib/" + module + ".jar", module, "jar");
        ClassLoader loader
            = makeClassLoader(Launcher.class.getClassLoader(), url);

        Class<?> clazz = loader.loadClass(System.getProperty("jetty.class"));
        Method m = clazz.getMethod("main", String[].class);
        m.invoke(null, new Object[] { args });
    }
}

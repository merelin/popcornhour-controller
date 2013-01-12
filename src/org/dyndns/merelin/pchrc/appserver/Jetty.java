package org.dyndns.merelin.pchrc.appserver;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Jetty implements Runnable {
    private final Server server = new Server();
    private final WebAppContext ctx = new WebAppContext();

    @Inject
    public Jetty(Connector... connectors) throws Exception {
        server.setConnectors(connectors);
        String location = SysUtil.getString("module.location");
        ctx.setContextPath("/");
        ctx.setDescriptor(location + "/WEB-INF/web.xml");
        ctx.setServer(server);
        ctx.setWar(location);
        ctx.setClassLoader(Jetty.class.getClassLoader());
        server.setHandler(ctx);
    }

    public void run() {
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Injector injector = Guice.createInjector(new ServerModule());
        Jetty jetty = injector.getInstance(Jetty.class);
        jetty.run();
    }
}

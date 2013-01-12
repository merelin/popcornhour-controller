package org.dyndns.merelin.pchrc.appserver;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.nio.SelectChannelConnector;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class ServerModule extends AbstractModule {
    @Override
    protected void configure() {
        //bind(Connector.class).to(SelectChannelConnector.class);
    }

    @Provides
    Connector[] provideConnector() {
        Connector connector = new SelectChannelConnector();
        connector.setHost(SysUtil.getString("jetty.host"));
        connector.setPort(SysUtil.getInt("jetty.port"));
        return new Connector[] { connector };
    }
}

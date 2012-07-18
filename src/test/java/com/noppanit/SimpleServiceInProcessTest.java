package com.noppanit;

import org.junit.Before;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author $Author nchar (initial creation)
 * @author $Author: nchar (last modification)
 * @version $Date: 2012-07-18 16-19 4:19 PM
 */
public abstract class SimpleServiceInProcessTest {

    @Before
    public void setUp() throws Exception {
        Server server = new Server();
        SelectChannelConnector connector = new SelectChannelConnector();
        connector.setPort(8888);

        Context context = new Context(server, "/", Context.SESSIONS);

        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.setContextConfigLocation("classpath:/spring-servlet.xml");

        ServletHolder servletHolder = new ServletHolder(dispatcherServlet);
        context.addServlet(servletHolder, "/*");
    }

}

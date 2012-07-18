package com.noppanit;

import com.noppanit.interfaces.SimpleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author $Author nchar (initial creation)
 * @author $Author: nchar (last modification)
 * @version $Date: 2012-07-18 16-39 4:39 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-http-client.xml"})
public class SimpleServiceHttpClientTest extends SimpleServiceInProcessTest {

    @Autowired
    @Qualifier("httpRemotingHelloService")
    private SimpleService simpleService;

    @Test
    public void shouldGet200() throws Exception {
        String helloString = simpleService.sayHelloTo("Toy");
        assertThat(helloString, is("Hallo: Toy"));
    }
}

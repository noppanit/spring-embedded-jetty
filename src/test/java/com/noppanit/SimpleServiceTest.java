package com.noppanit;

import com.noppanit.interfaces.SimpleService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author $Author nchar (initial creation)
 * @author $Author: nchar (last modification)
 * @version $Date: 2012-07-18 16-11 4:11 PM
 */
public class SimpleServiceTest {

    @Test
    public void shouldGetHelloWorld() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-http-config.xml");
        SimpleService simpleService = (SimpleService) context.getBean("simpleService");

        String hello = simpleService.sayHelloTo("Toy");
        assertThat(hello, is("Hallo: Toy"));
    }
}

package com.noppanit.impl;

import com.noppanit.interfaces.SimpleService;

/**
 * @author $Author nchar (initial creation)
 * @author $Author: nchar (last modification)
 * @version $Date: 2012-07-18 16-03 4:03 PM
 */
public class SimpleServiceImpl implements SimpleService {

    public SimpleServiceImpl() {
    }

    @Override
    public String sayHelloTo(String name) {
        return "Hallo: " + name;
    }
}

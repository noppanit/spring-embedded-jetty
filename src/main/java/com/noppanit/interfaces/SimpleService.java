package com.noppanit.interfaces;

import java.io.Serializable;

/**
 * @author $Author nchar (initial creation)
 * @author $Author: nchar (last modification)
 * @version $Date: 2012-07-18 16-02 4:02 PM
 */
public interface SimpleService extends Serializable {

    public String sayHelloTo(String name);
}

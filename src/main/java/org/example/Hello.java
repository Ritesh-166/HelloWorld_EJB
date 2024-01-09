package org.example;

//import jakarta.ejb.Local;

import javax.ejb.Local;
import javax.ejb.Remote;

//@Remote
public interface Hello {

    public String sayHello(String name);
}

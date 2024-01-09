package org.example;

//import jakarta.ejb.Stateless;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;


@Stateless
//@LocalBean
@RequiredArgsConstructor
public class HelloBean implements Hello {
//    @Resource
//    private SessionContext context;

//    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}

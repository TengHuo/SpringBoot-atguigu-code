package teng.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {
    @Value("${person.name}")
    private String name;

    @RequestMapping("sayHello")
    public String sayHello() {
        return "Hello, " + name;
    }
}

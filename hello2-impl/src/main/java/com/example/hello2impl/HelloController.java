package com.example.hello2impl;

import com.example.helloapi.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/api/hello/{name}")
    public String hello(@PathVariable String name) {
        return helloService.hello(name);
    }
}

package com.example.hello2impl;

import com.example.helloapi.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Sawasdee, " + name;
    }
}

package com.malik.ponyapp.service;

import com.malik.model.Hello;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public Hello getGreeting() {
        return new Hello().text("Service: Hello World!");
    }
}

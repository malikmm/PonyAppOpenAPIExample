package com.malik.ponyapp.controller;


import com.malik.api.PonyApi;

import com.malik.model.Hello;
import com.malik.model.Pony;
import com.malik.ponyapp.service.HelloService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PonyController implements PonyApi {

    @Override
    public ResponseEntity<Pony> getUsingGET() {
        return null;
    }

    @Override
    public ResponseEntity<Hello> hello() {
        HelloService hello = new HelloService();
        //return new ResponseEntity<>(new Hello().text("Hello World!"), HttpStatus.OK);
        return new ResponseEntity<>(hello.getGreeting(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Pony> postUsingPOST(Pony pony) {
        return null;
    }
}

package com.malik.ponyapp.controller;


import com.malik.api.PonyApi;

import com.malik.model.Pony;
import org.springframework.http.ResponseEntity;

public class PonyController implements PonyApi {

    @Override
    public ResponseEntity<Pony> getUsingGET() {
        return null;
    }

    @Override
    public ResponseEntity<Pony> postUsingPOST(Pony pony) {
        return null;
    }
}

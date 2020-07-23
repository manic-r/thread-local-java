package com.thread.local.domain.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestRest {

    @GetMapping(value = "/index")
    public String index() {
        return "test";
    }

}

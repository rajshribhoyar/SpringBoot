package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v")
public class ApplicationController {

    @GetMapping
    public String sayHello(){
        return "Hello Rajshri";

    }

}

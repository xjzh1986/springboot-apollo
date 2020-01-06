package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    String port;
    @Value( "${server.url}" )
    String url;

    @GetMapping("index")
    public String index() {
        System.out.println("url === "+url);
        return url;
    }
}

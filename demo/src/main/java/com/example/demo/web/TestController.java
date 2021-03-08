package com.example.demo.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

@RequestMapping(value = "/api/student")
    public String Test (){
        return "OKay";
    }
}

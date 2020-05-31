package com.SpringGradleDemo.Gradledemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){

        return "Greetings from springboot!";
    }
}

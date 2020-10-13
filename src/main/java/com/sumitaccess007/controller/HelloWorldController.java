package com.sumitaccess007.controller;

import com.sumitaccess007.model.HelloWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWorldController {

    private static final String template = "Hello, %s !!! Welcome to the world of SpringBoot";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hello")
    public HelloWorld helloWorld(@RequestParam(value = "name", defaultValue = "World") String name){
        return new HelloWorld(counter.incrementAndGet(),String.format(template,name));
    }
}

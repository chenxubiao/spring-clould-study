package com.chenxb.eureka.consumer.ribbon.controller;

import com.chenxb.eureka.consumer.ribbon.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", required = false, defaultValue = "") String name) {
        return helloService.hiService(name);
    }
}

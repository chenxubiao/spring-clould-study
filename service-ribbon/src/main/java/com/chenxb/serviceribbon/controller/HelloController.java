package com.chenxb.serviceribbon.controller;

import com.chenxb.serviceribbon.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private HelloService helloService;

    @GetMapping("/hi")
    public String hi(String name){
        return helloService.hiService(name);
    }
}

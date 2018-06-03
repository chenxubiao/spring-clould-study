package com.chenxb.eureka.consumer.feign.controller;

import com.chenxb.eureka.consumer.feign.service.HiRemoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private HiRemoteService hiRemoteService;

    @GetMapping("/hello")
    public String hi(@RequestParam(value = "name", required = false, defaultValue = "") String name){
        return hiRemoteService.hi(name);
    }
}

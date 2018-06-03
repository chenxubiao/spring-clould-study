package com.chenxb.eureka.consumer.ribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class HelloService {
    @Resource
    private RestTemplate restTemplate;

    public String hiService(String name){
        return restTemplate.getForObject("http://eureka-producer/hi?name=" + name, String.class);
    }
}

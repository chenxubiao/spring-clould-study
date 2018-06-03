package com.chenxb.eureka.consumer.feign.hystrix.service;

import org.springframework.stereotype.Component;

/**
 * @author: chenxb
 * @date: 2018/06/03
 * @desc:
 */
@Component
public class HiRemoteHystrixImpl implements HiRemoteService {
    @Override
    public String hi(String name) {
        return "hello world";
    }
}

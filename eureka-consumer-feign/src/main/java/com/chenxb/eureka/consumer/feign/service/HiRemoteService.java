package com.chenxb.eureka.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: chenxb
 * @date: 2018/06/03
 * @desc: FeignClient name 服务提供者名称
 */
@FeignClient(name = "eureka-producer")
public interface HiRemoteService {

    /**
     * 使用 FeignClient 客户端调用
     * 客户端接口uri
     * @param name
     * @return
     */
    @GetMapping("/hi")
    String hi(@RequestParam("name") String name);
}

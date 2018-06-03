package com.chenxb.eurka.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HiController {

    @Value("${server.port}")
    private String port;

    @Value("${config.producer.instance:0}")
    private int instance;

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name", required = false, defaultValue = "") String name) {
        return "hi~" + name + ",prot is:" + port;
    }

    /**
     * 测试负载均衡
     * mvn clean package -Dmaven.test.skip=true
     * java -jar eureka-producer-0.0.1-SNAPSHOT.jar --config.producer.instance=1 --server.port=8762
     * java -jar eureka-producer-0.0.1-SNAPSHOT.jar --config.producer.instance=2 --server.port=8763
     * @param name
     * @return
     */
    @GetMapping("/hi/config")
    public String test(@RequestParam(value = "name") String name) {
        return "[" + instance + "],Hello," + name + ",time is " + new Date();
    }
}

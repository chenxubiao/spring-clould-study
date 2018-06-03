package com.chenxb.eurka.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka 服务提供者
 */
@SpringBootApplication
/**
 * 可以不用写 @EnableEurekaClient
 * 禁用： eureka.producer.enabled=false
 */
@EnableEurekaClient
public class EurekaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProducerApplication.class, args);
    }
}

package com.chenxb.eureka.consumer.feign.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EurekaConsumerFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerFeignHystrixApplication.class, args);
    }
}

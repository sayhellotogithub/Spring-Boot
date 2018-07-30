package com.iblogstreet.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderStartApplication.class, args);
    }
}

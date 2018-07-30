package com.iblogstreet.serverbackup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerStartApplication.class, args);
    }
}

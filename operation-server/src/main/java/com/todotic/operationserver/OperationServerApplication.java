package com.todotic.operationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OperationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OperationServerApplication.class, args);
    }

}

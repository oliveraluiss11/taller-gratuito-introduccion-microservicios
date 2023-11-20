package com.todotic.operationms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OperationMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperationMsApplication.class, args);
	}

}

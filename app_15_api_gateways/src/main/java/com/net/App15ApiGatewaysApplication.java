package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class App15ApiGatewaysApplication {

	public static void main(String[] args) {
		SpringApplication.run(App15ApiGatewaysApplication.class, args);
	}

}

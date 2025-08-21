package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class App14AmazonSpringApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(App14AmazonSpringApiGatewayApplication.class, args);
	}

}

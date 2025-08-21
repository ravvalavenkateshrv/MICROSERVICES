package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class App14AmazonSpringRegistryDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(App14AmazonSpringRegistryDiscoveryApplication.class, args);
	}

}

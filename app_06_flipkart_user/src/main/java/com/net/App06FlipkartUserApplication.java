package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class App06FlipkartUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(App06FlipkartUserApplication.class, args);
	}

}

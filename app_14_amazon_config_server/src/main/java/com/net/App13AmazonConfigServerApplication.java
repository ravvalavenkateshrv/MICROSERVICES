package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class App13AmazonConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(App13AmazonConfigServerApplication.class, args);
	}

}

package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class App15SpringConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(App15SpringConfigServerApplication.class, args);
	}

}

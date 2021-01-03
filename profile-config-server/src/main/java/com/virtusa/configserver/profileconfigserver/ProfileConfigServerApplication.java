package com.virtusa.configserver.profileconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ProfileConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileConfigServerApplication.class, args);
	}

}

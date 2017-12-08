package com.atlz.eurekaclientmaxvalue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientMaxvalueApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientMaxvalueApplication.class, args);
	}
}

package com.example.DiscoveryService;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceApplication.class, args);
	}
	//@Bean
	//DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient
	//rdc,
	//DiscoveryLocatorProperties dlp){
	//return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);

}

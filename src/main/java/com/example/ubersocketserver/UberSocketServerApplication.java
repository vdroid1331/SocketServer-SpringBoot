package com.example.ubersocketserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EntityScan("com.example.uberprojectentityservice.models")
@EnableDiscoveryClient
public class UberSocketServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UberSocketServerApplication.class, args);
    }

}

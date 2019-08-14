package com.coop.coopstoreeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CoopStoreEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoopStoreEurekaApplication.class, args);
    }

}

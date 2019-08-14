package com.coop.coopcustomerproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CoopCustomerProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoopCustomerProductApplication.class, args);
    }

}

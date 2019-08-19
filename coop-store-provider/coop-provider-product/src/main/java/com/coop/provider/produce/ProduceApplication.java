package com.coop.provider.produce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.coop.provider.produce.modular.mapper")
public class ProduceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProduceApplication.class, args);
    }

}

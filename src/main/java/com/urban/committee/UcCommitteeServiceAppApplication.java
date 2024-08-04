package com.urban.committee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UcCommitteeServiceAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(UcCommitteeServiceAppApplication.class, args);
    }

}

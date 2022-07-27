package com.anjwoc.studygatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudyGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyGatewayServiceApplication.class, args);
    }

}

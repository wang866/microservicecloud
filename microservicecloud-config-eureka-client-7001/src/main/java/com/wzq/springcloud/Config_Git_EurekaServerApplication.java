package com.wzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: ect
 * @DATE 2019-10-15
 * @descripttion:
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServerApplication.class, args);
    }
}

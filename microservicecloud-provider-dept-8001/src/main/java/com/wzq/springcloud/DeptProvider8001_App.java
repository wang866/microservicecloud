package com.wzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: ect
 * @DATE 2019-10-11
 * @descripttion:
 */
@SpringBootApplication
@EnableEurekaClient  // Eureka 客户端
@EnableDiscoveryClient  // 服务发现，用来获取所有在Eureka中注册的信息
public class DeptProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class, args);
    }
}

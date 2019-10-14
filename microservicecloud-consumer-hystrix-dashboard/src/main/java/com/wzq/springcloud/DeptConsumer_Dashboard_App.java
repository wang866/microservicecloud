package com.wzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: ect
 * @DATE 2019-10-14
 * @descripttion:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_Dashboard_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Dashboard_App.class, args);
    }
}

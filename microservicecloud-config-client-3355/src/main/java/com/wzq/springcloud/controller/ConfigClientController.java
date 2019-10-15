package com.wzq.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ect
 * @DATE 2019-10-15
 * @descripttion:
 */
@RestController
public class ConfigClientController {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;
    @Value("${server.port}")
    private String port;

    @GetMapping("/config")
    public String getConfig(){

        System.out.println("applicationName:"+this.applicationName
                +"eurekaServers:"+this.eurekaServers
                +"port:"+this.port);
        return "applicationName:"+this.applicationName
                +"eurekaServers:"+this.eurekaServers
                +"port:"+this.port;
    }
}

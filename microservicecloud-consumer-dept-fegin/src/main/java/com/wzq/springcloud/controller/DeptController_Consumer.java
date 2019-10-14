package com.wzq.springcloud.controller;

import com.wzq.springcloud.entities.Dept;
import com.wzq.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: ect
 * @DATE 2019-10-12
 * @descripttion:
 */
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @PostMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
       // return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
        return this.service.add(dept);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
       //  return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/"+ id, Dept.class);
        return this.service.get(id);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list() {
        // return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
        return this.service.list();
    }

}

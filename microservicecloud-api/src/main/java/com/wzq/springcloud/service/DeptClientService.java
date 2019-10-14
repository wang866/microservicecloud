package com.wzq.springcloud.service;

import com.wzq.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

// @FeignClient(value="MICROSERVICECLOUD-DEPT")
@FeignClient(value="MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @PostMapping("/dept/add")
    public boolean add(Dept dept);

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    public List<Dept> list();
}

package com.wzq.springcloud.controller;

import com.wzq.springcloud.entities.Dept;
import com.wzq.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author: ect
 * @DATE 2019-10-11
 * @descripttion:
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {

        return service.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = service.get(id);
        if (null == dept) {
            throw new RuntimeException("未找到id为 ：" + id + "的部门");
        }
        return dept;
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {

        return service.list();
    }

    /* *
     * 功能描述: <br>
     * 〈服务发现，可以获取所有在Eureka中注册的服务信息〉
     * @Param: []
     * @Return: java.lang.Object
     * @Author: ect
     * @Date: 2019-10-12 11:48
     */
    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = client.getServices();
        List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-DEPT");

        for (ServiceInstance element :instances){
            System.out.println(element.getServiceId());
            System.out.println(element.getHost());
            System.out.println(element.getPort());
            System.out.println(element.getUri());
        }
        return this.client;

    }
}

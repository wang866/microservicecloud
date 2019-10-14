package com.wzq.springcloud.service;

import com.wzq.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: ect
 * @DATE 2019-10-14
 * @descripttion:
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("该id没有对应的部门信息，consumer提供的降级服务，此刻provider服务已关闭")
                        .setDb_source("this is no database");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}

package com.wzq.springcloud.service;

import com.wzq.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}

package com.wzq.springcloud.service.impl;

import com.wzq.springcloud.dao.DeptDao;
import com.wzq.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wzq.springcloud.service.DeptService;

import java.util.List;

/**
 * @author: ect
 * @DATE 2019-10-11
 * @descripttion:
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;

    @Override
    public boolean addDept(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}

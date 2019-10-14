package com.wzq.springcloud.dao;

import com.wzq.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: ect
 * @DATE 2019-10-11
 * @descripttion:
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long deptno);

    public List<Dept> findAll();
}

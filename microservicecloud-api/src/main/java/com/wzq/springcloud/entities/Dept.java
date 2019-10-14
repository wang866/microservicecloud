package com.wzq.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 使用Lombok组件自动生成entity中的set/get方法
 * @author: ect
 * @DATE 2019-10-11
 * @descripttion:
 */
// @AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno; // 主键
    private String dname; // 部门名称
    private String db_source; // 数据存入到哪个数据库中

    public Dept(String dname) {
        this.dname = dname;
    }
}

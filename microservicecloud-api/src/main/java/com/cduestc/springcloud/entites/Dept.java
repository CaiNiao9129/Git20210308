package com.cduestc.springcloud.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author sh
 * @create 2019-06-10 22:01
 */
@AllArgsConstructor//全参构造函数
@NoArgsConstructor//空参构造函数
@Data//getter和setter方法
@Accessors(chain = true)
public class Dept {

    private long deptno;
    private String dname;
    private String db_source;//来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同的数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
    
    public static void main(String[] args){
        Dept dept = new Dept();
        dept.setDeptno(11L).setDname("RD").setDb_source("DB01");
        System.out.println(dept);
    }
}

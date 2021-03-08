package com.cduestc.springcloud.dao;

import com.cduestc.springcloud.entites.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author sh
 * @create 2019-06-16 16:26
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);
    public Dept findById(long id);
    public List<Dept> findAll();

}

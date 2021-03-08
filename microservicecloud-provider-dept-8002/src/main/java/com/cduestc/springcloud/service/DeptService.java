package com.cduestc.springcloud.service;

import com.cduestc.springcloud.entites.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sh
 * @create 2019-06-16 16:51
 */
@Service
public interface DeptService {

    public boolean addDept(Dept dept);
    public Dept findById(long id);
    public List<Dept> findAll();
}

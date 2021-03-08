package com.cduestc.springcloud.service.impl;

import com.cduestc.springcloud.dao.DeptDao;
import com.cduestc.springcloud.entites.Dept;
import com.cduestc.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sh
 * @create 2019-06-16 16:53
 */
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao dao;
    @Override
    public boolean addDept(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept findById(long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return dao.findAll();
    }
}

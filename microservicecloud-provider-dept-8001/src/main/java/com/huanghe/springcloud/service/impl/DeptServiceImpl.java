package com.huanghe.springcloud.service.impl;

import com.huanghe.springcloud.dao.DeptDao;
import com.huanghe.springcloud.entities.Dept;
import com.huanghe.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author huanghe
 * @Date 2019/6/19 10:23
 * @Description
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept findById(Long deptNo) {
        Dept dept = deptDao.findById(deptNo);
        return dept;
    }

    @Override
    public List<Dept> findAll() {
        List<Dept> deptList = deptDao.findAll();
        return deptList;
    }
}

package com.huanghe.springcloud.controller;

import com.huanghe.springcloud.entities.Dept;
import com.huanghe.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author huanghe
 * @Date 2019/6/17 21:19
 * @Description
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptService deptService;


    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept dept) {
        return   deptService.addDept(dept);
    }
    @RequestMapping(value = "/dept/findById/{deptNo}",method = RequestMethod.GET)
    public Dept findById(Long deptNo) {
        return  deptService.findById(deptNo);
    }

    @RequestMapping(value = "/dept/findAll",method = RequestMethod.GET)
    public List<Dept> findAll() {
        return deptService.findAll();
    }

}

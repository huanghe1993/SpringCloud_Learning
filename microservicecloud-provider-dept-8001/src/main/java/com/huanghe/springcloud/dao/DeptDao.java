package com.huanghe.springcloud.dao;

/**
 * @Author huanghe
 * @Date 2019/6/17 20:58
 * @Description:
 */



import org.apache.ibatis.annotations.Mapper;
import com.huanghe.springcloud.entities.Dept;

import java.util.List;


@Mapper
public interface DeptDao
{
     boolean addDept(Dept dept);

     Dept findById(Long id);

     List<Dept> findAll();
}

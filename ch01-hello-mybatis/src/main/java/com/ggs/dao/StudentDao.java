package com.ggs.dao;

import com.ggs.domain.Student;

import java.util.List;

//接口操作student表
public interface StudentDao {

    //查询student表的所有的数据
    List<Student> selectStudents();
}

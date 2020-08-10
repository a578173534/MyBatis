package com.ggs.dao;

import com.ggs.domain.Student;

public interface StudentDao {

    /**
     * 一个简单类型的参数：
     * 简单类型： mybatis把java的基本数据类型和String都叫简单类型。
     * 在mapper文件获取简单类型的一个参数的值，使用 #{任意字符}
     */
    Student selectStudentById(Integer id);
}

package com.ggs.dao;

import com.ggs.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudents();

    int insertStudent(Student student);
}

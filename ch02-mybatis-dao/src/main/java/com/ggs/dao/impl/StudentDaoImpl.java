package com.ggs.dao.impl;

import com.ggs.dao.StudentDao;
import com.ggs.domain.Student;
import com.ggs.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudents() {

        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.ggs.dao.StudentDao.selectStudents";

        //执行sql语句， 使用SqlSession类的方法
        List<Student> students = sqlSession.selectList(sqlId);

        //关闭
        sqlSession.close();
        return students;
    }

    @Override
    public int insertStudent(Student student) {

        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.ggs.dao.StudentDao.insertStudent";

        //执行sql语句， 使用SqlSession类的方法
        int nums = sqlSession.insert(sqlId, student);

        //提交事务
        sqlSession.commit();

        //关闭
        sqlSession.close();
        return nums;
    }
}

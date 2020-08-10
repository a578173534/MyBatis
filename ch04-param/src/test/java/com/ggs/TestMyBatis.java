package com.ggs;

import com.ggs.dao.StudentDao;
import com.ggs.domain.Student;
import com.ggs.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestMyBatis {
    @Test
    public void testSelectStudentById() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = dao.selectStudentById(1001);
        System.out.println("student=" + student);
    }
}

package com.ggs;

import com.ggs.dao.StudentDao;
import com.ggs.domain.Student;
import com.ggs.utils.MyBatisUtils;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMyBatis {
    @Test
    public void testSelectStudentIf() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        //student.setName("李四");
        //student.setAge(18);

        //student.setName("李四");
        student.setAge(18);

        List<Student> students = dao.selectStudentIf(student);
        for (Student stu : students) {
            System.out.println("if===" + stu);
        }
    }

    @Test
    public void testSelectStudentWhere() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        //student.setName("李四");
        //student.setAge(18);

        List<Student> students = dao.selectStudentWhere(student);
        for (Student stu : students) {
            System.out.println("where===" + stu);
        }
    }

    @Test
    public void testSelectForEach() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);

        List<Student> students = dao.selectForeachOne(list);
        for (Student stu : students) {
            System.out.println("foreach--one ===" + stu);
        }
    }

    @Test
    public void testSelectForTwo() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> stuList = new ArrayList<>();
        Student s1 = new Student();
        s1.setId(1002);
        stuList.add(s1);

        s1 = new Student();
        s1.setId(1005);
        stuList.add(s1);

        List<Student> students = dao.selectForeachTwo(stuList);
        for (Student stu : students) {
            System.out.println("foreach--two ===" + stu);
        }
    }

    @Test
    public void testSelectAllPageHelper() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        // 加入PageHelper的方法，分页
        // pageNum：第几页，从1开始
        // pageSize：一页中有多少行数据
        PageHelper.startPage(3, 3);

        List<Student> students = dao.selectAll();
        for (Student stu : students) {
            System.out.println("foreach--one ===" + stu);
        }
    }
}

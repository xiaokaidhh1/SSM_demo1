package com.kai.service.impl;

import com.kai.dao.StudentDao;
import com.kai.domain.Student;
import com.kai.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    //引用类型的自动注入
    @Resource
    private StudentDao studentDao;


    @Override
    public int addstudent(Student student) {
        int nums = studentDao.insertstudent(student);
        return nums;

    }

    @Override
    public List<Student> findstudent() {
        return studentDao.selectStudent();
    }
}


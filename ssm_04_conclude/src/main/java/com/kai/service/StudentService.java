package com.kai.service;

import com.kai.dao.StudentDao;
import com.kai.domain.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

public interface StudentService {
    int addstudent(Student student);

    List<Student> findstudent();

}

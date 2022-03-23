package com.kai.dao;

import com.kai.domain.Student;
import org.springframework.stereotype.Component;

import java.util.List;

public interface StudentDao {
    int insertstudent(Student student);
    List<Student> selectStudent();

}


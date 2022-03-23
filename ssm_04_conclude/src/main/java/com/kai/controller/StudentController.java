package com.kai.controller;

import com.kai.domain.Student;
import com.kai.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;
    //注册学生

    @RequestMapping("/addStudent.do")
    public ModelAndView addStudents(Student student) {
        ModelAndView mv = new ModelAndView();
        //调用service处理student
        String tips = "注册失败";
        int nums = studentService.addstudent(student);
        if(nums>0){
            //z注册成功
            tips = "学生【" + student.getName() + "】注册成功";
        }
        //添加数据
        mv.addObject("tips", tips);
        //指定结构页面
        mv.setViewName("result");
        return mv;
    }

    //响应ajax，处理查询
    @RequestMapping("/queryStudent.do")
    @ResponseBody
    public List<Student> queryStudent(){
        List<Student> students = studentService.findstudent();
        return students;
    }

}

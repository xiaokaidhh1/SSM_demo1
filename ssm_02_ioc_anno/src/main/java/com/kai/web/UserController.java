package com.kai.web;

import com.kai.config.SpringCofiguration;
import com.kai.service.UserService;
import com.kai.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringCofiguration.class);
        UserService userService =  context.getBean(UserService.class);
        userService.save();
//        context.close();

    }

}

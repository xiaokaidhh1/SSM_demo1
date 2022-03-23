package com.kai.service.impl;

import com.kai.dao.UserDao;
import com.kai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service("userService")
//@Scope("prototype")//使用多个
public class UserServiceImpl implements UserService {
    @Value("${jdbc.driver}")
    private String dirver;

//    @Autowired
//    @Qualifier("userDao") //按照id值从容器中进行匹配的，但是主要结合@Autowired

    @Resource(name = "userDao")//相当于 上述两个一起的效果
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("saving");
        System.out.println(dirver);
    }

    @PostConstruct
    public void init(){
        System.out.println("Service对象的初始化方法");

    }
    @PreDestroy
    public void destory(){
        System.out.println("Service对象的销毁方法");
    }
}

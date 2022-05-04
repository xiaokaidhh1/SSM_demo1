package com.kai.service.impl;

import com.kai.dao.UserDao;
import com.kai.pojo.User;
import com.kai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {
    @Autowired
    //登录
    private UserDao userDao;
    @Override
    public int login(User user) {
        int num = userDao.loginQuery(user);
        return num;
    }

    //注册
    public int register(User user) {
        int nums = userDao.addUser(user);
        return nums;
    }


}

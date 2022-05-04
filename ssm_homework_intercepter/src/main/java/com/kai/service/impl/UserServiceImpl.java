package com.kai.service.impl;

import com.kai.dao.UserDao;
import com.kai.pojo.User;
import com.kai.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    //登录
    @Override
    public int login(User user) {
        int num = userDao.loginQuery(user);
        return num;
    }

    //注册
    @Override
    public int register(User user) {
        int nums = userDao.addUser(user);
        return nums;
    }

    //用户列表
    @Override
    public List<User> userlist() {
        return userDao.userListQuery();
    }
}

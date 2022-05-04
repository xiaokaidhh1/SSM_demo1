package com.kai.service;

import com.kai.pojo.User;

import java.util.List;

public interface UserService {
    //登录
    int login(User user);
    //注册
    int register(User user);
    //用户列表
    List<User> userlist();
}

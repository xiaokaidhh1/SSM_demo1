package com.kai.service;

import com.kai.pojo.User;

public interface UserService {
    //登录
    int login(User user);
    //注册
    int register(User user);
}

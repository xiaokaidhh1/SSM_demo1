package com.kai.dao;

import com.kai.pojo.User;


public interface UserDao {
 //登录
 int loginQuery(User user);

 //注册
 int addUser(User user);
}

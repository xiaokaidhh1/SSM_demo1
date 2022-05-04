package com.kai.dao;

import com.kai.pojo.User;

import java.util.List;


public interface UserDao {
 //登录
 int loginQuery(User user);

 //注册
 int addUser(User user);

 //用户列表查看
 List<User> userListQuery();
}

<%--
  Created by IntelliJ IDEA.
  User: xiaokai
  Date: 2022/4/26
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>

<h>登录</h>

<form action="user/login.do" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="text" name="password">
    <input type="submit" value="登录">
</form>
<a href="addUser.jsp">用户注册</a>
</body>
</html>

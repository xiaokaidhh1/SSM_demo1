<%--
  Created by IntelliJ IDEA.
  User: xiaokai
  Date: 2022/4/29
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<div align="center">
    <form action="user/register.do" method="post">
        <table>
            <tr>
                <td>用户名 <id><input type="text" name="username"> </id></td>
            </tr>
                <td>密码 <id><input type="password" name="password"> </id></td>
            </tr>
            <tr>

                <td>&nbsp;&nbsp;&nbsp;</td>
                <td><input type="submit" value="注册"></td>

            </tr>
        </table>
    </form>
</div>

</body>
</html>

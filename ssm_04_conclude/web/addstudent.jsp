<%--
  Created by IntelliJ IDEA.
  User: xiaokai
  Date: 2022/3/15
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServletPath() +":"+ request.getContextPath() + "/";
%>

<html>
<head>
    <title>注册学生</title>
    <base herf="<%=basePath%>">
</head>
<body>
<div align="center">
    <form action="student/addStudent.do" method="post">
    <table>
        <tr>
            <td>名字： <id><input type="text" name="name"> </id></td>
        </tr>
        <td>年龄： <id><input type="text" name="age"> </id></td>
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

<%--
  Created by IntelliJ IDEA.
  User: xiaokai
  Date: 2022/4/28
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件提交</title>
</head>
<body>
    <form action="uploadfile.do"   method="post" enctype="multipart/form-data">
        <input type="file" name="photo">
        <input type="submit" name="提交">

    </form>
</body>
</html>

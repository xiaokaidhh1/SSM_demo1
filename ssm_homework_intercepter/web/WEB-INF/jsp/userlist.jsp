<%--
  Created by IntelliJ IDEA.
  User: xiaokai
  Date: 2022/3/16
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>用户列表</title>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="js/jquery-1.11.3/jquery.min.js"></script>
    <script type="text/javascript">
        $(function() {
            loadUserData();
            $("#btnloader").click(function () {
                loadUserData();

            })
        })

        function loadUserData() {
            $.ajax({
                url:"user/userlist.do",
                type:"get",
                dataType:"json",
                success:function (data) {
                    //清楚旧数据
                    $("#info").html("");
                    //增加新数据
                    $.each(data,function (i,n) {
                        $("#info").append("<tr>")
                            .append("<td>"+n.id+"</td>")
                            .append("<td>"+n.username+"</td>")
                            .append("<td>"+n.password+"</td>")
                            .append("<tr>")

                    })
                }
            })

        }

    </script>
</head>
<body>

结果：${tips}
<a href="user/logout.do">退出</a>

<div align="center">
    <table>
        <thead>
        <tr>
            <td>id</td>
            <td>用户名</td>
            <td>密码</td>
        </tr>
        </thead>
        <tbody id="info">


        </tbody>
    </table>
    <input type="button" id="btnloader" value="查寻数据">
</div>

</body>
</html>

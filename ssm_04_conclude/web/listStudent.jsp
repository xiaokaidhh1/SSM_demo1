<%--
  Created by IntelliJ IDEA.
  User: xiaokai
  Date: 2022/3/16
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServletPath() +":"+ request.getContextPath() + "/";
%>
<html>
<head>
    <title>查询学生ajax</title>
    <script type="text/javascript" src="js/jquery-1.11.3/jquery.js"></script>
    <script type="text/javascript">
    $(function() {
        //在当前页面加载后，执行loadStudentData()
        loadStudentData();
        $("#btnloader").click(function () {
            loadStudentData();

        })
    })
        
        function loadStudentData() {
            $.ajax({
                url:"student/queryStudent.do",
                type:"get",
                dataType:"json",
                success:function (data) {
                    //清楚旧数据
                    $("#info").html("");
                    //增加新数据
                    $.each(data,function (i,n) {
                        $("#info").append("<tr>")
                            .append("<td>"+n.id+"</td>")
                            .append("<td>"+n.name+"</td>")
                            .append("<td>"+n.age+"</td>")
                            .append("<tr>")

                    })
                }
            })

        }

    </script>
</head>
<body>
<div align="center">
    <table>
        <thead>
            <tr>
                <td>学号</td>
                <td>姓名</td>
                <td>年龄</td>
            </tr>
        </thead>
        <tbody id="info">


        </tbody>
    </table>
    <input type="button" id="btnloader" value="查寻数据">
</div>

</body>
</html>

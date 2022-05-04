<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${links}" var="link" varStatus="sta">
    <a href="${link}">${names[sta.index]}</a><br/>
</c:forEach>
</body>
</html>
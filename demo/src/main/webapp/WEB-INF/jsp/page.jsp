<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springboot 使用jsp</title>
</head>
<body>
<table style="border-radius: initial;">
    <thead>
    <th>姓名</th>
    <th>年龄</th>
    <th>性别</th>
    </thead>
    <tbody>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.gender}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
jsp page<br>
</body>
</html>

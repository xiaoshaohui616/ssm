<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11408
  Date: 2023/4/17
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>xing</td>
        <td>nianling</td>
    </tr>
    <tr>
        <c:forEach items="${students}" var="s">
            <td>${s.stuname}</td>
            <td>${s.stuage}</td>
        </c:forEach>
    </tr>
</table>
</body>
</html>

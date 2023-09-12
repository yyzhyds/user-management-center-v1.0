<%@ page import="java.util.List" %>
<%@ page import="demo.entity.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 24/5/2023
  Time: 下午6:53
  To change this template use File | Settings | File Templates.

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL标签库</title>
</head>
<body>
<%
    List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        request.setAttribute("list",list);
%>

    <c:forEach items="${list}" var="num">
        <h1>${num}</h1>
    </c:forEach>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 26/4/2023
  Time: 上午10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="zh-cn">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>后台管理中心</title>
    <jsp:include page="/html/link.jsp"></jsp:include>
</head>

<body style="background-color:#f2f9fd;">
<!-- 头部区域 -->
<jsp:include page="/html/header.jsp"></jsp:include>
<!-- 左侧导航 -->
<jsp:include page="/html/leftnav.jsp"></jsp:include>
<!-- 面包屑导航 -->
<jsp:include page="/html/bread.jsp"></jsp:include>
<!-- 右侧主体区域 -->
<div class="admin">
    <%--    <%= request.getAttribute("list")%>--%>
    <%--    <!-- 用户或src属性引入一个其他的html页面 -->--%>
    <%--    <iframe src="stuAdd.html" scrolling="auto" rameborder="0"  name="right" width="100%" height="100%"></iframe>--%>

    <div class="panel admin-panel">
        <div class="panel-head">
            <strong class="icon-reorder"> 欢迎您，</strong>
            <strong>${user.username}</strong>
            <strong>早上好！</strong>
        </div>
        <div class="body-content">
            <h1 style="margin-left: 50px;">。。。。</h1>
        </div>
        <div>
            <img src="../images/bg640.jpg" alt="">
        </div>
    </div>


</div>
</body>

</html>

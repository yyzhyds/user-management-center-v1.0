<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 24/5/2023
  Time: 上午8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 左侧导航 -->
<div class="leftnav">
    <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
    <h2><span class="icon-user"></span>学生管理</h2>
    <ul style="display:block">
        <li><a href="/html/stuList.jsp" target="right"><span class="icon-caret-right"></span>学生信息</a></li>
        <li><a href="/html/stuAdd.jsp" target="right"><span class="icon-caret-right"></span>添加学生</a></li>
    </ul>
    <!-- <h2><span class="icon-pencil-square-o"></span>班级管理</h2>
    <ul>
        <li><a href="add.html" target="right"><span class="icon-caret-right"></span>添加班级</a></li>
        <li><a href="list.html" target="right"><span class="icon-caret-right"></span>内容管理</a></li>
        <li><a href="cate.html" target="right"><span class="icon-caret-right"></span>分类管理</a></li>
    </ul> -->
    <h2><span class="icon-pencil-square-o"></span>用户管理</h2>
    <ul style="display:block">
        <li><a href="${pageContext.request.contextPath}/user" target="right"><span class="icon-caret-right"></span>用户信息</a></li>
        <li><a href="${pageContext.request.contextPath}/html/add.jsp" target="right"><span class="icon-caret-right"></span>添加用户</a></li>
        <li><a href="${pageContext.request.contextPath}/html/pass.jsp" target="right"><span class="icon-caret-right"></span>修改密码</a></li>
    </ul>
</div>

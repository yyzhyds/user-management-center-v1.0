<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 24/5/2023
  Time: 上午11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="zh-cn">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>添加用户</title>
    <jsp:include page="link.jsp"></jsp:include>
</head>

<body>
<!-- 头部区域 -->
<jsp:include page="header.jsp"></jsp:include>
<!-- 左侧导航 -->
<jsp:include page="leftnav.jsp"></jsp:include>
<!-- 面包屑导航 -->
<jsp:include page="bread.jsp"></jsp:include>
<div class="admin">
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 添加用户</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="/addUser">
            <div class="form-group">
                <div class="label">
                    <label>用户名：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="username" value="" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>密码：</label>
                </div>
                <div class="field">
                    <input type="password" class="input w50" name="password" value="" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>确认密码：</label>
                </div>
                <div class="field">
                    <input type="password" class="input w50" name="pass" value="" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>手机：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="s_phone" value="" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>Email：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="s_email" value="" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                </div>
            </div>
            <p>${msg}</p>
        </form>
    </div>
</div>
</body>

</html>
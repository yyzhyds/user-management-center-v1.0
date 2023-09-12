<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 24/5/2023
  Time: 上午11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-cn">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>修改密码</title>
    <jsp:include page="link.jsp"></jsp:include>
</head>

<body>
<jsp:include page="header.jsp"></jsp:include>
<!-- 左侧导航 -->
<jsp:include page="leftnav.jsp"></jsp:include>
<!-- 面包屑导航 -->
<jsp:include page="bread.jsp"></jsp:include>
<div class="admin">
    <div class="panel-head"><strong><span class="icon-key"></span> 修改用户密码</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="">
            <div class="form-group">
                <div class="label">
                    <label for="sitename">管理员帐号：</label>
                    <label for="sitename">新密码：</label>
                </div>
                <div class="field">
                    <label style="line-height:33px;">
                        admin
                    </label>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label for="mpass">原始密码：</label>
                </div>
                <div class="field">
                    <input type="password" class="input w50" id="mpass" name="mpass" size="50" placeholder="请输入原始密码"
                           data-validate="required:请输入原始密码" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">

                </div>
                <div class="field">
                    <input type="password" class="input w50" name="newpass" size="50" placeholder="请输入新密码"
                           data-validate="required:请输入新密码,length#>=5:新密码不能小于5位" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label for="sitename">确认新密码：</label>
                    <span id="sitename"></span>
                </div>
                <div class="field">
                    <input type="password" class="input w50" name="renewpass" size="50" placeholder="请再次输入新密码"
                           data-validate="required:请再次输入新密码,repeat#newpass:两次输入的密码不一致" />
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
        </form>
    </div>
</div>
</body>

</html>
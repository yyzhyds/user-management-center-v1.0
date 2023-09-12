<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 10/5/2023
  Time: 上午9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="zh-cn">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>后台管理中心</title>

    <jsp:include page="link.jsp"></jsp:include>
</head>

<body style="background-color:#f2f9fd;">
<!-- 头部区域 -->
<jsp:include page="header.jsp"></jsp:include>
<!-- 左侧导航 -->
<jsp:include page="leftnav.jsp"></jsp:include>
<!-- 面包屑导航 -->
<jsp:include page="bread.jsp"></jsp:include>
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
            <h1 style="margin-left: 50px;" id = "time"></h1>
            <h1 style="margin-left: 50px;" id="time2"></h1>
        </div>

        <div>
            <img src="../images/bg640.jpg" alt="">
        </div>
    </div>


</div>
<script type="text/javascript">
    var getNowFormatDate = function getNowFormatDate() {
        var date = new Date();
        var month = date.getMonth() + 1;
        var strDate = date.getDate();
        if(month >= 1 && month <= 9) {
            month = "0" + month;
        }
        if (strDate >= 0 && strDate <= 9) {
            strDate = "0" + strDate;
        }
        var currentdate = date.getFullYear() + '年' + month + '月' + strDate
            + "日"+" " + date.getHours() + ':' + date.getMinutes()
            ;
        return currentdate;
    }
    var getTime2 = function geTime2(){
        var date = new Date();
        var hour = 18 - date.getHours();
        var str = '距离下班还有：'+ hour +'小时';
        var result = (hour > 0)? str : '下班了';

        return result;
    }
    console.log('毫秒数:' + new Date().getTime());
    document.getElementById("time").innerHTML = '当前系统时间：'+ getNowFormatDate();
    document.getElementById("time2").innerHTML = getTime2();
</script>

</body>

</html>
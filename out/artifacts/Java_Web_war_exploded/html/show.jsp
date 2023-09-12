<%@ page import="java.util.List" %>
<%@ page import="demo.entity.User" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%!
    //private Object User;
    private Object List;
%><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 24/5/2023
  Time: 上午9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<html lang="zh-cn">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>用户信息</title>

    <jsp:include page="link.jsp"></jsp:include>
</head>

<body>
<!-- 头部区域 -->
<jsp:include page="header.jsp"></jsp:include>
<!-- 左侧导航 -->
<jsp:include page="leftnav.jsp"></jsp:include>
<!-- 面包屑导航 -->
<jsp:include page="bread.jsp"></jsp:include>
<!-- 右侧主体区域 -->
<%--<%=request.getAttribute("list")%>--%>
<div class="admin">
<%--    <%=request.getAttribute("list")%>--%>
    <form method="post" action="">
        <div class="panel admin-panel">
            <div class="panel-head"><strong class="icon-reorder"> 用户信息</strong></div>
            <div class="padding border-bottom">
                <ul class="search">
                    <li>
                        <button type="button" class="button border-green" id="checkall"><span class="icon-check"></span>
                            全选</button>
                        <button type="submit" class="button border-red"><span class="icon-trash-o"></span> 批量删除</button>
                    </li>
                </ul>
            </div>
            <table class="table table-hover text-center">
                <tr>
                    <th width="120">ID</th>
                    <th>用户名</th>
                    <th>手机</th>
                    <th>邮箱</th>
                    <th>操作</th>

                </tr>
                    <c:forEach var="user" items="${requestScope.list}" varStatus="vs">
                        <tr>
                            <td>
                                <input type="checkbox" name="id[]" value="1" />${vs.count}
                            </td>
                            <td>${user.username}</td>
                            <td>${user.userPhone}</td>
                            <td>${user.userMail}</td>
                            <td>
                                <div class="button-group">
<%--
                                    < href="${pageContext.request.contextPath}/deleteUser?id=${user.id}">
--%>                            <a class="button border-main" href="${pageContext.request.contextPath}/user?id=${user.id}" style="border-right: 0;">
                                    <span class="icon-edit"></span>修改
                                </a>
                                    <a class="button border-red" href="javascript:;" onclick="return del(${user.id})">
                                        <span class="icon-trash-o"></span> 删除</a>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
<%--                <%--%>

<%--                List<User> list = (List)request.getAttribute("list");--%>
<%--                for (int i = 0 ; i < list.size();i++) {--%>

<%--                %>--%>

<%--                <tr>--%>
<%--                    <td>--%>
<%--                        <input type="checkbox" name="id[]" value="1" /><%= list.get(i).getId()%>--%>
<%--                    </td>--%>

<%--                    <td><%=list.get(i).getUsername()%></td>--%>
<%--                    <td><%=list.get(i).getPassword()%></td>--%>
<%--                    <td><%=list.get(i).getUserMail()%></td>--%>
<%--                    <td>--%>
<%--                        <div class="button-group">--%>
<%--                            <a class="button border-red" href="javascript:void(0)" onclick="return del(<%= list.get(i).getId()%>)">--%>
<%--                                <span class="icon-trash-o"></span> 删除</a>--%>
<%--                        </div>--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <% }%>--%>
                <tr>
                    <td colspan="8">
                        <div class="pagelist">
                            <a href="">上一页</a>
                            <span class="current">1</span>
                            <a href="">2</a>
                            <a href="">3</a>
                            <a href="">下一页</a>
                            <a href="">尾页</a>
                        </div>
                    </td>
                </tr>
            </table>
        </div>
    </form>
    <script type="text/javascript">

        function del(id) {
            if (confirm("您确定要删除吗?")) {
                location.href="${pageContext.request.contextPath}/deleteUser?id="+id;
                // confirm("未开发。。")
               <%
                 // List<User> list1 = (List)request.getAttribute("list");

               %>
<%--                <%=list.get(list.size()).setId(4);%>--%>
            }
        }

        $("#checkall").click(function () {
            $("input[name='id[]']").each(function () {
                if (this.checked) {
                    this.checked = false;
                }
                else {
                    this.checked = true;
                }
            });
        })

        function DelSelect() {
            var Checkbox = false;
            $("input[name='id[]']").each(function () {
                if (this.checked == true) {
                    Checkbox = true;
                }
            });
            if (Checkbox) {
                var t = confirm("您确认要删除选中的内容吗？");
                if (t == false) return false;
            }
            else {
                alert("请选择您要删除的内容!");
                return false;
            }
        }

    </script>
</div>
</body>

</html>

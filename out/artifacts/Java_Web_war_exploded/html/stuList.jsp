<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 24/5/2023
  Time: 下午3:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-cn">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>学生列表</title>
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
    <form method="post" action="" id="listform">
        <div class="panel admin-panel">
            <div class="panel-head"><strong class="icon-reorder">学生信息列表</strong></div>
            <div class="padding border-bottom">
                <ul class="search" style="padding-left:10px;">
                    <li>
                        <input type="text" placeholder="请输入搜索关键字" name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
                        <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()">
                            搜索
                        </a>
                    </li>
                </ul>
            </div>
            <table class="table table-hover text-center">
                <thead>
                <tr>
                    <th width="100" style="text-align:left; padding-left:20px;">序号</th>
                    <th>学生照片</th>
                    <th>学生姓名</th>
                    <th>学生年龄</th>
                    <th>学生班级</th>
                    <th>地址</th>
                    <th>入学时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td style="text-align:left; padding-left:20px;">
                        <input type="checkbox" name="id[]" value="" />1
                    </td>
                    <td width="10%"><img src="../images/11.jpg" alt="" width="70" height="50"/></td>
                    <td>小明</td>
                    <td>18</td>
                    <td>java01</td>
                    <td>北京市朝阳区</td>
                    <td>2016-07-01</td>
                    <td>
                        <div class="button-group">
                            <a class="button border-main" href="add.html">
                                <span class="icon-edit"></span>修改
                            </a>
                            <a class="button border-red" href="javascript:void(0)" onclick="return del(1,1,1)">
                                <span class="icon-trash-o"></span>删除
                            </a>
                        </div>
                    </td>
                </tr>

                <!-- 分页底部 -->
                <tr>
                    <td style="text-align:left; padding:19px 0;padding-left:20px;">
                        <input type="checkbox" id="checkall" />全选
                    </td>
                    <td colspan="7" style="text-align:left;padding-left:20px;">
                        <a href="javascript:void(0)" class="button border-red icon-trash-o" style="padding:5px 15px;" onclick="DelSelect()">
                            删除
                        </a>
                        <a href="javascript:void(0)" style="padding:5px 15px; margin:0 10px;" class="button border-blue icon-edit" onclick="sorts()">
                            排序
                        </a>
                    </td>
                </tr>
                <tr>
                    <td colspan="8">
                        <div class="pagelist">
                            <a href="">上一页</a> <span class="current">1</span>
                            <a href="">2</a><a href="">3</a>
                            <a href="">下一页</a><a href="">尾页</a>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </form>
    <script type="text/javascript">

        //搜索
        function changesearch() {

        }

        //单个删除
        function del(id, mid, iscid) {
            if (confirm("您确定要删除吗?")) {

            }
        }

        //全选
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

        //批量删除
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
                $("#listform").submit();
            }
            else {
                alert("请选择您要删除的内容!");
                return false;
            }
        }

        //批量排序
        function sorts() {
            var Checkbox = false;
            $("input[name='id[]']").each(function () {
                if (this.checked == true) {
                    Checkbox = true;
                }
            });
            if (Checkbox) {

                $("#listform").submit();
            }
            else {
                alert("请选择要操作的内容!");
                return false;
            }
        }


        //批量首页显示
        function changeishome(o) {
            var Checkbox = false;
            $("input[name='id[]']").each(function () {
                if (this.checked == true) {
                    Checkbox = true;
                }
            });
            if (Checkbox) {

                $("#listform").submit();
            }
            else {
                alert("请选择要操作的内容!");

                return false;
            }
        }

        //批量推荐
        function changeisvouch(o) {
            var Checkbox = false;
            $("input[name='id[]']").each(function () {
                if (this.checked == true) {
                    Checkbox = true;
                }
            });
            if (Checkbox) {


                $("#listform").submit();
            }
            else {
                alert("请选择要操作的内容!");

                return false;
            }
        }

        //批量置顶
        function changeistop(o) {
            var Checkbox = false;
            $("input[name='id[]']").each(function () {
                if (this.checked == true) {
                    Checkbox = true;
                }
            });
            if (Checkbox) {

                $("#listform").submit();
            }
            else {
                alert("请选择要操作的内容!");

                return false;
            }
        }


        //批量移动
        function changecate(o) {
            var Checkbox = false;
            $("input[name='id[]']").each(function () {
                if (this.checked == true) {
                    Checkbox = true;
                }
            });
            if (Checkbox) {

                $("#listform").submit();
            }
            else {
                alert("请选择要操作的内容!");

                return false;
            }
        }

        //批量复制
        function changecopy(o) {
            var Checkbox = false;
            $("input[name='id[]']").each(function () {
                if (this.checked == true) {
                    Checkbox = true;
                }
            });
            if (Checkbox) {
                var i = 0;
                $("input[name='id[]']").each(function () {
                    if (this.checked == true) {
                        i++;
                    }
                });
                if (i > 1) {
                    alert("只能选择一条信息!");
                    $(o).find("option:first").prop("selected", "selected");
                } else {

                    $("#listform").submit();
                }
            }
            else {
                alert("请选择要复制的内容!");
                $(o).find("option:first").prop("selected", "selected");
                return false;
            }
        }

    </script>
</div>

</body>

</html>
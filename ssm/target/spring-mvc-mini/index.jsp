<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()
            +":"+request.getServerPort()+path+"/";
    //将path放到页作用域中,方便使用el表达式调用
    pageContext.setAttribute("app_path",path);
%>

<html>
<head>
    <title>all</title>
    <script type="text/javascript"
            src="${app_path}/js/jquery-3.2.1.js">
    </script>
    <link
            href="${app_path}/static/css/bootstrap.min.css"
            rel="stylesheet">
    <script
            src="${app_path}/static/js/bootstrap.min.js">
    </script>
</head>
<body>
    <table class="table table-hover">
        <thead>
        <button type="button" class="btn btn-success pull-right">新增</button>
        <button type="button" class="btn btn-danger pull-right">删除</button>
        <tr>
            <th><input type="checkbox"/></th>
            <th>项目编号(#)</th>
            <th>项目名称</th>
            <th>开始日期</th>
            <th>结束日期</th>
            <th>申报状态</th>
            <th>申报人</th>
            <th>性别</th>
            <th>工作年限</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th><input type="checkbox"/></th>
            <td>1</td>
            <td>jokereven</td>
            <td>2005-11-01</td>
            <td>2025-11-01</td>
            <td>2</td>
            <td>jack</td>
            <td>男</td>
            <td>4</td>
            <td>
                <button type="button" class="btn btn-primary">编辑</button>
                <button type="button" class="btn btn-danger">删除</button>
            </td>
        </tr>
        <tr>
            <th><input type="checkbox"/></th>
            <td>2</td>
            <td>zhoujing</td>
            <td>2005-11-01</td>
            <td>2025-11-01</td>
            <td>2</td>
            <td>jack</td>
            <td>男</td>
            <td>4</td>
            <td>
                <button type="button" class="btn btn-primary">编辑</button>
                <button type="button" class="btn btn-danger">删除</button>
            </td>
        </tr>
        </tbody>
    </table>
</body>
</html>
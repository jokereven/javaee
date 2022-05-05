<%--
  Created by IntelliJ IDEA.
  User: jokereven
  Date: 2022/5/4
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%--需要添加isELIgnored设置为false不 after 页面报 500--%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    my name is jokereven
    <br/>
    键值对传递的名字为：${current_name}
    <br/>
    直接传递的名字为：${string} + 如果有多个匿名字段，不合适
    <br/>
    键值对传递的对象为：${current_user.id} + ${current_user.uAge} + ${current_user.uName}
    <br/>
    直接传递的对象为：${user.id} + ${user.uAge}+${user.uName}
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: jokereven
  Date: 2022/4/29
  Time: 15:03
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
    注册账号信息为: ${account}, 密码为${password}
</body>
</html>

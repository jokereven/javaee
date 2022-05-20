<%--
  Created by IntelliJ IDEA.
  User: jokereven
  Date: 2022/5/20
  Time: 8:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()
            +":"+request.getServerPort()+path+"/";
    //将path放到页作用域中,方便使用el表达式调用
    pageContext.setAttribute("APP_PATH",path);
%>
<html>
<head>
    <title>all</title>
</head>
<body>
    this is all
</body>
</html>

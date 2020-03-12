<%--
  Created by IntelliJ IDEA.
  User: x6760
  Date: 2020-3-3
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h1>Welcome to Library, ${user.username}</h1>

<a href="${pageContext.request.contextPath}/user/login">登录</a>
<a href="${pageContext.request.contextPath}/book/all">进入书籍展示页面</a>
</body>
</html>

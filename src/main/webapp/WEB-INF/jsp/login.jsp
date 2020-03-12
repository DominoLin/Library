<%--
  Created by IntelliJ IDEA.
  User: x6760
  Date: 2020-3-8
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    学号：<input type="text" name="id" required maxlength="24"/><br>
    密码：<input type="password" name="password" required maxlength="24"/><br>
    <button type="submit">提交</button>

</form>

</body>
</html>

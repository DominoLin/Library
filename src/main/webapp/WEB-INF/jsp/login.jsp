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
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>登陆界面</title>
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="../static/favicon.ico" type="image/x-icon" />
    <link href="https://fonts.googleapis.com/css?family=Nunito+Sans:300,400,600,700,800" rel="stylesheet">
    <link rel="stylesheet" href="../static/plugins/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../static/plugins/fontawesome-free/css/all.min.css">
    <link rel="stylesheet" href="../static/plugins/ionicons/dist/css/ionicons.min.css">
    <link rel="stylesheet" href="../static/plugins/icon-kit/dist/css/iconkit.min.css">
    <link rel="stylesheet" href="../static/plugins/perfect-scrollbar/css/perfect-scrollbar.css">
    <link rel="stylesheet" href="../static/dist/css/theme.min.css">
    <script src="../static/src/js/vendor/modernizr-2.8.3.min.js"></script>
</head>
<body>
<div class="auth-wrapper">
    <div class="container-fluid h-100">
        <div class="row flex-row h-100 bg-white">
            <div class="col-xl-8 col-lg-6 col-md-5 p-0 d-md-block d-lg-block d-sm-none d-none">
                <div class="lavalite-bg" style="background-image: url('../static/img/auth/login.jpg')">
                </div>
            </div>
            <div class="col-xl-4 col-lg-2 col-md-7 my-auto p-0">
                <div class="authentication-form mx-auto">
                    <h2>登录</h2>
                    <p>Happy to see you again!</p>
                    <form action="${pageContext.request.contextPath}/admin/login" method="post">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="请输入账号" required="" name="admin_id">
                            <i class="ik ik-user"></i>
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="请输入密码" required="" name="password">
                            <i class="ik ik-lock"></i>
                        </div>
                        <div class="row">
                            <div class="col text-right">
                                <a href="${pageContext.request.contextPath}/admin/forget">忘记密码?</a>
                            </div>
                        </div>
                        <div class="sign-btn text-center">
                            <button class="btn btn-theme">登录</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>window.jQuery || document.write('<script src="../static/src/js/vendor/jquery-3.3.1.min.js"><\/script>')</script>
<script src="../static/plugins/popper.js/dist/umd/popper.min.js"></script>
<script src="../static/plugins/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="../static/plugins/perfect-scrollbar/dist/perfect-scrollbar.min.js"></script>
<script src="../static/plugins/screenfull/dist/screenfull.js"></script>
<script src="../static/dist/js/theme.js"></script>
<!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
<script>
    (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
        function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
        e=o.createElement(i);r=o.getElementsByTagName(i)[0];
        e.src='https://www.google-analytics.com/analytics.js';
        r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
    ga('create','UA-XXXXX-X','auto');ga('send','pageview');
</script>
</body>
</body>
</html>

<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Login</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<form action="${pageContext.request.contextPath}/reader/login" method="post">--%>
<%--    学号：<input type="text" name="account" required maxlength="24"/><br>--%>
<%--    密码：<input type="password" name="password" required maxlength="24"/><br>--%>
<%--    <button type="submit">提交</button>--%>

<%--</form>--%>

<%--</body>--%>
<%--</html>--%>

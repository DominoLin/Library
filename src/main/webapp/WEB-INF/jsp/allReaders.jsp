<%--
  Created by IntelliJ IDEA.
  User: x6760
  Date: 2020-3-26
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>查看用户</title>
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="favicon.ico" type="image/x-icon"/>
    <link href="https://fonts.googleapis.com/css?family=Nunito+Sans:300,400,600,700,800" rel="stylesheet">
    <link rel="stylesheet" href="../static/plugins/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../static/plugins/fontawesome-free/css/all.min.css">
    <link rel="stylesheet" href="../static/plugins/icon-kit/dist/css/iconkit.min.css">
    <link rel="stylesheet" href="../static/plugins/ionicons/dist/css/ionicons.min.css">
    <link rel="stylesheet" href="../static/plugins/perfect-scrollbar/css/perfect-scrollbar.css">
    <link rel="stylesheet" href="../static/plugins/datatables.net-bs4/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="../static/plugins/jvectormap/jquery-jvectormap.css">
    <link rel="stylesheet"
          href="../static/plugins/tempusdominus-bootstrap-4/build/css/tempusdominus-bootstrap-4.min.css">
    <link rel="stylesheet" href="../static/plugins/weather-icons/css/weather-icons.min.css">
    <link rel="stylesheet" href="../static/plugins/c3/c3.min.css">
    <link rel="stylesheet" href="../static/plugins/owl.carousel/dist/assets/owl.carousel.min.css">
    <link rel="stylesheet" href="../static/plugins/owl.carousel/dist/assets/owl.theme.default.min.css">
    <link rel="stylesheet" href="../static/dist/css/theme.min.css">
    <script src="../static/src/js/vendor/modernizr-2.8.3.min.js"></script>
</head>
<body>

<div class="wrapper">
    <header class="header-top" header-theme="light">
        <div class="container-fluid">
            <div class="d-flex justify-content-between">
                <div class="top-menu d-flex align-items-center">
                    <button type="button" class="btn-icon mobile-nav-toggle d-lg-none"><span></span></button>
                    <div class="header-search">
                        <div class="input-group">
                            <span class="input-group-addon search-close"><i class="ik ik-x"></i></span>
                            <input type="text" class="form-control">
                            <span class="input-group-addon search-btn"><i class="ik ik-search"></i></span>
                        </div>
                    </div>
                    <button type="button" id="navbar-fullscreen" class="nav-link"><i class="ik ik-maximize"></i>
                    </button>
                </div>
            </div>
        </div>
    </header>

    <div class="page-wrap">
        <div class="app-sidebar colored">
            <div class="sidebar-header">
                <a class="header-brand" href="index.html">
                    <div class="logo-img">
                        <%--                        <img src="src/img/brand-white.svg" class="header-brand-img" alt="lavalite">--%>
                    </div>
                    <span class="text">Library</span>
                </a>
                <button type="button" class="nav-toggle"><i data-toggle="expanded"
                                                            class="ik toggle-icon ik-toggle-right"></i></button>
                <button id="sidebarClose" class="nav-close"><i class="ik ik-x"></i></button>
            </div>

            <div class="sidebar-content ps">
                <div class="nav-container">
                    <nav id="main-menu-navigation" class="navigation-main">
                        <div class="nav-lavel">菜单</div>
                        <div class="nav-item has-sub">
                            <a href="javascript:void(0)"><i class="ik ik-book-open"></i><span>书籍管理</span></a>
                            <div class="submenu-content active" style="">
                                <a href="/book/all" class="menu-item is-shown">查看书籍</a>
                                <a href="/book/addBook" class="menu-item is-shown">添加书籍</a>
                            </div>
                        </div>
                        <div class="nav-item has-sub open">
                            <a href="javascript:void(0)"><i class="ik ik-user"></i><span>用户管理</span></a>
                            <div class="submenu-content active" style="">
                                <a href="/reader/allReaders" class="menu-item is-shown">查看用户</a>
                                <a href="/reader/addReader" class="menu-item is-shown">添加用户</a>
                            </div>
                        </div>
                        <div class="nav-item">
                            <a href="/lend/allLend"><i class="ik ik-list"></i><span>借阅管理</span> </a>
                        </div>
                        <div class="nav-item">
                            <a href=""><i class="ik ik-settings"></i>设置 </a>
                        </div>
                        <div class="nav-item">
                            <a href="/admin/login"><i class="ik ik-power"></i>退出登录</a>
                        </div>

                    </nav>
                </div>
            </div>
        </div>

        <div class="main-content">
            <div class="container-fluid">
                <div class="row">

                    <div class="col-md-12">
                        <div class="card table-card">
                            <div class="card-header">
                                <h3>用户列表</h3>
                                <div class="card-header-right">
                                    <ul class="list-unstyled card-option">
                                        <li><i class="ik ik-chevron-left action-toggle"></i></li>
                                        <li><i class="ik ik-minus minimize-card"></i></li>
                                        <li><i class="ik ik-x close-card"></i></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="card-block">
                                <div class="table-responsive">
                                    <table class="table table-hover mb-0">
                                        <thead>
                                        <tr>
                                            <th>学号</th>
                                            <th>姓名</th>
                                            <th>电话</th>
                                            <th>学院</th>
                                            <th>专业</th>
                                            <th>操作</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach var="lendList" items="${list}">
                                            <tr>
                                                <td>${lendList.account}</td>
                                                <td>${lendList.username}</td>
                                                <td>${lendList.telephone}</td>
                                                <td>${lendList.college}</td>
                                                <td>${lendList.major}</td>
                                                <td>
                                                    <a href="/reader/editReader?account=${lendList.account}"><i class="ik ik-edit f-16 mr-15 text-green"></i></a>
                                                    <a href="/reader/deleteReader?account=${lendList.account}"><i class="ik ik-trash-2 f-16 text-red"></i></a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>


<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>window.jQuery || document.write('<script src="src/js/vendor/jquery-3.3.1.min.js"><\/script>')</script>
<script src="../static/plugins/popper.js/dist/umd/popper.min.js"></script>
<script src="../static/plugins/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="../static/plugins/perfect-scrollbar/dist/perfect-scrollbar.min.js"></script>
<script src="../static/plugins/screenfull/dist/screenfull.js"></script>
<script src="../static/plugins/datatables.net/js/jquery.dataTables.min.js"></script>
<script src="../static/plugins/datatables.net-bs4/js/dataTables.bootstrap4.min.js"></script>
<script src="../static/plugins/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
<script src="../static/plugins/datatables.net-responsive-bs4/js/responsive.bootstrap4.min.js"></script>
<script src="../static/plugins/jvectormap/jquery-jvectormap.min.js"></script>
<script src="../static/plugins/jvectormap/tests/assets/jquery-jvectormap-world-mill-en.js"></script>
<script src="../static/plugins/moment/moment.js"></script>
<script src="../static/plugins/tempusdominus-bootstrap-4/build/js/tempusdominus-bootstrap-4.min.js"></script>
<script src="../static/plugins/d3/dist/d3.min.js"></script>
<script src="../static/plugins/c3/c3.min.js"></script>
<script src="../static/js/tables.js"></script>
<script src="../static/js/widgets.js"></script>
<script src="../static/js/charts.js"></script>
<script src="../static/dist/js/theme.min.js"></script>
<!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
<script>
    (function (b, o, i, l, e, r) {
        b.GoogleAnalyticsObject = l;
        b[l] || (b[l] =
            function () {
                (b[l].q = b[l].q || []).push(arguments)
            });
        b[l].l = +new Date;
        e = o.createElement(i);
        r = o.getElementsByTagName(i)[0];
        e.src = 'https://www.google-analytics.com/analytics.js';
        r.parentNode.insertBefore(e, r)
    }(window, document, 'script', 'ga'));
    ga('create', 'UA-XXXXX-X', 'auto');
    ga('send', 'pageview');
</script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: hwt
  Date: 2018/12/22
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询页面</title>
</head>
<link rel="stylesheet" href="jm.css">
<body>

<div class="wrapper-top">
    <div class="content-top">
        <a href="#">logo</a>
        <ul>
            <li class="top-1"></li>
            <li class="top-2">融e购</li>
            <li class="top-3">登录|注册</li>
        </ul>
        <form action="#" method="post">
            <input class="shuru" type="text" name="name">
            <input class="search"  type="submit">

        </form>

    </div>
</div>


<div class="wrapper-box" style="margin-top: 60px">
    <div class="content-box">
          <div class="search-box">
           <span class="wel">欢迎您进入银行管理系统</span>
           <p></p>
           <div class="last">你当前的可用余额为:<span><%=session.getAttribute("endCash")%></span></div>
              <a href="show.jsp">返回</a>

          </div>

    </div>
</div>


</body>
</html>

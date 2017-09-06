<%--
  Created by IntelliJ IDEA.
  User: HW520
  Date: 2017/9/3
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/comm/corejsp.jsp"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>欢迎来到哟哟实验室</title>
    <link href="static/css/login.css" rel="stylesheet">
</head>
<body>
    <div class="container back">
        <div class="row" style="height: 200px;">
            <div class="col-md-12"></div>
        </div>
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <form class="form-horizontal" id="loginform" action="singin" method="post">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Username</label>
                        <div class="col-sm-10">
                            <input type="username" name="username" class="form-control" id="inputEmail3">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">Password</label>
                        <div class="col-sm-10">
                            <input type="password" name="password" class="form-control" id="inputPassword3" placeholder="Password">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox"> Remember me
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-block" style="background: #428bca;color:white">Sign in</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="col-md-3"></div>
    </div>
</body>
</html>

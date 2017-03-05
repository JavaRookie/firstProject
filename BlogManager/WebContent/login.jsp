<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>博客信息后台管理系统</title>
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <meta name="description" content="">
 <meta name="author" content="">
<link href="css/login.css" rel="stylesheet" type="text/css">
 <!-- CSS -->
<link type="text/css" rel="stylesheet" href="assets/css/reset.css">
<link type="text/css" rel="stylesheet" href="assets/css/supersized.css">
<link type="text/css" rel="stylesheet" href="assets/css/style.css">
<script type="text/javascript" src="assets/js/jquery-1.8.2.min.js" ></script>
<script type="text/javascript" src="assets/js/supersized.3.2.7.min.js" ></script>
<script type="text/javascript" src="assets/js/supersized-init.js" ></script>
<script type="text/javascript" src="assets/js/scripts.js" ></script>
<script type="text/javascript" src="js/login.js"></script>
</head>
<%
	request.setCharacterEncoding("utf-8");
	String username = "";
	String password = "";
	Cookie[] cookies = request.getCookies();
	if (cookies != null && cookies.length > 0) {
		for (Cookie c : cookies) {
			if (c.getName().equals("login")) {
				String[] sb = c.getValue().split("&");
				username = sb[0];
				password = sb[1];
			}

		}
	}
%>
<%
	String root = application.getContextPath();
	session.setAttribute("path", root);
%>
<body>
	    <div class="page-container">
            <h1>管理员登录</h1>
            <form action="user_login" method="post" namespace="/">
                <input type="text" name="userName" value="<%=username%>" class="username" placeholder="请输入您的用户名！">
                <input type="password" name="userPwd" value="<%=password%>" class="password" placeholder="请输入您的用户密码！">
                <div style="border:0px solid red;width:382px;height: 44px;"><input style="height: 20px;width: 15px" type="checkbox" id="check" name="isCookie" checked="checked" class="check"/><span style="position: relative;top:-22px;left:-70px">十天内记住我的登录状态</span></div>
                <div style="border:0px solid red;width:382px;height: 44px;"><img style="position: relative;left:-80px;top:-20px;" id="yzm" src="yzm" onclick="changeYzm()"title="点击换一张" /><input style="width:70px;position: relative;left: -60px;top:-25px;" input id="text" name="text" type="text"onfocus="xz()" value="输入验证码" maxlength="4"></div>
                <button type="submit" class="submit_button">登录</button>
            	<%-- <font color="red">${error}</font> --%>
            	<font color="red"><s:actionerror/></font>
            </form>
        </div>
</body>
</html>
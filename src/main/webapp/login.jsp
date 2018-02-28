<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<title>用户登录</title>
<body>
		<form action="${pageContext.request.contextPath}/login" method="post">
		用户名 <input type="text" id="username" name="username" /> <br> <br> 密码 <input
			type="password" id="password"  name="password"/> <br> <br> <input
			type="submit" value="确定" />
			</form>
		<a href="regist.jsp"><button>注册</button></a>
</body>
</html>

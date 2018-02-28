<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page
	import="org.apache.taglibs.standard.tag.common.core.ForEachSupport"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到SHOPPING</title>
</head>
<body>
<% 	
	String seStr = (String)session.getAttribute("username");
	if(seStr !=null ){
		%>
			已经登录的用户是:<%=seStr %>
		<% 
	}
%>
	<div id="div1" >
		<a href="login.jsp"><input type="button" value="登录" /></a>
		<a href="regist.jsp"><input type="button" value="注册" /></a><br>
	</div>
	<c:forEach items="${allproduct}" var="product">
		商品名：${product.name }
		商品类别：${product.type }
		价格：${product.price }
		数量：${product.count }
		卖主:${product.username }<br>
	</c:forEach>
</body>

</html>
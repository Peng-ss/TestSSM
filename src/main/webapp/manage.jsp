<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page
	import="org.apache.taglibs.standard.tag.common.core.ForEachSupport"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理</title>
</head>
<body>
    <br>
<h3>你在售卖的商品</h3><br>
<c:forEach items="${products}" var="product">
商品名：${product.getName()}
 商品类别：${produc.getType()}  
 商品价格：${product.getPrice()}  
 商品数量：${product.getCount()}
 <br>
</c:forEach>
<br>
<form action="${pageContext.request.contextPath }/productAdd" method="post">
<input type="submit" value="添加商品"/><br><br>
<input type="hidden" value="${user.getUsername() }" name="username"/>
商品的类别：<input type="text"  name="type" /><span style="color:red;">*</span><br>
商品的名字：<input type="text" name="name" /><span style="color:red;">*</span><br>
商品的价格：<input type="text" name="price" /><span style="color:red;">*</span><br>
商品的数量：<input type="text" name="count" /><span style="color:red;">*</span><br>
</form>
<form action="${pageContext.request.contextPath }/index" method="post"><a href="index.jsp"><input type="submit" value="返回首页"/></a></form>
</body>
</html>
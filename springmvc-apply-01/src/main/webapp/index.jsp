<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Index</title>
</head>
<body>
<h3>Index</h3>

<a href="${pageContext.request.contextPath}/simpleParam?id=101&username=TOM">simpleParam</a>

<h3>对象类型参数获取</h3>
<form action="${pageContext.request.contextPath}/entityParam" method="post">
	编号：<input type="text" name="id"> <br>
	用户名：<input type="text" name="username"> <br>
	<input type="submit" value="对象类型">
</form>

<h3>数组类型参数获取</h3>
<form action="${pageContext.request.contextPath}/arrayParam">
	编号：<br> <input type="checkbox" name="ids" value="1">1<br>
	<input type="checkbox" name="ids" value="2">2<br>
	<input type="checkbox" name="ids" value="3">3<br>
	<input type="checkbox" name="ids" value="4">4<br>
	<input type="checkbox" name="ids" value="5">5<br>
	<input type="submit" value="数组类型">
</form>

<h3>自定义类型转换器</h3>
<form action="${pageContext.request.contextPath}/converterParam" >
	生日：<input type="text" name="birthday">
	<input type="submit" value="自定义类型转换器">
</form>

<h3>@RequestParam</h3>
<a href="${pageContext.request.contextPath}/requestParam?id=101&username=张飞">@requestParam</a>

<h3>@RequestHeader</h3>
<a href="${pageContext.request.contextPath}/requestHead">@RequestHeader</a>

<h3>@HeaderParam</h3>
<a href="${pageContext.request.contextPath}/cookieValue">@CookieValue</a>
<h3>@servletAPI</h3>
<a href="${pageContext.request.contextPath}/servletAPI">@servletAPI</a>
</body>
</html>
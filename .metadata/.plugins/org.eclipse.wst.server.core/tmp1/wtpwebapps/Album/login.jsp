<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/jquery-3.2.1.js"></script>

<script type="text/javascript">

</script>
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">
<table>
	<tr><td>用户名:</td><td><input type="text" name="user.username"></td></tr>
	<tr><td>密码:</td><td><input type="password" name="user.userpwd"></td></tr>
	<tr><td colspan="2"><input type="submit" value="登录"></td></tr>
</table>
<div id="info"></div>
<a href="${pageContext.request.contextPath}/main.jsp">返回主页</a>

</form>
</body>
</html>
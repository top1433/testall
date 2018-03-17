<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:if test="#session.USER==null">
<jsp:forward page="${pageContext.request.contextPath}/user/main"></jsp:forward>
</s:if>

<s:else>
	<a href="${pageContext.request.contextPath}/aibum/new">新建相册</a>
</s:else>


<a href="${pageContext.request.contextPath}/user/main">返回主页</a>

</body>
</html>
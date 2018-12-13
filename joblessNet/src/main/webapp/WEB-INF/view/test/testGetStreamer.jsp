<%@ page language="java" isELIgnored="false" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="user" items="${userList }" varStatus="status">
				${user.nickName }
				${user.streamer }
			</c:forEach>
</body>
</html>
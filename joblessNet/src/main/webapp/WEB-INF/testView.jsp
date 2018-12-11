<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<br>
<body>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성 날짜</td>
			<td>조회수</td>
		</tr>
		<c:forEach var="post" items="${postList}" varStatus="status">
			<tr>
				<td>${post.postId }</td>
				<td><a href="viewPost?postId=${post.postId}">${post.title}</a></td>
				<td>${post.writeDate}</td>
				<td>${post.views }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>InsertPage</title>
</head>
<body>
회원가입 페이지!!
<%= request.getAttribute("DuplicateKeyException") %>
<%= request.getAttribute("OverlapLoginIdException") %>
<form action="join" method="post">
	<input type="text" name="loginId" placeholder="loginId"><br>
	<input type="text" name="nickName" placeholder="nickName"><br>
	<input type="text" name="password" placeholder="password"><br>
	<input type="text" name="passwordCheck" placeholder="passwordCheck"><br>
	<input type="text" name="email" placeholder="email"><br>
	<input type="number" name="platformId" placeholder="platformId"><br>
	<input type="submit">
</form>
<br>
회원삭제 페이지!!
<a href="deleteUser">ㄱㄱㅆ</a>
</body>
</html>
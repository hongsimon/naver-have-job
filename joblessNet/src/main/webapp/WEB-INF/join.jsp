<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>InsertPage</title>
</head>
<body>
회원가입 페이지!!
${DuplicateKeyException }
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
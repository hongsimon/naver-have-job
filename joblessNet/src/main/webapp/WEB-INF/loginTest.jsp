<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
로그인 테스트 페이지인것임
<c:if test="${errors.Id_or_Pw_NotMatch }">비번이나 아디없음 ㅅㄱㄹ</c:if>
<form action="loginTest" method="post">
	<input type="text" name="loginId">
	<input type="text" name="password">
	<input type="submit">
</form>
</body>
</html>
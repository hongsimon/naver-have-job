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
<c:if test="${OverlapLoginIdException }">중복된 로그인아이디</c:if>
<c:if test="${OverlapNickNameException }">중복된 닉네임</c:if>
<c:if test="${OverlapEmailException }">중복된 이메일</c:if>
<c:if test="${DuplicateKeyException }">중복된 회원정보</c:if>
<c:if test="${errors.loginId }">로그인 아이디</c:if><br>
<c:if test="${errors.password }">비번</c:if><br>
<c:if test="${errors.passwordCheck }">비번체크</c:if><br>
<c:if test="${errors.notMatchPassword }">비번체크 틀림!!</c:if>
<c:if test="${errors.nickName }">닉넴</c:if><br>
<c:if test="${errors.email }">이메일</c:if><br>
<c:if test="${errors.platformId }">플랫폼</c:if><br>

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
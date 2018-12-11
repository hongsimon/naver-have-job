<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insertClip" method="post">
	<input type="hidden" name="writerId" value="${authUser.userId}">
	제목:<input type="text" name="title"><br>
	url:<input type="text" name="url" ><br>
	썸네일:<input type="text" name="thumb" ><br>
	방송인ID(number):<input type="text" name="broadcasterId"><br>
	<input type="submit" value="클립작성">
</form>
</body>
</html>
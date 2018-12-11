<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${clip}
<br>
<table border="1">
<tr>
	<td>제목</td>
	<td>url</td>
	<td>ThumbNail</td>
	<td>작성자</td>
	<td>방송인</td>
</tr>
<tr>
	<td>${clip.title}</td>
	<td>${clip.clipURL}</td>
	<td>${clip.thumbURL}</td>
	<td>${clip.writerId }</td>
	<td>${clip.broadcasterId}</td>
</tr>
<c:if test="${clip.writerId == authUser.userId}">
	<a href="deleteClip?clipId=${clip.clipId}">삭제</a>
</c:if>
<br>
<a href="viewClip">리스트로</a>

</table>
</body>
</html>
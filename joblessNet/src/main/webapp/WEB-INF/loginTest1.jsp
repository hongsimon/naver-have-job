<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${authUser.userId }<br>
${authUser.loginId }<br>
${authUser.nickName }<br>
${authUser.email }<br>
${authUser.point }<br>
${authUser.admin }<br>
${authUser.ban }<br>
${authUser.platformId }<br>

<a>로그아웃</a>
</body>
</html>
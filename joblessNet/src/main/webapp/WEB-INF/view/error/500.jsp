<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
  <%@include file="../header_Service/pageContextService.jsp"%>
    <link rel="stylesheet" href="../css/error.css">
    <meta charset="utf-8">
    <title></title>
  </head>
  <body class="error">
    <img  src="${pageContext.request.contextPath}/images/error/500.png"/>
    <h1>500 Internal Server Error</h1>
    <hr class="hr-error"/>
    <h3>관리자, 미쳤습니까?</h4>
    <h5><%= exception.getMessage() %></h5>
    내부 서버에 오류가 발생했습니다.<br />
    <a href="/main">메인으로 돌아가시겠습니까?</a>
  </body>
</html>

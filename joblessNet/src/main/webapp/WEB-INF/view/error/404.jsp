<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <link rel="stylesheet" href="../css/error.css">
    <meta charset="utf-8">
    <title></title>
  </head>
  <body class="error">
    <img  src="${pageContext.request.contextPath}/images/error/404.png"/>
    <h1>404 Page Not Found</h1>
    <hr class="hr-error"/>
    <h3>그런데, 짜잔! 페이지를 찾을수 없군요</h4>
    <h5>The page you requested was not found.</h5>
    요청하신 페이지를 찾을 수 없습니다. 링크 주소를 정확히 입력하셨는지 확인해 주세요.<br />
    <a href="/main">메인으로 돌아가시겠습니까?</a>
  </body>
</html>

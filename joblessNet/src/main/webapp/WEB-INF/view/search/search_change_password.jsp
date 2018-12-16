<%@page import="java.util.TimerTask"%>
<%@page import="java.util.Timer"%>
<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
  	<script type="text/javascript">
  		if(${empty code }){
  			alert("만료된 페이지입니다.");
  			location.href="http://localhost:8090/jobless-net/main";
  		}
  	</script>
  
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/loginPage.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">

    <meta charset="utf-8">
    <title>JobLess - Join</title>
  </head>
  <body>
    <div class="container login-con margin-nav">
      <div class="login-logo text-center login-logo"><a href="${pageContext.request.contextPath}/main"><img src="${pageContext.request.contextPath}/img/logo/joblessLogo-2.png" /></a></div>
      <div>
        <form class=" margin-l search-email-form" action="#" method="post">
          <div class="search-email-inner">
            <h1>비밀번호 바꾸기</h1>
          </div>
          <div class="error-msg text-center">
            Please enter your password.
          </div>
          <div class="search-email-input">
            <div>
              새 비밀번호
            </div>
            <input type="hidden" name="userId" value="${userId }">
            <input type="text" name="password" value="" placeholder="new password...">
          </div>
          <div class="search-email-input">
            <div>
              새 비밀번호 확인
            </div>
            <input type="text" name="passwordCheck" value="" placeholder="password check...">
          </div>
          <div class="change_password-btn">
            <button type="submit" name="button" >확인</button>
          </div>
        </form>
      </div>
    </div>
  </body>
</html>

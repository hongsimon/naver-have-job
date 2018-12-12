<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <%@include file="../header_Service/pageContextService.jsp"%>

    <script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js" charset="utf-8"></script>
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <meta charset="utf-8">
    <title>JobLess - Join</title>
  </head>
  <body>
    <div class="container login-con test-border margin-nav">
      <div class="login-logo text-center login-logo"><a href="main"><img src="${pageContext.request.contextPath}/images/logo/joblessLogo-2.png" /></a></div>
      <div class="login-selecter">
	      <div>
	        <a href="login" style="color: black; text-decoration:none">Log In</a>
	      </div>
	      <div>
	        <a href="#" style="color: black; text-decoration:none">Sign Up</a>
	      </div>
      </div>
      <c:if test="${errors.UserRequestNullException }">
      <div class="error-msg text-center">
        잘못된 접근입니다.
      </div>
      </c:if>
      
      <c:if test="${errors.DoesNotMatchSecurityCode }">
      <div class="error-msg text-center">
        입력하신 코드가 일치하지 않습니다.
      </div>
      </c:if>
      
      <div>
        <form class=" margin-l" action="join-check" method="post">
          <div>
            <div id="email">
              <a href="http://www.${emailHyperLink }" target="_blank" style="color: black; text-decoration:none">${user.email}</a>
            </div>
            <div>
              으로 전송된 이메일을 확인하여 가입 절차를 완료해 주세요.<br>
              <br>
            </div>
            <div>
              이메일은 아이디/비밀번호 찾기 등 고객지원을 위해 사용됩니다.<br>
              전송된 이메일을 꼭 확인하신 후 인증번호를 입력해주세요.<br>
              <br>
            </div>
            <div>
            	이 페이지와 인증코드는 10분동안 유효합니다.<br>
            	유효 기간을 연장하려면 인증코드를 재발급 받아주세요.<br>
            </div>
          </div>
          <br>
          <div>
          
            <input type="text" name="securityCode">
            <input type="hidden" name="code" value="${code }">
            <input type="hidden" name="loginId" value="${user.loginId }">
            <input type="hidden" name="nickName" value="${user.nickName }">
            <input type="hidden" name="password" value="${user.password }">
            <input type="hidden" name="email" value="${user.email }">
            <input type="hidden" name="platformId" value="${user.platformId }">
            
            <a href="#">Trouble logging in?</a>
          </div>
          <div>
          <button type="submit">Sign Up</button>
		</div>
        </form>

        </div>
            이메일을 받지 못하셨나요?
            <form action="email-again" method="POST">
            <input type="hidden" name="loginId" value="${user.loginId }">
            <input type="hidden" name="nickName" value="${user.nickName }">
            <input type="hidden" name="password" value="${user.password }">
            <input type="hidden" name="email" value="${user.email }">
            <input type="hidden" name="platformId" value="${user.platformId }">
            <button type="submit" name="button">이메일 재전송</button>
            </form>
        <div>

      </div>
    </div>
  </body>
</html>
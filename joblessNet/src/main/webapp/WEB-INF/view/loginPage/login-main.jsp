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

  <meta name="google-signin-scope" content="profile email">
  <meta name="google-signin-client_id" content="920495483409-1thb96c1e4oasjnl8osmjclqn79d4vi0.apps.googleusercontent.com">
<script src="https://www.google.com/recaptcha/api.js" async defer></script>


  <meta charset="utf-8">
  <title>JobLess - Login</title>
</head>

<body>
  <div class="container login-con test-border margin-nav">
    <div class="login-logo text-center login-logo"><a href="#"><img src="${pageContext.request.contextPath}/images/logo/joblessLogo-2.png" /></a></div>
    <div class="login-selecter">
      <div>
        <a href="#" style="color: black; text-decoration:none">Log In</a>
      </div>
      <div>
        <a href="join" style="color: black; text-decoration:none">Sign Up</a>
      </div>
    </div>
    
    <c:if test="${errors.Id_or_Pw_NotMatch }">
    <div class="error-msg text-center">
      잘못된 아이디 혹은 비밀번호 입니다.
    </div>
    </c:if>
    
    <c:if test="${errors.Not_Running_Recaptcha }">
    <div class="error-msg text-center">
      CAPTCHA를 입력하세요.
    </div>
	</c:if>
    
    <c:if test="${errors.loginId }">
    <div class="error-msg text-center">
      시발
    </div>
	</c:if>
	
	    <c:if test="${errors.password }">
    <div class="error-msg text-center">
      시바류
    </div>
	</c:if>
    
    <div>
      <form class=" margin-l" action="login" method="post">
        <div>
          UserID
        </div>
        <div>
          <input type="text" name="loginId" />
        </div>
        <div>
          Password
        </div>
        <div>
          <input type="text" name="password" />
        </div>
        <div>
          <a href="#">Trouble logging in?</a>
        </div>
        <div>
            <div class="g-recaptcha" data-sitekey="6Lcfp3wUAAAAAPDdrctx6gJd5j9z03zy1TxmoA1D"></div> 
            <br>
        </div>

        <hr class="hr-size" />

        <div class="margin-title">
          <a href="">
            <div id="naver_id_login"><img src="${pageContext.request.contextPath}/images/api-img/네이버 아이디로 로그인_아이콘형_Green.PNG" />
              <div>
                네이버 아이디로 로그인
              </div>
            </div>
          </a>
        </div>

      <%--   <div class="margin-title">
          <a href="#">
            <div id="google_id_login"><img src="${pageContext.request.contextPath}/images/api-img/btn_google_dark_normal_ios@3x.png" />
              <div>
                구글 아이디로 로그인
              </div>
            </div>
          </a>
          <div class="g-signin2" data-onsuccess="onSignIn"></div>
        </div> --%>

        <button type="submit">Log In</button>

      </form>

    </div>
  </div>
</body>

</html>
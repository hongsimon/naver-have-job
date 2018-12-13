<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/loginPage.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">

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
  <div class="container login-con margin-nav">
    <div class="login-logo text-center "><a href="main"><img src="${pageContext.request.contextPath}/images/logo/joblessLogo-2.png" /></a></div>
    <div class="login-selecter">
      <div  class="login-active">
        <a href="#" style="color: black; text-decoration:none">Log In</a>
      </div>
      <div>
        <a href="join" style="color: black; text-decoration:none">Sign Up</a>
      </div>
    </div>
    
    <c:if test="${!errors.loginId && !errors.password }">
    <c:if test="${errors.Id_or_Pw_NotMatch }">
    <div class="error-msg text-center">
      Please check your username and password.
    </div>
    </c:if>
    </c:if>
    
    <c:if test="${errors.Not_Running_Recaptcha }">
    <div class="error-msg text-center">
      Please check 'CAPTCHA'
    </div>
	</c:if>
    
    <c:if test="${errors.loginId || errors.password }">
    <div class="error-msg text-center">
      Please enter your username and password.
    </div>
	</c:if>
    
    <div>
      <form class=" margin-l login-form" action="login" method="post">
        <div>
	        <div>
	          UserID
	        </div>
          <input type="text" name="loginId" value="${value.loginId }"  autocomplete="off"/>
        </div>
        <div>
	        <div>
	          Password
	        </div>
          <input type="password" name="password"  autocomplete="off"/>
        </div>
        <div>
          <a href="#">Trouble logging in?</a>
        </div>
        
        <div>
            <div class="g-recaptcha" data-sitekey="6Lcfp3wUAAAAAPDdrctx6gJd5j9z03zy1TxmoA1D"></div> 
            <br>
        </div>

        <hr class="hr-size" />

        <div  class="login_submit">
          <button type="submit">Log In</button>
        </div>

      </form>

    </div>
  </div>
</body>

</html>
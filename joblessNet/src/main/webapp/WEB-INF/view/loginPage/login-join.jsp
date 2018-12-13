<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
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
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://www.google.com/recaptcha/api.js" async defer></script>

    <meta charset="utf-8">
    <title>JobLess - Join</title>
  </head>
  <body>
    <div class="container login-con  margin-nav">
      <div class="login-logo text-center "><a href="main"><img src="${pageContext.request.contextPath}/images/logo/joblessLogo-2.png" /></a></div>
      <div class="login-selecter">
      <div>
        <a href="login" >Log In</a>
      </div>
      <div class="Sign-active">
        <a href="#" >Sign Up</a>
      </div>
      </div>
      <c:if test="${errors.OverlapLoginIdException }">
	      <div class="error-msg text-center">
	      	중복된 로그인 아이디입니다.
	      </div>
      </c:if>
      
      <c:if test="${errors.OverlapNickNameException }">
      	 <div class="error-msg text-center">
	     	 중복된 닉네임입니다.
	     </div>
      </c:if>
      
      <c:if test="${errors.OverlapEmailException }">
	      <div class="error-msg text-center">
	      	중복된 이메일입니다.
	      </div>
      </c:if>
      
      <c:if test="${errors.loginId }">
	      <div class="error-msg text-center">
	      로그인 아이디를 입력해주세요.
	      </div>
      </c:if>
      
      <c:if test="${errors.password }">
	      <div class="error-msg text-center">
	      비밀번호를 입력해주세요.
	      </div>
      </c:if>
      
      <c:if test="${errors.passwordCheck }">
	      <div class="error-msg text-center">
	      비밀번호 확인를 입력해주세요.
	      </div>
      </c:if>
     
      <c:if test="${errors.notMatchPassword }">
	      <div class="error-msg text-center">
	      비밀번호가 일치하지 않습니다.
	      </div>
      </c:if>
      
      <c:if test="${errors.nickName }">
	      <div class="error-msg text-center">
	      닉네임을 입력해주세요.
	      </div>
      </c:if>
      
      <c:if test="${errors.email }">
	      <div class="error-msg text-center">
	      이메일을 입력해주세요.
	      </div>
      </c:if>
      
      <c:if test="${errors.platformId }">
	      <div class="error-msg text-center">
	      잘못된 플랫폼 입니다.
	      </div>
      </c:if>
      
      <c:if test="${errors.Not_Running_Recaptcha }">
      	  <div class="error-msg text-center">
      	  CAPTCHA를 입력하세요.
      	  </div>
      </c:if>
      
      <div>
        <form class=" margin-l login-form" action="join" method="post" >
          <div>
	          <div>
	            LoginID
	          </div>
            <input type="text" name="loginId" value="${user.loginId }"  autocomplete="off"/>
          </div>
          <div>
	          <div>
	            Password
	          </div>
            <input type="password" name="password"  autocomplete="off" />
          </div>
          <div>
	          <div>
	            PasswordCheck
	          </div>
            <input type="password" name="passwordCheck"   autocomplete="off"/>
          </div>
          <div>
	          <div>
	            Email
	          </div>
            <input type="text" name="email" value="${user.email }"  autocomplete="off" />
          </div>
          <div>
	          <div>
	            NickName
	          </div>
            <input type="text" name="nickName"  value="${user.nickName }"  />
          </div>
          <div>
            Like platform
          </div>
          <div>
            <select class="" name="platformId" >
              <option value="0">플랫폼 선택</option>
              <option value="1">Afreeca TV</option>
              <option value="2">YouTube</option>
              <option value="3">Kakao pat</option>
              <option value="4">Twitch</option>
            </select>
          </div>
          <div>
            <a href="#">Trouble logging in?</a>
          </div>
          <div>
            <script src="https://www.google.com/recaptcha/api.js?onload=onloadCallback&render=explicit" async defer>
            </script>
          </div>
			 <div class="g-recaptcha" data-sitekey="6Lcfp3wUAAAAAPDdrctx6gJd5j9z03zy1TxmoA1D"></div>
           	<br>
          <hr class="hr-size" />

        		<div  class="login_submit">
            		<button type="submit">Check Sign Up</button>
         		 </div>

        </form>
        

      </div>
    </div>
  </body>
</html>
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
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script>
      function onSignIn(googleUser) {
        // Useful data for your client-side scripts:
        var profile = googleUser.getBasicProfile();

        // The ID token you need to pass to your backend:
        var id_token = googleUser.getAuthResponse().id_token;

        var form = $('<form></form>');
        form.attr('action', "http://localhost:8090/Day1118_SpringMvcPrj/NewFile1.jsp");
        form.attr('method', 'get');
        form.appendTo('body');
        var id = $("<input type='hidden' value=" + profile.getId() + " name='id'>");
        var name = $("<input type='hidden' value=" + profile.getName() + " name='password'>");
        var email = $("<input type='hidden' value=" + profile.getEmail() + " name='mode'>");
        form.append(id);
        form.append(name);
        form.append(email);
        form.submit();
      };
    </script>
    <script type="text/javascript">
      var verifyCallback = function(response) {

      };
      var onloadCallback = function() {

        grecaptcha.render('example3', {
          'sitekey': '6Lcfp3wUAAAAAPDdrctx6gJd5j9z03zy1TxmoA1D',
          'callback': verifyCallback,
          'theme': 'light'
        });
      };
    </script>

    <meta charset="utf-8">
    <title>JobLess - Join</title>
  </head>
  <body>
    <div class="container login-con test-border margin-nav">
      <div class="login-logo text-center login-logo"><a href="#"><img src="${pageContext.request.contextPath}/images/logo/joblessLogo-2.png" /></a></div>
      <div class="login-selecter">
        <div>
          Log In
        </div>
        <div>
          Sign Up
        </div>
      </div>
      <div class="error-msg text-center">
        <c:if test="${errors.OverlapLoginIdException }">중복된 로그인아이디<br></c:if>
		<c:if test="${errors.OverlapNickNameException }">중복된 닉네임<br></c:if>
		<c:if test="${errors.OverlapEmailException }">중복된 이메일<br></c:if>
		<c:if test="${errors.DuplicateKeyException }">중복된 회원정보<br></c:if>
		<c:if test="${errors.loginId }">로그인 아이디<br></c:if>
		<c:if test="${errors.password }">비번<br></c:if>
		<c:if test="${errors.passwordCheck }">비번체크<br></c:if>
		<c:if test="${errors.notMatchPassword }">비번체크 틀림!!<br></c:if>
		<c:if test="${errors.nickName }">닉넴<br></c:if>
		<c:if test="${errors.email }">이메일<br></c:if>
		<c:if test="${errors.platformId }">플랫폼<br></c:if>
		<br>
      </div>
      <div>
        <form class=" margin-l" action="join" method="post" >
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
            PasswordCheck
          </div>
          <div>
            <input type="text" name="passwordCheck" />
          </div>
          <div>
            Email
          </div>
          <div>
            <input type="text" name="email" />
          </div>
          <div>
            NickName
          </div>
          <div>
            <input type="text" name="nickName" />
          </div>
          <div>
            Like platform
          </div>
          <div>
            <select class="" name="platformId">
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
			<div id="example3"></div>
           	<br>
          <hr class="hr-size" />

          <div class="margin-title">
            <a href="#">
              <div id="naver_id_login"><img src="${pageContext.request.contextPath}/images/api-img/네이버 아이디로 로그인_아이콘형_Green.PNG" />
                <div>
                  네이버 아이디로 회원가입
                </div>
              </div>
            </a>
          </div>
<%-- 
          <div class="margin-title">
            <a href="#">
              <div id="google_id_login"><img src="${pageContext.request.contextPath}/images/api-img/btn_google_dark_normal_ios@3x.png" />
                <div>
                  구글 아이디로 회원가입
                </div>
              </div>
            </a>
            <div class="g-signin2" data-onsuccess="onSignIn"></div> --%>
          </div>
	
     <button type="submit">Check Sign Up</button>

        </form>
        

      </div>
    </div>
  </body>
</html>
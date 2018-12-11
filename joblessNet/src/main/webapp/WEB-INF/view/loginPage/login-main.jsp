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
      var id = $("<input type='hidden' value=" + profile.getId() + " name='idx'>");
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
		console.log(response);
    };
    var onloadCallback = function() {

      grecaptcha.render('grecaptcha', {
        'sitekey': '6Lcfp3wUAAAAAPDdrctx6gJd5j9z03zy1TxmoA1D',
        'callback': verifyCallback,
        'theme': 'light'
      });
    };
  </script>


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
    
    <c:if test="${!empty errors }">
    <div class="error-msg text-center">
      <c:if test="${errors.Id_or_Pw_NotMatch }">잘못된 아이디 혹은 비밀번호 입니다.</c:if>
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
          <script src="https://www.google.com/recaptcha/api.js?onload=onloadCallback&render=explicit" async defer>
          </script>
            <div id="grecaptcha"></div>
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
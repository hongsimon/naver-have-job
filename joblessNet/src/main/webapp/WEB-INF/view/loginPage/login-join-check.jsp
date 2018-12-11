<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        Please enter your username and password.
      </div>
      <div>
        <form class=" margin-l" action="#" method="post">
          <div>
            <div id="email">
              ${user.email}
            </div>
            <div>
              으로 전송된 이메일을 확인하여 가입 절차를 완료해 주세요.
            </div>
            <div>
              이메일은 아이디/비밀번호 찾기 등 고객지원을 위해 사용됩니다.
              전송된 이메일을 꼭 확인하신 후 인증번호를 입력해주세요
            </div>
          </div>
          <div>
            <input type="text" name="" value="">
          </div>
            이메일을 받지 못하셨나요?
            <button type="button" name="button">이메일 재전송</button>
          <div>
            <a href="#">Trouble logging in?</a>
          </div>
          <div>



          <button type="submit">Sign Up</button>

        </form>

      </div>
    </div>
  </body>
</html>
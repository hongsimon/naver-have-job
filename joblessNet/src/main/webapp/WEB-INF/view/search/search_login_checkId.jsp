<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String email = request.getParameter("email");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" dir="ltr">
<script type="text/javascript" src="../js/jQuery.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../js/shareJs.js"></script>
    <script type="text/javascript" src="../js/login.js"></script>

    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/shareCss.css">
    <link rel="stylesheet" href="../css/loginPage.css">
    <link rel="stylesheet" href="../css/customC.css">
    <meta charset="utf-8">
  
        <div>
          <div class="">
            <h1>이메일 확인</h1>
          </div>
          <div class="search-email-inner-last">
            <div>
              <%=email %>
            </div>
             이메일로 이동해 아이디를 복원하세요.<br /><br />

            이메일을 받기까지 몇 분 정도 걸릴 수 있습니다.<br />
           다른 편지함에 보관될 수도 있으므로 스팸 편지함과 광고 편지함도 꼭 확인하세요!
          </div>
          <div class="search-email-btn search-for">
            <a href="" class="search-for-login">로그인</a>
            <button type="submit" name="button" class="search-restart">다시시작</button>
          </div>
        </div>

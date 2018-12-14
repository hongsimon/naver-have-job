<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <%
    	String emailurl = request.getParameter("emailurl");
    %>
 
        <div class=" margin-l search-email-form" >
          <div class="search-email-inner">
            <h1>JobLess 계정 찾기</h1>
            다음은 문제가 발생한 JobLess 아이디를 입력하세요
          </div>
          <div class="error-msg text-center search_login_errorBox">
            <div>
              존재하지 않는 아이디입니다.
            </div>
            철자를 확인하거나 다른 아이디로 시도해보세요
          </div>
          <div class="search-email-input">
            <div>
              이메일
            </div>
            <div class="search-email">
             	<%= emailurl %>
             	<input type="hidden" value="<%=emailurl%>">
              <a class="search_rep"><span class="glyphicon glyphicon-pencil"></span></a>
            </div>
            <div>
              아이디를 입력하세요
            </div>
            <input type="text" name="" id="search-password" placeholder="username" >
          </div>
          <div class="search-email-btn">
            <div class="search-password-btn">
              <button type="submit" name="button" id="search-password-toNext">비밀번호 재설정 링크 받기</button>
            </div>
            <div class="search-id-btn">
              <button type="submit" name="button" >아이디를 모릅니다</button>
            </div>
          </div>
        </div>

 
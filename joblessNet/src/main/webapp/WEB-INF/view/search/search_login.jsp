<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String email = request.getParameter("email"); %>
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
    
        	<div class=" margin-l search-email-form" >
          <div class="search-email-inner">
            <h1>JobLess 계정 찾기</h1>
            계정에 등록한 이메일 주소를 입력하세요
          </div>
          <div class="search-email-input">
            <div>
              이메일 입력
            </div>
            <input type="text" name=""  id="search-email" placeholder="email..."  value="<%=email%>">
          </div>
          <div class="search-email-btn">
            <button type="button"  name="button" id="search-eamil-toNext">다음</button>
          </div>
        </div>
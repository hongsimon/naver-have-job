<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <%@include file="../header_Service/pageContextService.jsp"%>
  
  <meta charset="utf-8" />
  <title>백수넷</title>
  <script type="text/javascript">
      $(function() {
        $("#favoriteList").click(function() {
          $.ajax({
            type: 'get',
            url: 'service/favoriteList.html',
            dataType: 'html',
            success: function(data) {
              $(".inner").html(data);
            },
            error:function(error){
    			alert(error);
    		}
          
          });
        })

        $("#changeProfile").click(function() {
          $.ajax({
            type: 'get',
            url: 'service/changeProfile.html',
            dataType: 'html',
            success: function(data) {
              		$(".inner").html(data).trigger("create");
              		$.getScript("js/changeProfile.js");
            },
            error:function(error){
    			alert(error);
    		}
          });
        })

        $("#userDel").click(function() {
          $.ajax({
            type: 'get',
            url: 'service/userDel.html',
            dataType: 'html',
            success: function(data) {
              $(".inner").html(data);
            },
            error:function(error){
    			alert(error);
    		}

          });
        })


      })
  </script>



	<%@include file="../share-nav/nav-header.jsp"%>
</head>

<body>
  <!-- 우측 메인 메뉴바 -->
  <div class="container margin-nav">
    <div class="row right-nav-bar">
     <%@include file="../share-nav/nav-service.jsp"%>

      <!-- 게시판 메뉴 -->
      <div class="col-xs-10">
        <div>
          <button type="button" name="button" id="favoriteList">즐겨찾기 목록</button>
          <button type="button" name="button" id="changeProfile">회원정보 수정</button>
          <button type="button" name="button" id="userDel">회원 탈퇴</button>
        </div>
        <div class="inner">
          
        </div>
      </div>
    </div>
  </div>
</body>

</html>

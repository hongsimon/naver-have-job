<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/changeProfile.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/userService.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/hangul.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/searchBroadcaster.js"></script>
  

  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/service.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/User_service.css">
  <meta charset="utf-8" />
  <title>백수넷</title>
    <%@include file="../share-nav/nav-header.jsp"%>
  

</head>

<body>

  <!-- 우측 메인 메뉴바 -->
  <div class="container margin-nav">
    <div class="row right-nav-bar">
     <%@include file="../share-nav/nav-service.jsp"%>

      <!-- 게시판 메뉴 -->
      <div class="col-xs-10">
        <div class="service-user">
          <div class="service-inner">
            <div>
              <form action="selectIconBuy" method="post">
                  <div class="icon-buy-box">
                    <div>
                      <h2>${icon.iconName }</h2>
                    </div>
                    <img src="${pageContext.request.contextPath}${icon.fileName}"/>
                    <div>
                      <input type="hidden" name = "iconId" value="${icon.iconId }">
                      <input type="hidden" name = "userId" value="${authUser.userId}">
                      <button type="submit" class="icon-buy-btn">구매하기 (500포인트)</button>
                    <div class="icon-denger">
                      	  구매한 아이콘은 취소할 수 없으니 신중히 결정해주세요
                     </div>
                    </div>
                  </div>
                  </form>
                </div>
              </div>
            </div>

          </div>

        </div>
       <%@include file="../share-nav/nav-bottom.jsp"%>
        </div>
        
        <%@include file="../share-nav/controller.jsp"%>
</body>

</html>

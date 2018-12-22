<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@	
	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
 %>
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
                <div>
                  <h2>아이콘샵</h2>
                  <div class="service-delNotice">
                    <div class="service-iconShop-search">
                      <input type="text" placeholder="검색어 입력" id="icon-search"/>
                    </div>
                    <div class="icon_list">
                    <c:forEach var="icon" items="${iconList }" varStatus="status">
                      <a href="selectIconInfo?iconId=${icon.iconId}">
                      <div class="icon-list-box ">
                        <img src="${pageContext.request.contextPath}${icon.fileName}" alt="">
                        <div>
                          <div class="icon-name">
                            ${icon.iconName}
                          </div>
                          <div class="icon-point">
                            500포인트
                          </div>
                        </div>
                      </div>
                      </a>
            	   </c:forEach>
                   </div>

                  </div>
                </div>
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

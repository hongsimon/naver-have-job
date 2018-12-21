<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		if(${empty authUser }){
			alert("로그인이 필요한 서비스입니다.");
			var like = "${pageContext.request.contextPath}";
			like += "/main"
			location.href=like;
		}
	</script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/changeProfile.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/userService.js"></script>

  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/service.css">
  	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/User_service.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jobless - Service</title>
</head>
<body>
	<%@include file="../share-nav/nav-header.jsp"%>

  <!-- 우측 메인 메뉴바 -->
  <div class="container margin-nav">
    <div class="row right-nav-bar">
    	<%@include file="../share-nav/nav-service.jsp"%>

      <!-- 게시판 메뉴 -->
      <div class="col-xs-10 setController">
        <div class="service-user">
          <div class="service-btn">
            <a class="service-btns" id="favoriteList" href="favoriteList?userId=${authUser.userId }">내가 쓴 게시글</a>
             <a class="service-btn-active"  id="changeProfile" >내가 쓴 클립</a>
            <a class="service-btns"  id="changeProfile" href="changeProfile">회원정보 수정</a>
            <a class="service-btns" id="userDel" href="userDel">회원 탈퇴</a>
          </div>
          <div class="service-inner">
            <div class="write-info-table">
                  <table>
                    <thead>
                      <th>
                        번호
                      </th>
                      <th class="write-info-title">
                        제목
                      </th>
                      <th>
                        작성일
                      </th>
                      <th>
                        조회수
                      </th>
                    </thead>
                    <tbody>
                    <c:forEach var="clip" items="${clipList}" varStatus="status">
                    <c:set var="wdateStr" value="${clip.writeDate }"></c:set>
				 	<fmt:parseDate var="parseWdate" value="${wdateStr }" pattern="yyyy-MM-dd'T'HH:mm"></fmt:parseDate>
				 	<fmt:formatDate var="wdate" value="${parseWdate }" pattern="yyyy-MM-dd HH:mm"></fmt:formatDate>
                      <tr>
                        <td>
                          ${clip.clipId }
                        </td>
                        <td class="write-info-title">
                          <a href="${pageContext.request.contextPath}/selectClip?clipId=${clip.clipId }">${clip.title }</a>
                        </td>
                        <td>
                          ${clip.writeDate }
                        </td>
                        <td>
                          ${clip.views }
                        </td>
                      </tr>
                    </c:forEach> 
                    </tbody>
                    </table>
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
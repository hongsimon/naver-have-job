<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/changeProfile.js"></script>

	  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
	  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
	  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" />
	  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
	  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/service.css">
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
      <div class="col-xs-10">
        <div class="service-user">
          <div class="service-inner">
            <div>
              <form action="broadcasterApply" method="post">
              <input type="hidden" name="userId" value="${authUser.userId }">
                <div class="service-appli">
                  <h2>게시판 신청하기</h2>
                  <div>
                    자신의 게시판을 신청할 수 있습니다.
                  </div>
                </div>
                <div class="service-delNotice">
                  <div>
                    게시판 이름
                    <div class="service-appli-nick">
                     ${authUser.nickName }
                    </div>
                      자신의 닉네임으로 변경되며 가능하면 한글로 하셔야 시청자들이 게시판을 찾기 쉽습니다.
                  </div>
                  <div class="service-appli-why">
                    게시판 사용 목적<br />
                    <textarea name="content" rows="8" cols="120"></textarea>
                  </div>
                  <div class="service-appli-email">
                    방송국 주소<br />
                    <input type="text" name="broadcasterURL">
                    연락 가능한 이메일 주소를 알려주세요. 게시판 요청 승인 시 메일로 전송됩니다.
                  </div>
                </div>
                <div class="service-appli-btn">
                  <button type="submit" name="button">게시판 신청하기</button>
                </div>
                  </form>
                </div>
              </div>
            </div>

          </div>

        </div>
      </div>
</body>

</html>
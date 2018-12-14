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
          <div class="service-btn">
            <a class="service-btns" id="favoriteList">내가 쓴 게시글</a>
            <a class="service-btn-active"  id="changeProfile">회원정보 수정</a>
            <a class="service-btns" id="userDel">회원 탈퇴</a>
          </div>
          <div class="service-inner">
            <div>
              <form>
                <div class="service-error-msg-in text-center">
                  Please enter your username and password.
                </div>
                <div id="changePwd">
                  <div id="Pwd">
                    비밀번호 변경<br />
                    <input type="password" readonly id="focuse_none"/>
                  </div>

                  <button type="button" class="chnagePwd" id="popOpenBtn">비밀번호 변경</button>
                </div>

                <div id="popup_mask"></div>
                <div>
                  이름<br />
                  <input type="text" autocomplete="false"/>
                </div>
                <div>
                  닉네임<br />
                  <input type="text" autocomplete="false"/>
                </div>
                <div>
                  이름<br />
                  <input type="text" autocomplete="false"/>
                </div>

                <button type="submit" class="service-compl">변경</button>

              </form>
              <div id="popupDiv">
                <div class="popservice">
                  <form>
                    <div>
                      <h2>비밀번호 변경하기</h2>
                    </div>
                    <div class="service-error-msg text-center">
                      Please enter your username and password.
                    </div>
                    <div>
                      현제 비밀번호<br />
                      <input type="password" />
                    </div>
                    <div>
                      새 비밀번호<br />
                      <input type="password" />
                    </div>
                    <div>
                      새 비밀번호 확인<br />
                      <input type="password" />
                    </div>
                    <button type="submit" class="popCloseBtn service-compl">변경</button>
                    <button type="button" class="popCloseBtn popdel chnagePwd">취소</button>
                  </form>
                </div>
              </div>
            </div>

          </div>

        </div>
      </div>
    </div>
  </div>
</body>

</html>

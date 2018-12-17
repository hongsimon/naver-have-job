<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		if(${!empty Success}){
			alert("변경되었습니다.");
		}
	</script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
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
            <a class="service-btns" id="favoriteList" href="favoriteList">내가 쓴 게시글</a>
            <a class="service-btn-active"  id="changeProfile" href="changeProfile">회원정보 수정</a>
            <a class="service-btns" id="userDel" href="userDel">회원 탈퇴</a>
          </div>
          <div class="service-inner">
            <div>
              <form action="${pageContext.request.contextPath}/config/changeProfile" method="POST">
                
                <c:if test="${errors.nickName }">
                <div class="service-error-msg-in text-center">
                  닉네임을 입력해주세요.
                </div>
                </c:if>
                
                <c:if test="${errors.email }">
                <div class="service-error-msg-in text-center">
                  이메일을 입력해주세요.
                </div>       
                </c:if>
                
                <c:if test="${errors.sameNick }">
                <div class="service-error-msg-in text-center">
                  이미 사용중인 닉네임입니다.
                </div>
                </c:if>
                
                <c:if test="${errors.sameEmail }">
                <div class="service-error-msg-in text-center">
                  이미 사용중인 이메일입니다.
                </div>       
                </c:if>
                
                <c:if test="${errors.password || errors.newPw || errors.newPwCk || errors.notMatchPassword || errors.notMatchNewPassword || errors.matchNowPw }">
                <div class="service-error-msg-in text-center">
                  비밀번호 변경에 실패했습니다.<br>
                  비밀번호 변경 창을 확인해주세요.
                </div>       
                </c:if>
                
                
                <div id="changePwd">
                  <div id="Pwd">
                    비밀번호 변경<br />
                    <input type="password" readonly id="focuse_none"/>
                  </div>

                  <button type="button" class="chnagePwd" id="popOpenBtn">비밀번호 변경</button>
                </div>

                <div id="popup_mask"></div>
                <div>
                  닉네임<br />
                  <input type="text" autocomplete="false" value="${authUser.nickName }" name="nickName"/>
                </div>
                <div>
                  이메일<br />
                  <input type="text" autocomplete="false" value="${authUser.email }" name="email"/>
                </div>
                <div>
				  <input type="hidden" name="userId" value="${authUser.userId }">
                <button type="submit" class="service-compl">변경</button>

              </form>
              <div id="popupDiv">
                <div class="popservice">
                
                  <form action="${pageContext.request.contextPath}/config/changeProfile/password" method="POST">
                    <div>
                      <h2>비밀번호 변경하기</h2>
                    </div>
                    
                    <c:if test="${errors.password }">
                    <div class="service-error-msg text-center">
                      현재 비밀번호를 입력해주세요.
                    </div>
                    </c:if>
                    
                    <c:if test="${errors.newPw }">
                    <div class="service-error-msg text-center">
                      새 비밀번호를 입력해주세요.
                    </div>
                    </c:if>
                    
                    <c:if test="${errors.newPwCk }">
                    <div class="service-error-msg text-center">
                      새 비밀번호 확인을 입력해주세요.
                    </div>
                    </c:if>
                    
                    <c:if test="${errors.notMatchPassword }">
                    <div class="service-error-msg text-center">
                      현재 비밀번호가 일치하지 않습니다.
                    </div>
                    </c:if>
                    
                    <c:if test="${errors.notMatchNewPassword }">
                    <div class="service-error-msg text-center">
                      새 비밀번호가 일치하지 않습니다.
                    </div>
                    </c:if>
                    
                    <c:if test="${errors.matchNowPw }">
                    <div class="service-error-msg text-center">
                      새 비밀번호가 현재 비밀번호와 일치합니다.
                    </div>
                    </c:if>
                    
                      <input type="hidden" name="userId" value="${authUser.userId }">
                    <div>
                      현제 비밀번호<br />
                      <input type="password" name="nowPw"/>
                    </div>
                    <div>
                      새 비밀번호<br />
                      <input type="password" name="newPw"/>
                    </div>
                    <div>
                      새 비밀번호 확인<br />
                      <input type="password" name="newPwCk"/>
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

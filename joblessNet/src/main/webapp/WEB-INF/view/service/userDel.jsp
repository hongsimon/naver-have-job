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
            <a class="service-btns" id="favoriteList" href="favoriteList">내가 쓴 게시글</a>
            <a class="service-btns"  id="changeProfile" href="changeProfile">회원정보 수정</a>
            <a class="service-btn-active"  id="userDel" href="userDel">회원 탈퇴</a>
          </div>
        
          <div class="service-inner">
            <div>
              <form action="userDel" method="POST">
                <div>
                  <h2>JobLess 회원탈퇴 안내</h2>
                </div>
                <div class="service-delNotice">
                  <div class="service-waring">
                    <span class="glyphicon glyphicon-alert"></span>회원탈퇴를 신청하기 전에 안내 사항을 꼭 확인해 주세요.
                  </div>
                  <div>
                    <span class="glyphicon glyphicon-exclamation-sign"></span>사용하고 계신
                    <div class="service-del-id">
                      ${authUser.nickName } (${authUser.loginId })
                    </div>은 탈퇴할 경우 재사용 및 복구가 불가능합니다.
                  </div>
                  <div>
                    · 탈퇴한 아이디는 본인과 타인 모두 재사용 및 복구가 불가 하오니 신중하게 선택하시기 바랍니다.
                  </div>
                  <div>
                    <span class="glyphicon glyphicon-exclamation-sign"></span>탈퇴 후 회원정보 및 서비스 이용 기록은 모두 삭제 됩니다.
                  </div>
                  <div>
                    · 회원정보 이용 기록은 모두 삭제되며, 삭제된 데이터는 복구되지 않습니다.
                  </div>
                  <div>
                    · 삭제되는 내용을 확인하시고 필요한 데이터는 미리 백업해 주세요.
                  </div>
                  <div>
                    <span class="glyphicon glyphicon-exclamation-sign"></span>탈퇴 후에도 등록한 게시물 및 댓글은 그대로 남아 있습니다.
                  </div>
                  <div>
                    · 회원님이 올린 게시글 및 댓글은 탈퇴 시 자동 삭제 되지 않고 그대로 남아 있습니다.
                  </div>
                  <div>
                    · 삭제를 원하는 게시글이 있다면 반드시 탈퇴 전에 삭제하시기 바랍니다.
                  </div>
                  <div>
                    · 탈퇴 후에는 회원정보가 삭제되어 본인 여부를 확인할 수 있는 방법이 없어, 게시글을 관리자가 임의로 삭제해 드릴 수 없습니다.
                  </div>
                  <div>
                    <span class="glyphicon glyphicon-exclamation-sign"></span>게시판에 남아있는 게시글은 탈퇴 후 삭제할 수 없습니다.
                  </div>
                  <div>
                    <span class="glyphicon glyphicon-exclamation-sign"></span>탈퇴 후에는 <div class="service-del-id">
                      ${authUser.nickName } (${authUser.loginId })
                    </div>로 아이디와 데이터는 복구할 수 없습니다.
                  </div>
                </div>
                    <div class='service-checkbox'>
                      <input type="checkbox" id="del-check" >
                      <label for="scales">안내 사항을 모두 확인하였으며 이에 동의합니다.</label>
                    </div>
                    <div class="service-del-btn">
                      <input  type="hidden" name="userId" value="${authUser.userId }">
                      <button type="submit" name="button" class="del-btn-false"><span class="glyphicon glyphicon-trash"></span>회원 탈퇴하기</button>
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

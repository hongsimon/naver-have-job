<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
      <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/borderJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/change_comm.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/userService.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/write.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/User_service.css">
      
    
    <meta charset="utf-8" />

	<!-- include summernote css/js -->
	<link href="${pageContext.request.contextPath}/summernote/summernote.css" rel="stylesheet">
	<script src="${pageContext.request.contextPath}/summernote/summernote.js"></script>
	<script src="${pageContext.request.contextPath}/summernote/lang/summernote-ko-KR.js"></script>
	
	<script>
    	$(document).ready(function() {
			$('#summernote').summernote({ // summernote를 사용하기 위한 선언
				height: 400,
				lang: 'ko-KR',
				callbacks: {
					onImageUpload: function(files) {
						sendFile(files[0]);
					}
				}
			});
    	});
    	
    	function sendFile(file) {
            // 파일 전송을 위한 폼생성
	 		data = new FormData();
	 	    data.append("uploadFile", file);
	 	    $.ajax({ // ajax를 통해 파일 업로드 처리
	 	        data : data,
	 	        type : "POST",
	 	        url : "imgUpload",
	 	        enctype : "multipart/form-data",
	 	        cache : false,
	 	        contentType : false,
	 	        processData : false,
	 	        success : function(data) { // 처리가 성공할 경우
	 	        	console.log(data)
                    $("#summernote").summernote('insertImage', data.url);
	 	        }
	 	    });
	 	}
  	</script>
    <title>백수넷 - 클립 작성</title>
    <%@include file="../share-nav/nav-header.jsp"%>

  </head>
  <body>

        <!-- 우측 메인 메뉴바 -->
        <div class="container margin-nav">
          <div class="row">
          		<%@include file="../share-nav/nav-service.jsp"%>

            <!-- 게시판 메뉴 -->
            <div class="col-xs-10 setController">

              <div class="row margin-container">
                <div class="col-xs-12 ">
                  <div class="writeCommunity">
                    <div class="border-title">
                      <div>
                        [게시판이름]
                      </div>
                      -게시글 작성
                    </div>
                    <div class="writeCommunity-form">
                    	<form method="post">
                      		<select name="borderName" class="borderSelect">
								<option value="none">게시판선택</option>
	                        		
	                        	<c:if test="${authUser.admin eq false}">
	                        		<c:forEach var="category" items="${boardCategoryList}" varStatus="status">
	                        			<c:if test="${category.categoryName ne '공지' }">
	    	                    			<c:if test="${category.categoryName ne '이벤트' }">
					                			<option value="${category.boardCategoryId }">${category.categoryName }${category.boardCategoryId }</option>
					                		</c:if>
	                        			</c:if>
				                	</c:forEach>                       		
								</c:if>
	                        	<c:if test="${authUser.admin eq true }">
	                        		<c:forEach var="category" items="${boardCategoryList}" varStatus="status">
	                        			<option value="${category.boardCategoryId }">${category.categoryName }</option>
	                        		</c:forEach>
	                        	</c:if>
                        	</select>
	                        <div class="writeCommunity-title">
	                        	<input type="text" name="postTitle" value="${postReq.title }" placeholder="제목">
	                        	<input type="hidden" name="writerId" value="${authUser.userId }">
	                        	<input type="hidden" name="boardId" value="${postReq.boardId }">
	                        	<input type="hidden" name="postId" value="${postReq.postId }">
	                        	<input type="hidden" name="categoryId" value="${postReq.categoryId }">
	                        </div>
	                        <div class="writeCommunity-content ">
								<textarea id="summernote" name="content">${postReq.content }</textarea>
	                        </div>
	                        <div class="writeCommunity-btn">
	                        	<a><span class="glyphicon glyphicon-repeat"></span>작성취소</a>
	                        	<button type="submit" class="con-right"><span class="glyphicon glyphicon-pencil"></span>작성</button>
	                        </div>
                    	</form>
                    </div>
                  </div>
                </div>
            </div>
          </div>
        </div>
      </div>
      <%@include file="../share-nav/controller.jsp"%>
  </body>
</html>


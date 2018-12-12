<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    
        <%@include file="../header_Service/pageContextService.jsp"%>
    
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
            <div class="col-xs-10">

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
                          <option value="freeTalk">자유</option>
                          <option value="joke">유머</option>
                          <option value="news">소식</option>
                          <option value="game">게임</option>
                        </select>
                        <div class="writeCommunity-title">
                          <input type="text" name="postTitle" value="" placeholder="제목">
                          <input type="hidden" name="writerId" value="${authUser.userId }">
                          <input type="hidden" name="boardId" value="${postReq.boardId }">
                        </div>
                        <div class="writeCommunity-content ">
							<textarea id="summernote" name="content"></textarea>
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
  </body>
</html>


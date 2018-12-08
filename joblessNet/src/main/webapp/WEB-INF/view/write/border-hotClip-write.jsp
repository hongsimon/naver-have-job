<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/transform-videoUri.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/borderJs.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/write.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
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
                <div class="col-xs-12">
                  <div class="writeHotClip">
                    <div class="title-text-more-big ">
                      클립 올리기
                      <a href="#" class="back">&lt;&lt;&lt;돌아가기</a>
                    </div>
                    <div class="clip-write">
                      <form class="" action="#" method="post">
                        클립 주소
                        <input type="text" name="clip_url" placeholder="<iframe>...</iframe>">

                        클립 제목
                        <input type="text" name="" value="">

                        <div>
                          음란물/광고 등 부적절한 영상은 임의로 삭제될 수 있으며, 관리를 위해 등록한 시간과 등록자의 IP 주소가 기록됩니다. IP 주소는 공개적으로 노출되지 않습니다.
                        </div>
                        <button type="submit" name="button">업로드</button>
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

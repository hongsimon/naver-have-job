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
            <div class="col-xs-10 hotclip">

              <div class="hotclip">
                <div class="col-xs-12 writeHotClip hotclip">
                  <div class="hotClip-box">
                    <div class="title-text-more-big ">
                      클립 올리기
                      <a href="#" class="clip-back">&lt;돌아가기</a>
                    </div>
                    <div class="clip-write">
                      <form class="" action="#" method="post">
                        <div>
                          클립 주소
                          <input type="text" name="clip" placeholder="https://youtu.be/..." class="clip">
                          <P>
                            동영상 업로드 방식은 <a href="#">튜토리얼</a>을 참고하시길 바랍니다.
                          </P>
                        </div>
                        <div>
                          <input type="hidden" name="clip_url" class="clip_url" />
                          <input type="hidden" name="clip_Thumbnail" class="clip_Thumbnail" />
                        </div>
                        <div>
                          클립 제목
                          <input type="text" name="" value="">
                          <p>
                            공유하고싶은 동영상의 제목을 자유롭게 기재해주시길 바랍니다.
                          </p>
                        </div>
                        <div>
                          방송인
                          <input type="text" name="" value="" class="clip-broadcaster" id="searchBox"/>
                          <p>
                            공유하고싶은 동영상의 방송인을 정확하게 기재해주시길 바랍니다.
                          </p>
                            <button type="button" class="clip-broadcaster-btn-down clip-broadcaster-btn"><span class="glyphicon glyphicon-chevron-down"></span>방송인 목록</button>
                            <button type="button" class="clip-broadcaster-btn-up clip-broadcaster-btn"><span class="glyphicon glyphicon-chevron-up"></span>방송인 목록</button>
                              <div id="broadcasterList" class="broadcasterList ">
                                <div class="broadcasterClass ">
                                    <div class="head-title">
                                        A-Z
                                    </div>
                                      <div>
                                        <a>a</a>
                                      </div>
                                      <div>
                                        <a >BLANC7_SHINWOO</a>
                                      </div>
                                      <div>
                                        <a >abc</a>
                                      </div>
                                  </div>
                                  <div class="broadcasterClass ">
                                      <div class="head-title">
                                          ㄱ
                                      </div>
                                        <div>
                                          <a >가그</a>
                                        </div>
                                        <div>
                                          <a >가이코</a>
                                        </div>
                                        <div>
                                          <a >김재원</a>
                                        </div>
                                        <div>
                                          <a >김도</a>
                                        </div>
                                    </div>
                                    <div class="broadcasterClass ">
                                        <div class="head-title">
                                            ㄴ
                                          </div>
                                          <div>
                                            <a >노돌리</a>
                                          </div>
                                          <div>
                                            <a >녹두로</a>
                                          </div>
                                          <div>
                                            <a >눈쟁이</a>
                                          </div>
                                      </div>
                                      <div class="broadcasterClass ">
                                          <div class="head-title">
                                              ㄷ
                                          </div>
                                            <div>
                                              <a >닥터준</a>
                                            </div>
                                            <div>
                                              <a >듀라한</a>
                                            </div>
                                      </div>
                                      <div class="broadcasterClass ">
                                          <div class="head-title">
                                              ㄹ
                                            </div>
                                            <div>
                                              <a >로복</a>
                                            </div>
                                            <div>
                                              <a >레바</a>
                                            </div>
                                      </div>
                                      <div class="broadcasterClass ">
                                          <div class="head-title">
                                              ㅁ
                                            </div>
                                            <div>
                                              <a >마루에몽</a>
                                            </div>
                                            <div>
                                              <a href="#">머독</a>
                                            </div>
                                      </div>
                          </div>
                        </div>
                        <p style="margin-top:10px;">
                          음란물/광고 등 부적절한 영상은 임의로 삭제될 수 있으며, 관리를 위해 등록한 시간과 등록자의 IP 주소가 기록됩니다. <br />
                          IP 주소는 공개적으로 노출되지 않습니다.
                        </p>

                        <button type="submit" name="button" class="hotClip-upload"><span class="glyphicon glyphicon-facetime-video"></span>업로드</button>
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

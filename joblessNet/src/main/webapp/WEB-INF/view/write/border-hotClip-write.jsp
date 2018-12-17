<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@
	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" 
 %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
     	  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/borderJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/hangul.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/searchBroadcaster.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/transform-videoUri.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/userService.js"></script>


    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/border.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/write.css">
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

                          <div class=" margin-container ">
                            <div class="writeHotClip">
                              <div class="hotClip-box">
                                <div class="title-text-more-big ">
                                  클립 올리기
                                  <a href="viewClip?active=thumbs-up" class="clip-back">&lt;돌아가기</a>
                                </div>
                                <div class="clip-write">
                                  <form class="" action="insertClip" method="post">
                                    <div>
                                      클립 주소
                                      <input type="text" name="clip" placeholder="https://youtu.be/..." class="clip">
                                      <P>
                                        동영상 업로드 방식은 <a href="#">튜토리얼</a>을 참고하시길 바랍니다.
                                      </P>
                                    </div>
                                    <div>
                                      <input type="hidden" name="writerId" value="${authUser.userId}" />
                                      <input type="hidden" name="clip_url" class="clip_url" />
                                      <input type="hidden" name="clip_Thumbnail" class="clip_Thumbnail" />
                                    </div>
                                    <div>
                                      클립 제목
                                      <input type="text" name="title" value="">
                                      <p>
                                        공유하고싶은 동영상의 제목을 자유롭게 기재해주시길 바랍니다.
                                      </p>
                                    </div>
                                    <div>
                                      방송인
                                      <input type="text" name="broadcasterNick" value="" class="clip-broadcaster" id="searchBox"/>
                                      <p>
                                        공유하고싶은 동영상의 방송인을 정확하게 기재해주시길 바랍니다.
                                      </p>
                                        <button type="button" class="clip-broadcaster-btn-down clip-broadcaster-btn"><span class="glyphicon glyphicon-chevron-down"></span>방송인 목록</button>
                                        <button type="button" class="clip-broadcaster-btn-up clip-broadcaster-btn"><span class="glyphicon glyphicon-chevron-up"></span>방송인 목록</button>
                                          <div id="broadcasterList" class="broadcasterList ">
                                            <div class="broadcasterClass ">
                                            <div class="broadcasterList-t">
	                   							  <!-- 닉네임, -->
	                    						 <c:forEach var="streamer" items="${streamerList}" varStatus="status">
	                     							${streamer.nickName},
						                     	 </c:forEach>
                    						</div>
			                           		 <div class="head-title">
			                                	A-Z
			                            	</div>
			                          		</div>
			                            <div class="broadcasterClass ">
			                              <div class="head-title">
			                                  ㄱ
			                              </div>
			                            </div>
			                            <div class="broadcasterClass ">
			                                <div class="head-title">
			                                    ㄴ
			                                  </div>
			                              </div>
			                              <div class="broadcasterClass ">
			                                  <div class="head-title">
			                                      ㄷ
			                                  </div>
			                              </div>
			                              <div class="broadcasterClass ">
			                                  <div class="head-title">
			                                      ㄹ
			                                    </div>
			                              </div>
			                              <div class="broadcasterClass ">
			                                  <div class="head-title">
			                                      ㅁ
			                                    </div>
			                              </div>
			
			                              <div class="broadcasterClass ">
			                                  <div class="head-title">
			                                      ㅂ
			                                    </div>
			                              </div>
			
			                              <div class="broadcasterClass ">
			                                  <div class="head-title">
			                                      ㅅ
			                                    </div>
			                              </div>
			
			                              <div class="broadcasterClass ">
			                                  <div class="head-title">
			                                      ㅇ
			                                    </div>
			                              </div>
			
			                              <div class="broadcasterClass ">
			                                  <div class="head-title">
			                                      ㅈ
			                                    </div>
			                              </div>
			
			                              <div class="broadcasterClass ">
			                                  <div class="head-title">
			                                      ㅊ
			                                    </div>
			                              </div>
			
			                              <div class="broadcasterClass ">
			                                  <div class="head-title">
			                                      ㅋ
			                                    </div>
			                              </div>
			
			                              <div class="broadcasterClass ">
			                                  <div class="head-title">
			                                      ㅌ
			                                    </div>
			                              </div>
			
			                              <div class="broadcasterClass ">
			                                  <div class="head-title">
			                                      ㅍ
			                                    </div>
			                              </div>
			
			                              <div class="broadcasterClass ">
			                                  <div class="head-title">
			                                      ㅎ
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
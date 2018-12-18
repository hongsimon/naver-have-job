<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
   	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/borderJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/view.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/userService.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/border.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/view.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/write.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/User_service.css">
   	

    <meta charset="utf-8" />
    <script type="text/javascript">
		if(${!empty errors.NotMoreLike}){
			var link = "selectClip?clipId=";
				link += ${clip_or_postId};
			alert("추천은 한번만 가능합니다.");
			location.href=link	;
		}
    </script>
    <title>백수넷</title>
	<%@include file="../share-nav/nav-header.jsp"%>
  </head>
  <body>
        <div class="container margin-nav setController">
          <div class="row">
              <div class="row margin-container hotclip-view">
                <div class="col-xs-8 hotclip-view-box">
                  <div>
                    <div class="hotclip-view-frame">
                      <iframe src="${clipDetail.clip.clipURL }" frameborder="0" scrolling="no" allowfullscreen="true"></iframe>
                    </div>
                    <div class="hotclip-title-view ">
                    ${clipDetail.clip.title }
                    </div>
                    <div class="bordcaster-name">
                      <a>${clipDetail.broadcaster.nickName }</a>
                    </div>
                    <div class="hotclip-views">
                      <div>
                        조회수
                        <p>
                          ${clipDetail.clip.views }
                        </p>
                        회
                      </div>
                      <c:if test="${clipDetail.clip.writerId == authUser.userId }">
	                      <div class="con-right hotclip-del-btn">
	                        <a href="deleteClip?clipId=${clipDetail.clip.clipId}">삭제</a>
	                      </div>
                      </c:if>
                      <div class="con-right like-btn">
                      
                      	<c:if test="${empty authUser }">
                      		<button type="submit" onclick="window.alert('로그인이 필요한 서비스입니다.')"><span class="glyphicon glyphicon-thumbs-up"></span>&nbsp;${clipDetail.likes}</button>
                      	</c:if>
                      
                      
 						<!-- 로그인상태 -->                     
                        <c:if test="${!empty authUser }">
                      	<form action="clipLike" method="Post">
                      		<input type="hidden" name="userId" value="${authUser.userId }">
                      		<input type="hidden" name="clip_or_postId" value="${clipDetail.clip.clipId}">
                        	<button type="submit"><span class="glyphicon glyphicon-thumbs-up"></span>&nbsp;${clipDetail.likes}</button>
                        </form>
                        </c:if>
                      </div>
                    </div>
                  </div>

                  <!-- -댓글- -->
                  <hr />

                  <div class="clip-write-info">
                    <div class="clip-icon ">
                      <c:choose>
	                  <c:when test="${clipDetail.clip.platformId == 1}">
	                    <img src="${pageContext.request.contextPath}/images/icon/icon-A.png" alt="" class="icon-size">
	                  </c:when>
	                  
	                  <c:when test="${clipDetail.clip.platformId == 2}">
	                    <img src="${pageContext.request.contextPath}/images/icon/icon-T.png" alt="" class="icon-size">
	                  </c:when>
	                  
	                  <c:when test="${clipDetail.clip.platformId == 3}">
	                    <img src="${pageContext.request.contextPath}/images/icon/icon-Y.png" alt="" class="icon-size">
	                  </c:when> 
	                  
	                  <c:when test="${clipDetail.clip.platformId == 4}">
	                    <img src="${pageContext.request.contextPath}/images/icon/icon-K.png" alt="" class="icon-size">
	                  </c:when>
                  </c:choose>
                    </div>
                    <div class="clip-write-user">
                      <div class="clip-writer">
						${clipDetail.writer.nickName}
                      </div>
                      <div class="clip-write-day">
                        게시일 :
                        <p>
                        <c:set var="wdateStr" value="${clipDetail.clip.writeDate.toString() }"></c:set>									
						<fmt:parseDate var="parseWdate" value="${wdateStr }" pattern="yyyy-MM-dd'T'HH:mm"></fmt:parseDate>
						<fmt:formatDate var="wdate" value="${parseWdate }" pattern="yyyy-MM-dd HH:mm"></fmt:formatDate>
                          ${wdate}
                        </p>
                      </div>
                    </div>
                  </div>

                  <hr />

                  <div class="hotclip-comment">
                    <div  class="hotclip-likes">
                      댓글<p> ${countComment } </p> 개
                    </div>                
                    <div class="hotclip-comment-input">
                      <div class="clip-icon">
                        <c:choose>
	                  <c:when test="${authUser.platformId == 1}">
	                    <img src="${pageContext.request.contextPath}/images/icon/icon-A.png" alt="" class="icon-size">
	                  </c:when>
	                  
	                  <c:when test="${authUser.platformId == 2}">
	                    <img src="${pageContext.request.contextPath}/images/icon/icon-T.png" alt="" class="icon-size">
	                  </c:when>
	                  
	                  <c:when test="${authUser.platformId == 3}">
	                    <img src="${pageContext.request.contextPath}/images/icon/icon-Y.png" alt="" class="icon-size">
	                  </c:when> 
	                  
	                  <c:when test="${authUser.platformId == 4}">
	                    <img src="${pageContext.request.contextPath}/images/icon/icon-K.png" alt="" class="icon-size">
	                  </c:when>
                  </c:choose>
                      </div>
                      <div class="">
                        <form method="post" action="insertClipComment">
                          <input type="hidden" name="clipId" value="${clipDetail.clip.clipId }">
                          <input type="hidden" name="postId" value=0>
                          <input type="hidden" name="userId" value="${authUser.userId }">
                          <input type="text" name="content" placeholder="댓글을 입력하세요..." id="hotclip-comment-input" class="clip-comment-box">
                          <button type="submit" name="button"><span class="glyphicon glyphicon-pencil" class="clip-comment-submit"></span>작성</button>
                        </form>
                      </div>
                    </div>
                    <div class="clip-comments">
                      <ul>
                      <c:forEach items="${commentList}" var="comment" varStatus="status">                                     
                        <li>
                          <div class="clip-comment-user-info">
                            <div class="clip-comment-user-icon">
                              <c:choose>
				                  <c:when test="${comment.platformId == 1}">
				                    <img src="${pageContext.request.contextPath}/images/icon/icon-A.png" alt="" class="icon-size">
				                  </c:when>
				                  
				                  <c:when test="${comment.platformId == 2}">
				                    <img src="${pageContext.request.contextPath}/images/icon/icon-T.png" alt="" class="icon-size">
				                  </c:when>
				                  
				                  <c:when test="${comment.platformId == 3}">
				                    <img src="${pageContext.request.contextPath}/images/icon/icon-Y.png" alt="" class="icon-size">
				                  </c:when> 
				                  
				                  <c:when test="${comment.platformId == 4}">
				                    <img src="${pageContext.request.contextPath}/images/icon/icon-K.png" alt="" class="icon-size">
				                  </c:when>
			                  </c:choose>
                            </div>
                            <div class="clip-comment-user-comment">
                              <div class="clip-comment-user-writer">
                               	${comment.writerNickname }
                                <div class="clip-comment-service">
                                  <c:if test="${comment.userId == authUser.userId }">
                                  	<a href="deleteComment?commentId=${comment.commentId }">삭제</a>
                                  </c:if>
                                  <a>신고</a>
                                </div>
                              </div>
                              <div class="clip-comment-user-contents ">
                              	${comment.content }
                              </div>
                            </div>
                          </div>
                        </li> 
                       </c:forEach>         
                      </ul>
                    </div>


                  </div>



                </div>
                <div class="col-xs-4">
                  <div class="clip-list-view">
                    <ul>
                    <c:forEach var="clipDetail" items="${clipDetailList}" varStatus="status" begin="0" end="20">
                 	<c:set var="wdateStr" value="${clipDetail.clip.writeDate }"></c:set>
				 	<fmt:parseDate var="parseWdate" value="${wdateStr }" pattern="yyyy-MM-dd'T'HH:mm"></fmt:parseDate>
				 	<fmt:formatDate var="wdate" value="${parseWdate }" pattern="yyyy-MM-dd HH:mm"></fmt:formatDate>
                      <li class="">
                        <a href="selectClip?clipId=${clipDetail.clip.clipId }">
                          <div class="clip-list-view-video-info">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="${clipDetail.clip.thumbURL}"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a href="selectClip?clipId=${clipDetail.clip.clipId }" id="clip-list-title">${clipDetail.clip.title}</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>${clipDetail.writer.nickName }</p>조회수<p>${clipDetail.clip.views }</p>
                              </div>
                              <div class="clip-list-view-info">
                                <div>
                                  <span class="glyphicon glyphicon-thumbs-up"></span>${clipDetail.likes }
                                </div>
                                <div>
                                  <span class="glyphicon glyphicon-comment"></span>${clipDetail.comments }
                                </div>
                              </div>
                            </div>
                          </div>
                        </a>
                      </li>
					 </c:forEach>	
                    </ul>
                  </div>
                <a href="${pageContext.request.contextPath}/viewClip?active=thumbs-up"" style="  text-decoration: none;">
                  <div class="border-hotclip-view-more">
                    <div> <span class="glyphicon glyphicon-list-alt"></span> 더보기</div>
                  </div>
                </a>
                </div>



              </div>
            </div>
          </div>
           <%@include file="../share-nav/controller.jsp"%>
  </body>
</html>

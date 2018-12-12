<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
   <%@include file="../header_Service/pageContextService.jsp"%>

    <meta charset="utf-8" />
    <script type="text/javascript">

    </script>
    <title>백수넷</title>
	<%@include file="../share-nav/nav-header.jsp"%>
  </head>
  <body>
        <div class="container margin-nav">
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
                        <button><span class="glyphicon glyphicon-thumbs-up"></span>&nbsp;${clipDetail.likes}</button>
                      </div>
                    </div>
                  </div>

                  <!-- -댓글- -->
                  <hr />

                  <div class="clip-write-info">
                    <div class="clip-icon ">
                      <img />
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
                        <img />
                      </div>
                      <div class="">
                        <form method="post" action="insertClipComment">
                          <input type="hidden" name="clipId" value="${clipDetail.clip.clipId }">
                          <input type="hidden" name="postId" value=0>
                          <input type="hidden" name="userId" value="${authUser.userId }">
                          <input type="text" name="content" placeholder="댓글을 입력하세요..." class="clip-comment-box">
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
                              <img />
                            </div>
                            <div class="clip-comment-user-comment">
                              <div class="clip-comment-user-writer">
                               	${comment.userId }
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
                    <c:forEach var="clip" items="${clipList}" begin="1" end="20">
                      <li class="">
                        <a>
                          <div class="clip-list-view-video-info">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">${clip.title }</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>${clip.broadcasterId}</p>${clip.views }<p>0</p>
                              </div>
                              <div class="clip-list-view-info">
                                <div>
                                  <span class="glyphicon glyphicon-thumbs-up"></span>0
                                </div>
                                <div>
                                  <span class="glyphicon glyphicon-comment"></span>0
                                </div>
                              </div>
                            </div>
                          </div>
                        </a>
                      </li>
					 </c:forEach>	
                    </ul>
                  </div>
                <a href="viewClip" style="  text-decoration: none;">
                  <div class="border-hotclip-view-more">
                    <div> <span class="glyphicon glyphicon-list-alt"></span> 더보기</div>
                  </div>
                </a>
                </div>



              </div>
            </div>
          </div>
  </body>
</html>

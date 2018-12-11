<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                      <iframe src="https://clips.twitch.tv/embed?autoplay=false&clip=FlirtyCalmBatOneHand&tt_content=embed&tt_medium=clips_embed" frameborder="0" scrolling="no" allowfullscreen="true"></iframe>
                    </div>
                    <div class="hotclip-title-view ">
                    ${clip.title }
                    </div>
                    <div class="bordcaster-name">
                      <a>${clip.broadcasterId }</a>
                    </div>
                    <div class="hotclip-views">
                      <div>
                        조회수
                        <p>
                          ${clip.views }
                        </p>
                        회
                      </div>
                      <c:if test="${clip.writerId == authUser.userId }">
	                      <div class="con-right hotclip-del-btn">
	                        <a href="deleteClip?clipId=${clip.clipId}">삭제</a>
	                      </div>
                      </c:if>
                      <div class="con-right like-btn">
                        <button><span class="glyphicon glyphicon-thumbs-up"></span>0</button>
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
                        머룽이다룽
                      </div>
                      <div class="clip-write-day">
                        게시일 :
                        <p>
                          2018.12.08
                        </p>
                      </div>
                    </div>
                  </div>

                  <hr />

                  <div class="hotclip-comment">
                    <div  class="hotclip-likes">
                      댓글<p> 0 </p> 개
                    </div>                
                    <div class="hotclip-comment-input">
                      <div class="clip-icon">
                        <img />
                      </div>
                      <div class="">
                        <form method="post" action="insertComment">
                          <input type="hidden" name="clipId" value="${clip.clipId }">
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
                                  	<a>삭제</a>
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
                      <li class="">
                        <a>
                          <div class="clip-list-view-video-info">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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

                      <li>
                        <a>
                          <div class="clip-list-view-video-info ">
                            <div class="clip-list-view-thumbnails" style="display:inline-block;">
                              <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                            </div>
                            <div class="" style="display:inline-block;">
                              <div class="clip-list-view-title">
                                <a id="clip-list-title">승권이 마약파티</a>
                              </div>
                              <div class="clip-list-view-views">
                                <p>갱생레바</p>조회수<p>0</p>
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



                    </ul>
                  </div>
                <a href="#" style="  text-decoration: none;">
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

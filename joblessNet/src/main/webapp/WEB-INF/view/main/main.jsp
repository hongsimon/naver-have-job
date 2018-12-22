<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/banner.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/count_order.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/change_comm.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/userService.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/borderJs.js"></script>
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/User_service.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/userService.js"></script>
    
    <meta charset="utf-8" />
    <script type="text/javascript">

    </script>
    <title>백수넷</title>
    <%@include file="../share-nav/nav-header.jsp"%>

  </head>
  <body>
        <!-- 우측 메인 메뉴바 -->
        <div class="container margin-nav">
          <div class="row ">
            <%@include file="../share-nav/nav-service.jsp"%>

            <!-- 게시판 메뉴 -->
            <div class="col-xs-10 setController">

              <div class="row margin-container">
                <!-- 커뮤니티 인기글 -->
                <div class="col-xs-6 ">
                  <div class="margin-title">
                    <a href="viewPostList?boardId=1&likeN=1" class="not-working-a">
                      <p class="title-text-big display-in title-text">커뮤니티 인기글</p>
                      <span class="glyphicon glyphicon-menu-right gly-size-middle display-in gly-color"></span>
                    </a>
                  </div>
                  <!-- 내용 -->
                  	<div class="best-content border-padding">
                    <!-- 이곳을 수정하세용 -->
                    	<ul class="best-content-border border_size">

                      		<c:forEach var="post" items="${postLikeList }" begin="0" end="9" >
                      			<li>
	                        		<div>
	                          			<div class="board-name con-left">
	                            			<a>${post.boardCategory.categoryName }</a>
	                          			</div>
	                          			<div class="content con-left">
	                            			<a href="viewPost?postId=${post.post.postId}&boardId=${post.post.boardId }"><span class="glyphicon glyphicon-comment"></span>${post.post.title}</a>
	                          			</div>
	                          			<div class="board-comment point-color">
	                            			<c:if test="${post.comments != null}">
												<c:choose>
													<c:when test="${post.comments > 999 }">
														<div>[999+]</div>
													</c:when>
													<c:otherwise>
														<div>[${post.comments }]</div>
													</c:otherwise>
												</c:choose>
											</c:if>
											<c:if test="${post.comments == null}">
												<div>[0]</div>
											</c:if>
	                          			</div>
	                        		</div>
								</li>
                      		</c:forEach>
                    	</ul>
                  	</div>
                </div>

                <!-- Q&A -->
                <div class="col-xs-6 ">
                  <div class="margin-title">
                    <a href="viewPostList?boardId=1" class="not-working-a">
                      <p class="title-text-big display-in title-text">전체글 </p>
                      <span class="glyphicon glyphicon-menu-right gly-size-middle display-in gly-color"></span>
                    </a>
                  </div>
                  <div class="q-and-a border-padding">
                    <!-- 이곳을 수정하세용 -->
                   	<ul class="best-content-border border_size">

                      	<c:forEach var="post" items="${postAllList }" begin="0" end="9" >
                      			<li>
	                        		<div>
	                          			<div class="board-name con-left">
	                            			<a>${post.boardCategory.categoryName }</a>
	                          			</div>
	                          			<div class="content con-left">
	                            			<a href="viewPost?postId=${post.post.postId}&boardId=${post.post.boardId }"><span class="glyphicon glyphicon-comment"></span>${post.post.title}</a>
	                          			</div>
	                          			<div class="board-comment point-color">
	                            			<c:if test="${post.comments != null}">
												<c:choose>
													<c:when test="${post.comments > 999 }">
														<div>[999+]</div>
													</c:when>
													<c:otherwise>
														<div>[${post.comments }]</div>
													</c:otherwise>
												</c:choose>
											</c:if>
											<c:if test="${post.comments == null}">
												<div>[0]</div>
											</c:if>
	                          			</div>
	                        		</div>
								</li>
                      	</c:forEach>
                    </ul>
                  </div>
                </div>
              </div>

              <!-- 공지사항 -->
              <div class="row margin-container">
                <div class="col-xs-12">

                    <!-- 이벤트 -->
                    <div class="col-xs-6 notice notice-event border-padding">
                      <ul class="notice-border border_size notice-border-event">
                        <c:forEach var="post" items="${postNoticeList }" begin="0" end="1" >
                      			<li>
	                        		<div>
	                          			<div class="board-name con-left">
	                            			<a>${post.boardCategory.categoryName }</a>
	                          			</div>
	                          			<div class="content con-left">
	                            			<a href="viewPost?postId=${post.post.postId}&boardId=${post.post.boardId }"><span class="glyphicon glyphicon-comment"></span>${post.post.title}</a>
	                          			</div>
	                          			<div class="board-comment point-color">
	                            			<c:if test="${post.comments != null}">
												<c:choose>
													<c:when test="${post.comments > 999 }">
														<div>[999+]</div>
													</c:when>
													<c:otherwise>
														<div>[${post.comments }]</div>
													</c:otherwise>
												</c:choose>
											</c:if>
	
	                          			</div>
	                        		</div>
								</li>
                      	</c:forEach>
                      </ul>
                    </div>

                    <!-- 공지사항  -->
                    <div class="col-xs-6 notice notice-notice  border-padding">
                      <ul class="notice-border notice-border-notice border_size">
                        <c:forEach var="post" items="${postEventList }" begin="0" end="1" >
                      			<li>
	                        		<div>
	                          			<div class="board-name con-left">
	                            			<a>${post.boardCategory.categoryName }</a>
	                          			</div>
	                          			<div class="content con-left">
	                            			<a href="viewPost?postId=${post.post.postId}&boardId=${post.post.boardId }"><span class="glyphicon glyphicon-comment"></span>${post.post.title}</a>
	                          			</div>
	                          			<div class="board-comment point-color">
	                            			<c:if test="${post.comments != null}">
												<c:choose>
													<c:when test="${post.comments > 999 }">
														<div>[999+]</div>
													</c:when>
													<c:otherwise>
														<div>[${post.comments }]</div>
													</c:otherwise>
												</c:choose>
											</c:if>
							
	                          			</div>
	                        		</div>
								</li>
                      	</c:forEach>
                      </ul>


                    </div>

                </div>
              </div>

              <!-- 핫클립 -->
              <div class="row margin-container">
                <div class="col-xs-12 ">
                  <a href="#" class="not-working-a">
                    <p class="title-text-big display-in title-text">핫클립 </p>
                    <span class="glyphicon glyphicon-menu-right gly-size-middle display-in gly-color"></span>
                  </a>
                  <div class="hotclip">
                      <div class="chevron chevron-right" style="margin-left:8px;">
                        <a><span class="glyphicon glyphicon-chevron-left"></span></a>
                      </div>
                      <div>

                        <ul class="hotclip-border">
						<c:forEach var="clipDetail" items="${clipDetailList}" varStatus="status" begin="0" end="24">
                          <li>
                            <div class="hotclip-box ">
                              <a href="selectClip?clipId=${clipDetail.clip.clipId }">
                                <div class="">
                                  <img class="hotclip-border-video" src="${clipDetail.clip.thumbURL }"></img>
                                </div>
                                <div class="hotclip-title-size">
                                  <a class="hotclip-title">${clipDetail.clip.title }</a>
                                </div>
                              </a>
                            </div>
                          </li>
						</c:forEach>
                         
                        </ul>
                      </div>

                      <div class="chevron con-right chevron-left" style="margin-right:10px;">
                        <a><span class="glyphicon glyphicon-chevron-right"></span></a>
                      </div>


                  </div>
                </div>
              </div>


            </div>
          </div>
          <%@include file="../share-nav/nav-bottom.jsp"%>
        </div>
        
        <%@include file="../share-nav/controller.jsp"%>
  </body>
</html>

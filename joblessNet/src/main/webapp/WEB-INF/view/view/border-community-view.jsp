<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/transform-videoUri.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/borderJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/hangul.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/searchBroadcaster.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/userService.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/color-set.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/system.js"></script>
	
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/border.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/view.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/User_service.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">

	<!-- include summernote css/js -->
	<link href="${pageContext.request.contextPath}/summernote/summernote.css" rel="stylesheet">
	<script src="${pageContext.request.contextPath}/summernote/summernote.js"></script>
	<script src="${pageContext.request.contextPath}/summernote/lang/summernote-ko-KR.js"></script>
	
<meta charset="utf-8" />
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
  	
	<script type="text/javascript">
	if(${!empty errors.NotMoreLike}){
		var link = "viewPost?postId=";
			link += "${clip_or_postId}";
			link += "&boardId="
			link += "${boardId }"
		alert("추천은 한번만 가능합니다.");
		location.href=link	;
	}
  	</script>
<title>백수넷</title>
<%@include file="../share-nav/nav-header.jsp"%>
</head>
<body>

	<!-- 우측 메인 메뉴바 -->
	<div class="container margin-nav">
		<div class="row">
			<%@include file="../share-nav/nav-service.jsp"%>

			<!-- 게시판 메뉴 -->
			<div class="col-xs-10 setController">
				<div class="row margin-container ">
					<div class="border-comm-view-title">
						<a> ${boardCategory.categoryName } </a>
					</div>
					<div class="border-comm-view">
						<div class="border-comm-view-title-name">
							${postDetail.post.title }</div>
						<div>[${postDetail.user.nickName }]님</div>
						<div class=" border-comm-view-content">
							<div class="border-comm-view-body">
								<div>
									<span class="glyphicon glyphicon-time"></span>
									<c:set var="wdateStr" value="${postDetail.post.writeDate }"></c:set>
									<fmt:parseDate var="parseWdate" value="${wdateStr }"
										pattern="YYYY-MM-dd'T'HH:mm"></fmt:parseDate>
									<fmt:formatDate var="wdate" value="${parseWdate }"
										pattern="YYYY-MM-dd HH:mm"></fmt:formatDate>
									${wdate}
								</div>
								<div class="border-comm-view-info con-right">
									<div>
										<span class="glyphicon glyphicon-comment"></span>${count }
									</div>
									<div>
										<span class="glyphicon glyphicon-thumbs-up"></span>${postDetail.likes }
									</div>
									<div>
										<span class="glyphicon glyphicon-eye-open"></span>${postDetail.post.views }
									</div>
								</div>
							</div>

							<div class="border-comm-content">
								${postDetail.content.content }</div>
							<div class="border-comm-like">
								<form action="postLike" method="POST" name="border-comm-like">
									<input type="hidden" name="userId" value="${authUser.userId }">
									<input type="hidden" name="clip_or_postId" value="${postDetail.post.postId }">
									<input type="hidden" name="boardId" value="${postDetail.post.boardId }">
									<button type="submit"><span class="glyphicon glyphicon-thumbs-up"></span>추천</button>
								</form>
							</div>
							<div class="border-comm-service">
								<a href="viewPostList?boardId=${postDetail.post.boardId }">
									<span class="glyphicon glyphicon-list-alt"></span>목록
								</a>
								<c:if test="${authUser.userId ==  postDetail.post.writerId}">
									<a href="updatePost?postId=${postDetail.post.postId }&boardId=${postDetail.post.boardId }&contentId=${postDetail.content.contentId }">
										<span class="glyphicon glyphicon-list-alt"></span>수정
									</a>
									<a href="deletePost?postId=${postDetail.post.postId }&
														contentId=${postDetail.content.contentId }&
														writerId=${postDetail.post.writerId }&
														authUserUserId=${authUser.userId }&
														boardId=${postDetail.post.boardId }">
									<span class="glyphicon glyphicon-list-alt"></span>삭제</a>
								</c:if>
							</div>
						</div>
					</div>
					
					<c:if test="${boardCategory.categoryName ne '공지'}">
						<c:if test="${boardCategory.categoryName ne '이벤트'}">
							<c:if test="${!empty authUser.userId }">
								<div class="border-comm-comments">
									<div class="hotclip-comment-input border-comment-input">
			                      		<div class="clip-icon">
			                      			<img src="${pageContext.request.contextPath}${authUser.fileName}" alt="" class="icon-size">
			                      		</div>
			                      		<div class="">
			                        		<form method="post" action="insertPostComment" name="border-comm-content">
                          						<input type="hidden" name="clipId" value=0>
                          						<input type="hidden" name="categoryId" value="${postDetail.post.categoryId }">
                          						<input type="hidden" name="postId" value="${postDetail.post.postId }">
                          						<input type="hidden" name="userId" value="${authUser.userId }">
                          						<input type="hidden" name="boardId" value="${postDetail.post.boardId }">
                          						<input type="text" name="content" placeholder="댓글을 입력하세요..." id="hotclip-comment-input" class="clip-comment-box border-comment-box">
                          						<button type="submit" name="button" class="border-comment-submit"><span class="glyphicon glyphicon-pencil" class="clip-comment-submit"></span>작성</button>
                        					</form>
			                      		</div>
			                    	</div>
								</div>
							</c:if>
							<div class="border-comm-comment">
								<span class="glyphicon glyphicon-comment"></span> 댓글 ${count }개
							</div>
							<div class="border-comm-comments-div">
								<ul>
									<c:forEach var="comments" items="${comment}" varStatus="status">
										<li>
											<div class="border-comm-comments-info">
												<div class="border-comm-comments-icon">
													<img src="${pageContext.request.contextPath}${comments.fileName}" class="icon-size" />
												</div>
												<div class="border-comm-comments-writer">${comments.writerNickname }</div>
												<div class="con-right border-comm-comments-writer-service">
												<div>
													<form method="get" action="deleteCommentPost" name="border-comm-del">
                          								<input type="hidden" name="commentId" value=${comments.commentId }>
                          								<input type="hidden" name="categoryId" value="${postDetail.post.categoryId }">
                          								<input type="hidden" name="postId" value="${postDetail.post.postId }">
                          								<button type="submit" name="button">삭제</button>
                        							</form>
												</div>
												</div>
											</div>
											<div class="border-comm-comments-contents">${comments.content }</div>
										</li>
									</c:forEach>
								</ul>
							</div>
						</c:if>
					</c:if>

					<div class="row">
						<div class="col-xs-12">
							<div class="category ">
								<ul>
									<li class=""><a href="main"style="background-color: #414141;"><span class="glyphicon glyphicon-home"></span></a></li>
									<li><a href="viewPost?categoryId=1&postId=${postDetail.post.postId }&boardId=${postDetail.post.boardId }" style="background-color: #2e9895;"> 전체 </a></li>
									<c:forEach var="category" items="${boardCategoryList}" varStatus="status">
										<li><a href="viewPost?categoryId=${category.boardCategoryId }&postId=${postDetail.post.postId }&boardId=${postDetail.post.boardId }" class="border-color"style="background-color: #2e9895;"> ${category.categoryName } </a></li>
									</c:forEach>
								</ul>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-xs-12">
							<div class="border-table">
								<ul>
									<c:forEach var="post" items="${postList}" varStatus="status">
										<li>
													<!-- 추천수/공지/인기 -->
													<div class="border-comm-recomm ">
														<c:if test="${post.comments != null}">
															<c:choose>
																<c:when test="${post.comments > 999 }">
																	<div>999+</div>
																</c:when>
																<c:otherwise>
																	<div>${post.comments }</div>
																</c:otherwise>
															</c:choose>
														</c:if>
														<c:if test="${post.comments == null}">
															<div>0</div>
														</c:if>
													</div> 
													<!-- 현제 페이지가 전체 커뮤니티일때만 출력 -->
													<div class="border-comm-name ">
														<a>${post.boardCategory.categoryName }</a>
													</div> <!-- 제목 -->
													<div class="border-comm-title ">
														<a href="viewPost?postId=${post.post.postId}&boardId=${post.post.boardId }"><span class="glyphicon glyphicon-comment"></span>${post.post.title}</a>
													</div> <!-- 작성일 -->
													<div class="border-comm-day con-right">
														<fmt:parseDate var="parseWdate" value="${post.post.writeDate }" pattern="yyyy-MM-dd'T'HH:mm"></fmt:parseDate>
				 										<fmt:formatDate var="wdate" value="${parseWdate }" pattern="yyyy-MM-dd HH:mm"></fmt:formatDate>
				 										${wdate }
													</div> <!-- 작성자 -->
													<div class="border-comm-writer con-right">
														<div>
															<img src="" /><a>${post.user.nickName}</a>
														</div>
													</div>
												</li>
									</c:forEach>
								</ul>


							</div>
						</div>
					</div>



					<div class="row">
						<div class="col-xs-12">
							<div class="service display-in border-community-service">
								<div class="popularW con-left">
									<a><span class="glyphicon glyphicon-star-empty"></span>인기글</a>
								</div>

								<div class="comm-write con-right">
									<a href="insertPost?boardId=${postDetail.post.boardId }"><span
										class="glyphicon glyphicon-pencil"></span>글쓰기</a>
								</div>
							</div>
						</div>
					</div>

					<div class="border-hotclip-page-list">
								<ul class="pagination">
									<c:if test="${pageMaker.prev }">
										<li class="page-item"><a
											href="viewPost?sortby=${param.sortby }&term=${param.term}&search=${param.search}&id=${param.id}&page=${param.page-1}&boardId=${postDetail.post.boardId }&postId=${postDetail.post.postId }"><span
												class="glyphicon glyphicon-menu-left"></span></a></li>
									</c:if>
									<c:forEach begin="${pageMaker.startPage}"
										end="${pageMaker.endPage }" var="index">
										<li class="page-item"><a
											href="viewPost?sortby=${param.sortby }&term=${param.term}&search=${param.search}&id=${param.id}&page=${index}&boardId=${postDetail.post.boardId }&postId=${postDetail.post.postId }"
											class="page-link">${index }</a></li>
									</c:forEach>
							<c:if test="${pageMaker.next}">
								<li class="page-item"><a href="viewPost?sortby=${param.sortby }&term=${param.term}&search=${param.search}&id=${param.id}&page=${param.page+1}&boardId=${postDetail.post.boardId }&postId=${postDetail.post.postId }" class="page-link">
									<span class="glyphicon glyphicon-menu-right"></span></a>
								</li>
							</c:if>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	 <%@include file="../share-nav/controller.jsp"%>
</body>
</html>

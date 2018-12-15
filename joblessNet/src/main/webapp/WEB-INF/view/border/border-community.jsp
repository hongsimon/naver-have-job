<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/borderJs.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/border.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
<meta charset="utf-8" />
<script type="text/javascript">
	
</script>
<title>백수넷 - 커뮤니티</title>
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
						<div class="border-community">
							<div class="border-title-hr">커뮤니티</div>
							<div class="border-comm-favorites">
								<a><span class="glyphicon glyphicon-star-empty"></span>즐겨찾기</a>
							</div>
							<div class="row">
								<div class="col-xs-12">
									<div class="category ">
										<ul>
											<li class=""><a href=""
												style="background-color: #414141;"> <span
													class="glyphicon glyphicon-home"></span>
											</a></li>
											<li><a style="background-color: #2e9895;"> 전체 </a></li>
											<li><a style="background-color: #A6261D;"> 유튜브 </a></li>
											<li><a style="background-color: #472650;"> 트위치 </a></li>
											<li><a style="background-color: #275B78;"> 아프리카TV </a></li>
											<li><a style="background-color: #F2AA2E;"> 카카오팟 </a></li>
										</ul>
									</div>
								</div>
							</div>


							<div class="row">
								<div class="col-xs-12">
									<div class="border-table">
										<ul>
											<c:forEach var="post" items="${postDetail}" varStatus="status">
												<li>
													<!-- 추천수/공지/인기 -->
													<div class="border-comm-recomm ">
														<div>${post.post.postId }</div>
													</div> <!-- 현제 페이지가 전체 커뮤니티일때만 출력 -->
													<div class="border-comm-name ">
														<a>${post.boardCategory.categoryName }</a>
													</div> <!-- 제목 -->
													<div class="border-comm-title ">
														<a href="viewPost?postId=${post.post.postId}"><span class="glyphicon glyphicon-comment"></span>${post.post.title}</a>
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
											<a href="insertPost?boardId=1"><span class="glyphicon glyphicon-pencil"></span>글쓰기</a>
										</div>
									</div>
								</div>
							</div>

							<div class="border-hotclip-page-list">
								<ul class="pagination">
									<li class="page-item"><a href="#"><span
											class="glyphicon glyphicon-menu-left"></span></a></li>
									<li class="page-item"><a href="#" class="page-link">1</a>
									</li>
									<li class="page-item"><a href="#" class="page-link">2</a>
									</li>
									<li class="page-item"><a href="#" class="page-link">3</a>
									</li>
									<li class="page-item"><a href="#" class="page-link">4</a>
									</li>
									<li class="page-item"><a href="#" class="page-link">5</a>
									</li>
									<li class="page-item"><a href="#" class="page-link"><span
											class="glyphicon glyphicon-menu-right"></span></a></li>
								</ul>
							</div>

							<div class="search_box">
								<form>
									<select name="borderName" class="borderSelect">
										<option value="title">제목</option>
										<option value="title_contents">제목+내용</option>
										<option value="nickname">닉네임</option>
									</select> <input type="text" placeholder="검색어" />
									<button type="submit">
										<span class="glyphicon glyphicon-search"></span>
									</button>
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

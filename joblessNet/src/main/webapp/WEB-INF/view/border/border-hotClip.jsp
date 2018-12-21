<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<% String active = request.getParameter("active"); %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
  
  	<script type="text/javascript">
  		if(${!empty errors.notLogin}){
  			alert("로그인이 필요한 서비스입니다.")
  			location.href="http://localhost:8090/jobless-net/viewClip";
  		}
  	</script>
      <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/borderJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/hangul.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/transform-videoUri.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/userService.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/border.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/User_service.css">

    <meta charset="utf-8">
    <title>백수넷 - hotClip</title>
    
    <%@include file="../share-nav/nav-header.jsp"%>
  </head>
  <body>
    <div class="container margin-nav border-hotClip">
      <div class="row">
        <div class="col-xs-12 setController">
          <div class="border-hotclip-in">
              <div class="border-hotclip-service ">
              	<input type="hidden" value="<%=active %>">
                <ul>
                  <a href="main" class="hotclip-service-none">
                  <li>                  
                    <span class="glyphicon glyphicon-home"></span>
                  </li>
				  </a>
                  <a id="thumbs-up" class="" href="viewClip?sortby=likes&term=${param.term}&search=${param.search}&id=${param.id}&page=${param.page}&active=thumbs-up">
                  <li>
                    <span class="glyphicon glyphicon-thumbs-up"></span>추천수
                  </li>
                  </a>

                  <a id="plus" class="" href="viewClip?sortby=recent&term=${param.term}&search=${param.search}&id=${param.id}&active=plus"">
                  <li>
                    <span class="glyphicon glyphicon-plus"></span>새로운
                  </li>
                  </a>

                  <a id="heart" class="" href="viewClip?sortby=views&term=${param.term}&search=${param.search}&id=${param.id}&active=heart"">
                  <li>
                    <span class="glyphicon glyphicon-heart"></span>조회수
                  </li>
                  </a>
                </ul>
              </div>
              <!-- viewClip?sortby=${param.sortby }&term=${param.term}&search=${param.search}&id=${param.id} -->
              <div class="border-hotclip-nav">
                <div class="border-hotclip-service-day">
                  <ul>
                    <li class="border-hotclip-service-day-start">
                      <a href="viewClip?sortby=${param.sortby }&term=recent&search=${param.search}&id=${param.id}">6시간</a>
                    </li>
                    <li class="border-hotclip-service-day-middle">
                      <a href="viewClip?sortby=${param.sortby }&term=daily&search=${param.search}&id=${param.id}">오늘</a>
                    </li>
                    <li class="border-hotclip-service-day-middle">
                      <a href="viewClip?sortby=${param.sortby }&term=weekly&search=${param.search}&id=${param.id}">주</a>
                    </li>
                    <li class="border-hotclip-service-day-middle">
                      <a href="viewClip?sortby=${param.sortby }&term=monthly&search=${param.search}&id=${param.id}">월</a>
                    </li>
                    <li class="border-hotclip-service-day-end">
                      <a href="viewClip?sortby=${param.sortby }&term=yearly&search=${param.search}&id=${param.id}" class="test-border">년</a>
                    </li>
                  </ul>
                </div>
                <div class="border-hotclip-search">
                  <form>
                    <input type="text" name="search" placeholder="닉네임,태그,키워드..."/>
                    <button type="submit"><span class="glyphicon glyphicon-search"></span></button>
                  </form>
                </div>
                
                	<!-- 로그아웃 상태 -->
                	<c:if test="${empty authUser }">
	                <div class="border-hotclip-write">
	                  <a onclick="window.alert('로그인이 필요한 서비스입니다.')"><span class="glyphicon glyphicon-pencil"></span>클립 올리기</a>
	                </div>
	                </c:if>
                	
                	<!-- 로그인 상태 -->
                	<c:if test="${!empty authUser }">
	                <div class="border-hotclip-write">
	                  <a href="insertClip"><span class="glyphicon glyphicon-pencil"></span>클립 올리기</a>
	                </div>
	                </c:if>
              </div>
              <div class="border-hotclip-body">
                <ul>
                 <c:forEach var="clipDetail" items="${clipDetailList}" varStatus="status">
                 	<c:set var="wdateStr" value="${clipDetail.clip.writeDate }"></c:set>
				 	<fmt:parseDate var="parseWdate" value="${wdateStr }" pattern="yyyy-MM-dd'T'HH:mm"></fmt:parseDate>
				 	<fmt:formatDate var="wdate" value="${parseWdate }" pattern="yyyy-MM-dd HH:mm"></fmt:formatDate>
                  <li class="">
                      <div>
                          <div class="border-hotclip-body-img">
                            <a href="selectClip?clipId=${clipDetail.clip.clipId }">
                            <img src="${clipDetail.clip.thumbURL }"/>
                          </a>
                          </div>
                        <div class="border-hotclip-body-title ">
                          <p>
                            <a href="viewClip?id=${clipDetail.broadcaster.userId }">${clipDetail.broadcaster.nickName }</a>
                          </p>
                          <a href="selectClip?clipId=${clipDetail.clip.clipId }" id="clip-list-title">${clipDetail.clip.title }</a>
                        </div>
                        <div class="border-hotclip-body-writer">
                          <a>${clipDetail.writer.nickName }</a>
                        </div>
                        <div class="border-hotclip-body-info">
                          <div>
                            <span class="glyphicon glyphicon-thumbs-up"></span>
                            <div>
                              ${clipDetail.likes }
                            </div>
                          </div>
                          <div>
                            <span class="glyphicon glyphicon-comment"></span>
                            <div>
                              ${clipDetail.comments }
                            </div>
                          </div>
                          <div>
                            <span class="glyphicon glyphicon-time"></span>
                            <div>
                              ${wdate}
                            </div>
                          </div>
                        </div>
                      </div>
                      
                  </li>
			</c:forEach>	  
                </ul>
              </div>

              <div class="border-hotclip-page-list">
                <ul class="pagination">
                  <c:if test="${pageMaker.prev }">
	                  <li class="page-item">
	                    <a href="viewClip?sortby=${param.sortby }&term=${param.term}&search=${param.search}&id=${param.id}&page=${param.page-1}&active=<%=active %>"><span class="glyphicon glyphicon-menu-left"></span></a>
	                  </li>
                  </c:if> 
                  <c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage }" var="index">                 
                  <li class="page-item">
                    <a href="viewClip?sortby=${param.sortby }&term=${param.term}&search=${param.search}&id=${param.id}&page=${index}&active=<%=active %>" class="page-link">${index }</a>
                  </li>
                  </c:forEach>
                  <c:if test="${pageMaker.next}">                 
                  <li class="page-item">
                    <a href="viewClip?sortby=${param.sortby }&term=${param.term}&search=${param.search}&id=${param.id}&page=${param.page+1}&active=<%=active %>" class="page-link"><span class="glyphicon glyphicon-menu-right"></span></a>
                  </li>
                  </c:if>
                </ul>
              </div>
          </div>

        </div>
      </div>
      <%@include file="../share-nav/nav-bottom.jsp"%>
    </div>
    <%@include file="../share-nav/controller.jsp"%>
  </body>
</html>
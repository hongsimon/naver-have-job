<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <%@include file="../header_Service/pageContextService.jsp"%>

    <meta charset="utf-8">
    <title>백수넷 - hotClip</title>
    
    <%@include file="../share-nav/nav-header.jsp"%>
  </head>
  <body>
    <div class="container margin-nav border-hotClip">
      <div class="row">
        <div class="col-xs-12">
          <div class="border-hotclip-in">
              <div class="border-hotclip-service ">
                <ul>
                  <li>
                  <a href="" class="hotclip-service-none">
                    <span class="glyphicon glyphicon-home"></span>
                  </a>
                  </li>

                  <a class="hotclip-service-active">
                  <li>
                    <span class="glyphicon glyphicon-thumbs-up"></span>요즘 뜨는
                  </li>
                  </a>

                  <a class="hotclip-service-none">
                  <li>
                    <span class="glyphicon glyphicon-plus"></span>새로운
                  </li>
                  </a>

                  <a class="hotclip-service-none">
                  <li>
                    <span class="glyphicon glyphicon-heart"></span>추천
                  </li>
                  </a>
                </ul>
              </div>
              <div class="border-hotclip-nav">
                <div class="border-hotclip-service-day">
                  <ul>
                    <li class="border-hotclip-service-day-start">
                      <a>6시간</a>
                    </li>
                    <li class="border-hotclip-service-day-middle">
                      <a>오늘</a>
                    </li>
                    <li class="border-hotclip-service-day-middle">
                      <a>주</a>
                    </li>
                    <li class="border-hotclip-service-day-middle">
                      <a>월</a>
                    </li>
                    <li class="border-hotclip-service-day-end">
                      <a class="test-border">년</a>
                    </li>
                  </ul>
                </div>
                <div class="border-hotclip-search">
                  <form>
                    <input type="text" placeholder="닉네임,태그,키워드..."/>
                    <button type="submit"><span class="glyphicon glyphicon-search"></span></button>
                  </form>
                </div>
	                <div class="border-hotclip-write">
	                  <a href="insertClip"><span class="glyphicon glyphicon-pencil"></span>클립 올리기</a>
	                </div>
              </div>
              <div class="border-hotclip-body">
                <ul>
                 <c:forEach var="clipDetail" items="${clipDetailList}" varStatus="status">
                 	<c:set var="wdateStr" value="${clipDetail.clip.writeDate }"></c:set>									
				 	<fmt:parseDate var="parseWdate" value="${wdateStr }" pattern="YYYY-MM-dd'T'HH:mm"></fmt:parseDate>
				 	<fmt:formatDate var="wdate" value="${parseWdate }" pattern="YYYY-MM-dd HH:mm"></fmt:formatDate>
                  <li class="">
                      <div>
                          <div class="border-hotclip-body-img">
                            <a href="selectClip?clipId=${clipDetail.clip.clipId }">
                            <img src="${clipDetail.clip.thumbURL }"/>
                          </a>
                          </div>
                        <div class="border-hotclip-body-title ">
                          <p>
                            <a>${clipDetail.broadcaster.nickName }</a>
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
                              0
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
                  <li class="page-item">
                    <a href="#"><span class="glyphicon glyphicon-menu-left"></span></a>
                  </li>
                  <li class="page-item">
                    <a href="#" class="page-link">1</a>
                  </li v>
                  <li class="page-item">
                    <a href="#" class="page-link">2</a>
                  </li>
                  <li class="page-item">
                    <a href="#" class="page-link">3</a>
                  </li>
                  <li class="page-item">
                    <a href="#" class="page-link">4</a>
                  </li>
                  <li class="page-item">
                    <a href="#" class="page-link">5</a>
                  </li>
                  <li class="page-item">
                    <a href="#" class="page-link"><span class="glyphicon glyphicon-menu-right"></span></a>
                  </li>
                </ul>
              </div>
          </div>

        </div>
      </div>
    </div>
  </body>
</html>
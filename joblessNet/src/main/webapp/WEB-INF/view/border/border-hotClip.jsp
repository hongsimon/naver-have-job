<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                  <a href="" class="hotclip-service-none">
                  <li>
                    <span class="glyphicon glyphicon-home"></span>
                  </li>
                  </a>

                  <a class="hotclip-service-active test-berder">
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
                <c:if test="${authUser != null }">
	                <div class="border-hotclip-write">
	                  <a href="insertClip"><span class="glyphicon glyphicon-pencil"></span>클립 올리기</a>
	                </div>
                </c:if>
              </div>
              <div class="border-hotclip-body">
                <ul>
                  <li class="">
                  <c:forEach var="clip" items="${clipList}" varStatus="status">
                      <div>
                          <div class="border-hotclip-body-img">
                            <a href="selectClip?clipId=${clip.clipId }">
                            <img src="${clip.thumbURL }"/>
                          </a>
                          </div>
                        <div class="border-hotclip-body-title ">
                          <p>
                            <a>${clip.broadcasterId }</a>
                          </p>
                          <a href="selectClip?clipId=${clip.clipId }" id="clip-list-title">${clip.title }</a>
                        </div>
                        <div class="border-hotclip-body-writer">
                          <a>${clip.writerId }</a>
                        </div>
                        <div class="border-hotclip-body-info">
                          <div>
                            <span class="glyphicon glyphicon-thumbs-up"></span>
                            <div>
                              0
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
                              ${clip.wdate }
                            </div>
                          </div>
                        </div>
                      </div>
                      </c:forEach>
                  </li>
				  



                </ul>

                <!-- 4개씩 총 8개 (2줄) -->
                <hr />

                <ul>
                  <li class="">
                      <div>
                          <div class="border-hotclip-body-img">
                            <a>
                            <img src="https://img.youtube.com/vi/lV6bHRb52RQ/sddefault.jpg"/>
                          </a>
                          </div>
                        <div class="border-hotclip-body-title ">
                          <p>
                            <a>갱생레바</a>
                          </p>
                          <a id="clip-list-title">승권이 마약파티</a>
                        </div>
                        <div class="border-hotclip-body-writer">
                          <a>작성자</a>
                        </div>
                        <div class="border-hotclip-body-info">
                          <div>
                            <span class="glyphicon glyphicon-thumbs-up"></span>
                            <div>
                              0
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
                              2018-12-09 / 18:35
                            </div>
                          </div>
                        </div>
                      </div>
                  </li>




                </ul>

                <!-- 4개씩 총 12개 (3줄) -->
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
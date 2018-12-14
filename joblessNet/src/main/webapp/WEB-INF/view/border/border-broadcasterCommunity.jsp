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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/searchBroadcaster.js"></script>


    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/border.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">


    <meta charset="utf-8" />
    <script type="text/javascript">

    </script>
    <title>백수넷 - 방송인 게시판</title>
    
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
                <div class="col-xs-10">
                  <div class="broadcasterCommunity">
                    <div class="broadcasterList-t">
                     <!-- 닉네임, -->
                     <c:forEach var="streamer" items="${streamerList}" varStatus="status">
                     	${streamer.nickName},
                     </c:forEach>
                    </div>
                    <div class="broadcasterList_search">
                        <input type="text" placeholder="머독 또는 ㅁㄷ" id="searchBox"/>
                    </div>
                    <div class="container row broadcasterList_con" >
                      <div id="broadcasterList" class="broadcasterList_comm ">
                        <div class="broadcasterClass ">
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
                  </div>
                </div>
                <div class="col-xs-2">
                  <div class="title-text-big">
                    게시판 랭킹
                  </div>
                  <div class="broadcaster-list-box">
                    <ul id="broadcaster-lank">
                      <li>
                        <div style="background-color:#287A72">
                          1
                        </div>
                        <a href="#" id="broadcaster-lank-name">일이삼사오육칠팔구십</a>
                      </li>
                      <li>
                        <div style="background-color:rgba(40, 122, 114, 0.90)">
                          2
                        </div>
                        <a href="#" id="broadcaster-lank-name">@@@@@@@@</a>
                      </li>
                      <li>
                        <div style="background-color:rgba(40, 122, 114, 0.80)">
                          3
                        </div>
                        <a href="#"  id="broadcaster-lank-name">김도</a>
                      </li>
                      <li>
                        <div style="background-color:rgba(40, 122, 114, 0.70)">
                          4
                        </div>
                        <a href="#"  id="broadcaster-lank-name">김도</a>
                      </li>
                      <li>
                        <div style="background-color:rgba(63, 145, 137, 0.60)">
                          5
                        </div>
                        <a href="#"  id="broadcaster-lank-name">김도</a>
                      </li>
                      <li>
                        <div style="background-color:#6f6f6f">
                          6
                        </div>
                        <a href="#"  id="broadcaster-lank-name">김도</a>
                      </li>
                      <li>
                        <div style="background-color:#6f6f6f">
                          7
                        </div>
                        <a href="#"  id="broadcaster-lank-name">김도</a>
                      </li>
                      <li>
                        <div style="background-color:#6f6f6f">
                          8
                        </div>
                        <a href="#"  id="broadcaster-lank-name">김도</a>
                      </li>
                      <li>
                        <div style="background-color:#6f6f6f">
                          9
                        </div>
                        <a href="#"  id="broadcaster-lank-name">김도</a>
                      </li>
                      <li>
                        <div style="background-color:#6f6f6f">
                          10
                        </div>
                        <a href="#"  id="broadcaster-lank-name">김도</a>
                      </li>
                    </ul>
                  </div>
                  <div class="broadcaster-application-btn">
                    <a href="#">게시판 신청하기</a>
                  </div>
                </div>
            </div>
          </div>
        </div>
      </div>
  </body>
</html>
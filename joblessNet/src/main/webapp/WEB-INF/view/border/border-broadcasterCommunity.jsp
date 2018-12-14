<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
  
  	  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/borderJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/hangul.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/transform-videoUri.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/searchBroadcaster.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/broadcaster.js"></script>


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
                    <div class="broadcasterList">
                     <!-- 닉네임, -->
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
                  <div>
                    <ol>
                      <li>
                        <div>
                          1
                        </div>
                        <a href="#">김도</a>
                      </li>
                    </ol>
                  </div>
                  <div>
                    <a href="#">게시판 신청하기</a>
                  </div>
                </div>
            </div>
          </div>
        </div>
      </div>
  </body>
</html>
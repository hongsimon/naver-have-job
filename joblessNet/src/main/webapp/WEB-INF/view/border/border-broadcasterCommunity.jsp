<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <%@include file="../header_Service/pageContextService.jsp"%>
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
                    <div>
                      <input type="text" placeholder="머독 또는 ㅁㄷ" id="searchBox">
                    </div>
                    <div class="container row " >
                      <div id="broadcasterList">
                        <div class="broadcasterClass">
                            <div class="head-title">
                                A-Z
                            </div>
                              <div>
                                <a href="#">a</a>
                              </div>
                              <div>
                                <a href="#">ab</a>
                              </div>
                              <div>
                                <a href="#">abc</a>
                              </div>
                          </div>
                          <div class="broadcasterClass">
                              <div class="head-title">
                                  ㄱ
                              </div>
                                <div>
                                  <a href="#">가그</a>
                                </div>
                                <div>
                                  <a href="#">가이코</a>
                                </div>
                                <div>
                                  <a href="#">김재원</a>
                                </div>
                                <div>
                                  <a href="#">김도</a>
                                </div>
                            </div>
                            <div class="broadcasterClass">
                                <div class="head-title">
                                    ㄴ
                                  </div>
                                  <div>
                                    <a href="#">노돌리</a>
                                  </div>
                                  <div>
                                    <a href="#">녹두로</a>
                                  </div>
                                  <div>
                                    <a href="#">눈쟁이</a>
                                  </div>
                              </div>
                              <div class="broadcasterClass">
                                  <div class="head-title">
                                      ㄷ
                                  </div>
                                    <div>
                                      <a href="#">닥터준</a>
                                    </div>
                                    <div>
                                      <a href="#">듀라한</a>
                                    </div>
                              </div>
                              <div class="broadcasterClass">
                                  <div class="head-title">
                                      ㄹ
                                    </div>
                                    <div>
                                      <a href="#">로복</a>
                                    </div>
                                    <div>
                                      <a href="#">레바</a>
                                    </div>
                              </div>
                              <div class="broadcasterClass">
                                  <div class="head-title">
                                      ㅁ
                                    </div>
                                    <div>
                                      <a href="#">마루에몽</a>
                                    </div>
                                    <div>
                                      <a href="#">머독</a>
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

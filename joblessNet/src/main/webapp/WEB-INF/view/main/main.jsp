<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
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
            <div class="col-xs-10">

              <div class="row margin-container">
                <!-- 커뮤니티 인기글 -->
                <div class="col-xs-6 test-border">
                  <div class="margin-title">
                    <a href="#" class="not-working-a">
                      <p class="title-text-big display-in title-text">커뮤니티 인기글</p>
                      <span class="glyphicon glyphicon-menu-right gly-size-middle display-in gly-color"></span>
                    </a>
                  </div>
                  <!-- 내용 -->
                  <div class="best-content">
                    <!-- 이곳을 수정하세용 -->
                    <ul>
                      <li>
                        <div>
                          <div class="board-name con-left">
                            <a href="#" class="not-working-a point-color">게시판 이름 </a>
                          </div>
                          <div class="content con-left">
                            <a href="#">내용</a>
                          </div>
                          <div class="board-comment point-color">
                            [댓글수]
                          </div>
                        </div>
                      </li>

                    </ul>
                  </div>

                </div>

                <!-- Q&A -->
                <div class="col-xs-6 test-border">
                  <div class="margin-title">
                    <a href="#" class="not-working-a">
                      <p class="title-text-big display-in title-text">Q&A </p>
                      <span class="glyphicon glyphicon-menu-right gly-size-middle display-in gly-color"></span>
                    </a>
                  </div>
                  <div class="q-and-a">
                    <!-- 이곳을 수정하세용 -->
                    <ul>
                      <li>
                        <div>
                          <div class="board-name con-left">
                            <a href="#" class="not-working-a point-color">게시판 이름 </a>
                          </div>
                          <div class="content con-left">
                            <a href="#">내용</a>
                          </div>
                          <div class="board-comment point-color">
                            [댓글수]
                          </div>
                        </div>
                      </li>

                    </ul>
                  </div>
                </div>
              </div>

              <!-- 공지사항 -->
              <div class="row margin-container">
                <div class="col-xs-12 test-border ">

                    <!-- 이벤트 -->
                    <div class="col-xs-6 notice">
                      <div>
                        <div class="board-name con-left">
                          <a href="#" class="not-working-a point-color">이벤트 </a>
                        </div>
                        <a href="#">Test</a>
                      </div>

                      <div>
                        <a href="#">b</a>
                      </div>
                    </div>
                    <!-- 공지사항  -->
                    <div  class="col-xs-6 notice">
                      <div>
                        <div class="board-name con-left">
                          <a href="#" class="not-working-a point-color">공지사항 </a>
                        </div>
                        <a href="#">Test</a>
                      </div>
                      <div>
                        <a href="#">d</a>
                      </div>

                    </div>

                </div>
              </div>

              <!-- 놀러와요/함께 일해요-->
              <div class="row margin-container">
                <!-- 놀러와요 -->
                <div class="col-xs-6 test-border">
                  <div>
                    <a href="#" class="not-working-a">
                      <p class="title-text-big display-in title-text">놀러와요 </p>
                      <span class="glyphicon glyphicon-menu-right gly-size-middle display-in gly-color"></span>
                    </a>
                    <div class="play">
                      a
                    </div>
                  </div>
                </div>
                <!-- 함께 일해요 -->
                <div class="col-xs-6 test-border">
                  <div>
                    <a href="#" class="not-working-a">
                      <p class="title-text-big display-in title-text">함께일해요 </p>
                      <span class="glyphicon glyphicon-menu-right gly-size-middle display-in gly-color"></span>
                    </a>
                    <div class="working">
                      a
                    </div>
                  </div>
                </div>
              </div>

              <!-- 핫클립 -->
              <div class="row margin-container">
                <div class="col-xs-12 test-border">
                  <a href="#" class="not-working-a">
                    <p class="title-text-big display-in title-text">핫클립 </p>
                    <span class="glyphicon glyphicon-menu-right gly-size-middle display-in gly-color"></span>
                  </a>
                  <div class="hotclip">
                    a
                  </div>
                </div>
              </div>





            </div>
          </div>
        </div>
  </body>
</html>
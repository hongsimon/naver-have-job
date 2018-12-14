<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/banner.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/count_order.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/change_comm.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
    
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
                <div class="col-xs-6 ">
                  <div class="margin-title">
                    <a href="#" class="not-working-a">
                      <p class="title-text-big display-in title-text">커뮤니티 인기글</p>
                      <span class="glyphicon glyphicon-menu-right gly-size-middle display-in gly-color"></span>
                    </a>
                  </div>
                  <!-- 내용 -->
                  <div class="best-content border-padding">
                    <!-- 이곳을 수정하세용 -->
                    <ul class="best-content-border border_size">

                      <!-- 수정파트  -->
                      <li>
                        <div>
                          <div class="board-name con-left">
                            <a href="#" class="not-working-a point-color">애니메이션</a>
                          </div>
                          <div class="content con-left">
                            <a href="test" class="content-in">동해물과 백두산이 마르고 닳도록 하느님이 보우하사</a>
                          </div>
                          <div class="board-comment point-color">
                            [200]
                          </div>
                        </div>
                      </li>
                      <li>
                        <div>
                          <div class="board-name con-left">
                            <a href="#" class="not-working-a point-color">애니메이션</a>
                          </div>
                          <div class="content con-left">
                            <a href="test" class="content-in">동해물과 백두산이 마르고 닳도록 하느님이 보우하사</a>
                          </div>
                          <div class="board-comment point-color">
                            [200]
                          </div>
                        </div>
                      </li>
                      <li>
                        <div>
                          <div class="board-name con-left">
                            <a href="#" class="not-working-a point-color">애니메이션</a>
                          </div>
                          <div class="content con-left">
                            <a href="test" class="content-in">동해물과 백두산이 마르고 닳도록 하느님이 보우하사</a>
                          </div>
                          <div class="board-comment point-color">
                            [200]
                          </div>
                        </div>
                      </li>
                      <li>
                        <div>
                          <div class="board-name con-left">
                            <a href="#" class="not-working-a point-color">애니메이션</a>
                          </div>
                          <div class="content con-left">
                            <a href="test" class="content-in">동</a>
                          </div>
                          <div class="board-comment point-color">
                            [200]
                          </div>
                        </div>
                      </li>
                      <li>
                        <div>
                          <div class="board-name con-left">
                            <a href="#" class="not-working-a point-color">애니메이션</a>
                          </div>
                          <div class="content con-left">
                            <a href="test" class="content-in">동해물과 백두산</a>
                          </div>
                          <div class="board-comment point-color">
                            [200]
                          </div>
                        </div>
                      </li>
                      <li>
                        <div>
                          <div class="board-name con-left">
                            <a href="#" class="not-working-a point-color">애니메이션</a>
                          </div>
                          <div class="content con-left">
                            <a href="test" class="content-in">동해물과 백두산이 마르고 닳도록 하느님이 보우하사</a>
                          </div>
                          <div class="board-comment point-color">
                            [200]
                          </div>
                        </div>
                      </li>
                      


                      <!-- 쌤플 -->
                      <li>
                        <div>
                          <div class="board-name con-left">
                            <a href="#" class="not-working-a point-color">IT/컴퓨터</a>
                          </div>
                          <div class="content con-left">
                            <a href="test" class="content-in">123456789123456789123456789123456789123456789</a>
                          </div>
                          <div class="board-comment point-color">
                            [18]
                          </div>
                        </div>
                      </li>
                       <li>
                        <div>
                          <div class="board-name con-left">
                            <a href="#" class="not-working-a point-color">IT/컴퓨터</a>
                          </div>
                          <div class="content con-left">
                            <a href="test" class="content-in">123456789123</a>
                          </div>
                          <div class="board-comment point-color">
                            [18]
                          </div>
                        </div>
                      </li>
                       <li>
                        <div>
                          <div class="board-name con-left">
                            <a href="#" class="not-working-a point-color">IT/컴퓨터</a>
                          </div>
                          <div class="content con-left">
                            <a href="test" class="content-in">123456789123456789123456789123456789123456789</a>
                          </div>
                          <div class="board-comment point-color">
                            [18]
                          </div>
                        </div>
                      </li>



                    </ul>
                  </div>

                </div>

                <!-- Q&A -->
                <div class="col-xs-6 ">
                  <div class="margin-title">
                    <a href="#" class="not-working-a">
                      <p class="title-text-big display-in title-text">Q&A </p>
                      <span class="glyphicon glyphicon-menu-right gly-size-middle display-in gly-color"></span>
                    </a>
                  </div>
                  <div class="q-and-a border-padding">
                    <!-- 이곳을 수정하세용 -->
                    <ul class="q-and-a-border border_size">
                      <li>
                        <div>
                          <div class="content con-left">
                            <a href="#" class="content-in">0000000000/0000000000/0000000000/0000000000</a>
                          </div>
                          <div class="board-comment point-color">
                            [48]
                          </div>
                          <div class="writer">
                            <a class="writer-in">가나다라마바사아자</a>
                          </div>
                        </div>
                      </li>

                      <li>
                        <div>
                          <div class="content con-left">
                            <a href="#">앙</a>
                          </div>
                          <div class="board-comment point-color">
                            [48]
                          </div>
                          <div class="writer">
                            <a class="writer-in">8자까지 들어감</a>
                          </div>
                        </div>
                      </li>

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
                        <li>
                          <div >
                            <div class="board-name con-left">
                              <a href="#" class="not-working-a point-color">이벤트 </a>
                            </div>
                            <div class="content">
                              <a href="#" class="content-in">0000000000/0000000000/0000000000/0000000000/0000000000/0000000000/</a>
                            </div>
                            <div class="board-comment">
                              [00]
                            </div>
                          </div>
                        </li>

                        <li>
                          <div>
                            <div class="board-name con-left">
                              <a href="#" class="not-working-a point-color">이벤트 </a>
                            </div>
                            <div class="content">
                              <a href="#"  class="content-in">%#&*!%@^&*)$^!@#^@!(*$%!@^#*)@!&$(*@!^#@!*#%@!&$%!@#$&(@!)^#*(@!&%))</a>
                            </div>
                            <div class="board-comment">
                              [00]
                            </div>
                          </div>
                        </li>
                      </ul>


                    </div>

                    <!-- 공지사항  -->
                    <div class="col-xs-6 notice notice-notice  border-padding">
                      <ul class="notice-border notice-border-notice border_size">
                        <li>
                          <div >
                            <div class="board-name con-left">
                              <a href="#" class="not-working-a point-color">공지사항 </a>
                            </div>
                            <div class="content">
                              <a href="#" class="content-in">가가가가가가가가가가/가가가가가가가가가가/가가가가가가가가가가/가가가가가가가가가가/</a>
                            </div>
                            <div class="board-comment">
                              [00]
                            </div>
                          </div>
                        </li>

                        <li>
                          <div>
                            <div class="board-name con-left">
                              <a href="#" class="not-working-a point-color">공지사항 </a>
                            </div>
                            <div class="content">
                              <a href="#"  class="content-in">dfiodgh;sdfoiyhsoifyhsdpiwyi8ftgsdaifgsadkuyfgukawsg</a>
                            </div>
                            <div class="board-comment">
                              [00]
                            </div>
                          </div>
                        </li>
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

              <!-- 놀러와요/함께 일해요-->
              <div class="row margin-container">
                <!-- 놀러와요 -->
                <div class="col-xs-6 ">
                  <div>
                    <a href="#" class="not-working-a">
                      <p class="title-text-big display-in title-text">놀러와요 </p>
                      <span class="glyphicon glyphicon-menu-right gly-size-middle display-in gly-color"></span>
                    </a>
                    <div class="play border-padding">
                      <ul class="play-border border_size">
                        <li>
                          <div>
                            <div class="content con-left">
                              <a href="#" class="content-in">0000000000/0000000000/0000000000/0000000000</a>
                            </div>
                            <div class="board-comment point-color">
                              [48]
                            </div>
                            <div class="writer">
                              <a class="writer-in">가나다라마바사아자</a>
                            </div>
                          </div>
                        </li>

                        <li>
                          <div>
                            <div class="content con-left">
                              <a href="#">앙</a>
                            </div>
                            <div class="board-comment point-color">
                              [48]
                            </div>
                            <div class="writer">
                              <a class="writer-in">8자까지 들어감</a>
                            </div>
                          </div>
                        </li>

                      </ul>
                    </div>
                  </div>
                </div>
                <!-- 함께 일해요 -->
                <div class="col-xs-6 ">
                  <div>
                    <a href="#" class="not-working-a">
                      <p class="title-text-big display-in title-text">함께일해요 </p>
                      <span class="glyphicon glyphicon-menu-right gly-size-middle display-in gly-color"></span>
                    </a>
                    <div class="working border-padding">
                      <ul class="working-border border_size">
                        <li>
                          <div>
                            <div class="content con-left">
                              <a href="#" class="content-in">0000000000/0000000000/0000000000/0000000000</a>
                            </div>
                            <div class="board-comment point-color">
                              [48]
                            </div>
                            <div class="writer">
                              <a class="writer-in">가나다라마바사아자</a>
                            </div>
                          </div>
                        </li>

                      </ul>
                    </div>
                  </div>
                </div>
              </div>






            </div>
          </div>
        </div>
  </body>
</html>

<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/changeProfile.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/userService.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/hangul.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/searchBroadcaster.js"></script>

  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/shareCss.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/customC.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/service.css">
  <meta charset="utf-8" />
  <title>백수넷</title>

</head>

<body>

  <!-- 우측 메인 메뉴바 -->
  <div class="container margin-nav">
    <div class="row right-nav-bar">

      <!-- 게시판 메뉴 -->
      <div class="col-xs-10">
        <div class="service-user">
          <div class="service-inner">
            <div>
                <div>
                  <h2>아이콘샵</h2>
                  <div class="service-delNotice">
                    <div class="service-iconShop-search">
                      <input type="text" placeholder="검색어 입력" id="icon-search"/>
                    </div>
                    <div class="icon_list">
                      <a href="#">
                      <div class="icon-list-box ">
                        <images src="${pageContext.request.contextPath}/images/icon/icon1.png" alt="">
                        <div>
                          <div class="icon-name">
                            블러드 트레일
                          </div>
                          <div class="icon-point">
                            500포인트
                          </div>
                        </div>
                      </div>
                    </a>

                    <a href="#">
                      <div class="icon-list-box ">
                      <images src="${pageContext.request.contextPath}/images/icon/icon-A.png" alt="">
                      <div>
                        <div class="icon-name">
                          아프리카TV 기본
                        </div>
                        <div class="icon-point">
                          500포인트
                        </div>
                      </div>
                    </div>
                  </a>

                  <a href="#">
                    <div class="icon-list-box ">
                    <images src="${pageContext.request.contextPath}/images/icon/icon-K.png" alt="">
                    <div>
                      <div class="icon-name">
                        카카오팟 기본
                      </div>
                      <div class="icon-point">
                        500포인트
                      </div>
                    </div>
                  </div>
                </a>

                <a href="#">
                  <div class="icon-list-box ">
                  <images src="${pageContext.request.contextPath}/images/icon/icon-T.png" alt="">
                  <div>
                    <div class="icon-name">
                      트위치 기본
                    </div>
                    <div class="icon-point">
                      500포인트
                    </div>
                  </div>
                </div>
              </a>

              <a href="#">
                <div class="icon-list-box ">
                <images src="${pageContext.request.contextPath}/images/icon/icon-Y.png" alt="">
                <div>
                  <div class="icon-name">
                    유튜브 기본
                  </div>
                  <div class="icon-point">
                    500포인트
                  </div>
                </div>
              </div>
            </a>






                    </div>

                  </div>
                </div>
                </div>
              </div>
            </div>

          </div>

        </div>
      </div>
</body>

</html>

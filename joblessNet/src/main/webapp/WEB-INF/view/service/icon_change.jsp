<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/changeProfile.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/userService.js"></script>

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
              <form>
                <div>
                  <h2>아이콘 보관함</h2>
                  아이콘은 <a href="#">아이콘 샵</a>에서 구매할 수 있어요. 적용할 아이콘을 클릭하세요.
                </div>
                  <div class="service-delNotice">
                    <div class="service-icon-radio">
                    <!-- id=아이콘 이름, value=아이콘 번호, for=아이콘 이름 -->
                      <input type="radio" name="icon" id="icon1"  value="1" ><label for="icon1">
                        <img src="${pageContext.request.contextPath}/images/icon/icon1.png"/>
                      </label>
                      <input type="radio" name="icon" id="icon-A"  value="2" ><label for="icon-A">
                        <img src="${pageContext.request.contextPath}/images/icon/icon-A.png"/>
                      </label>
                      <input type="radio" name="icon" id="icon-K"  value="3" ><label for="icon-K">
                        <img src="${pageContext.request.contextPath}/images/icon/icon-K.png"/>
                      </label>
                      <input type="radio" name="icon" id="icon-T"  value="4" ><label for="icon-T">
                        <img src="${pageContext.request.contextPath}/images/icon/icon-T.png"/>
                      </label>
                      <input type="radio" name="icon" id="icon-Y"  value="5" ><label for="icon-Y">
                        <img src="${pageContext.request.contextPath}/images/icon/icon-Y.png"/>
                      </label>

                    </div>

                  </div>
                </div>
                  <div class="service-submit-btn">
                    <button type="submit" id="service-icon-none" disabled="true">적용하기</button>
                  </div>
                  </form>
                </div>
              </div>
            </div>

          </div>

        </div>
      </div>
         <%@include file="../share-nav/controller.jsp"%>
</body>

</html>

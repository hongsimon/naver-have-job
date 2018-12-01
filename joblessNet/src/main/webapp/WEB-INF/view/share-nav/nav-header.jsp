<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <!-- 로고 메뉴바 -->
    <div class="container margin-nav">
      <div class="row">

        <!-- 로고 -->
        <div class="col-xs-9 logo">
          <a><img src="${pageContext.request.contextPath}/images/logo/joblessLogo-2.png"/></a>
        </div>
        <!-- 검색창 -->
        <div class="col-xs-3 con-right">
          <form action="#" method="post">
            <input type="text" name="search" placeholder="search" class="searchBox">
            <button type="submit" name="button" class=" search-nav gly-color"><span class="glyphicon glyphicon-search"></span></button>
          </form>
        </div>

      </div>
    </div>

    <!-- 사용자 헤드 메뉴바  -->
    <div class="container head-nav-top-color">
      <div class="row  head-nav-top-size">
        <div class="col-xs-3">
          <div class="col-xs-4 padding-zero">
            <a class="dropdown-toggle head-nav-top-dropdown" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-hourglass"></span>
              최근
              <span class="glyphicon glyphicon-chevron-down gly-size-small"></span>
            </a>
            <ul class="dropdown-menu drop-menu-size-big lately" role="menu" aria-labelledby="dropdownMenu">
              <li>
                <a><div class="overflower" >@$asdasd&@!ㅁㄱ(#&@*)</div><button class="con-right del-btn"><span class="glyphicon glyphicon-remove"></span></button></a>
              </li>
              <li>
                <a><div class="overflower" >%7l잇!</div><button class="con-right del-btn"><span class="glyphicon glyphicon-remove"></span></button></a>
              </li>
            </ul>
          </div>
          <div class="col-xs-2 padding-zero">
            <a class="dropdown-toggle head-nav-top-dropdown" data-toggle="dropdown" href="#">
              <span class="glyphicon glyphicon-star"></span>
              <span class="glyphicon glyphicon-chevron-down gly-size-small"></span>
            </a>
            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu">
              <li>
                <a><div class="overflower" >TestPage1</div><button class="con-right del-btn"><span class="glyphicon glyphicon-remove"></span></button></a>
              </li>
            </ul>
          </div>
          <div class="col-xs-4 padding-zero">
            <a class="dropdown-toggle head-nav-top-dropdown" data-toggle="dropdown" href="#">
              <span class="glyphicon glyphicon-sunglasses"></span>
              아이콘
              <span class="glyphicon glyphicon-chevron-down gly-size-small"></span>
            </a>
            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu">
              <li>출석체크</li>
              <li>아이콘샵</li>
            </ul>
           </div>
        </div>
        <div class="col-xs-8">
          정해진게 없어요ㅛㅛㅛㅛㅛㅛㅛㅛㅛㅛㅛㅛㅛㅛ 광고있던곳
        </div>
        <div class="col-xs-1">
          로그인
        </div>
      </div>
    </div>




  </body>
</html>

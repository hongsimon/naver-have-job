<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
          <a href="${pageContext.request.contextPath}/main"><img src="${pageContext.request.contextPath}/images/logo/joblessLogo-2.png"/></a>
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
    <div class="container head-nav-top-color ">
      <div class="head-nav-top-size">
        <div class="col-xs-3 headber-size ">

          <div class="col-xs-4 padding-zero mouse_point headber">
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

          <div class="col-xs-2 padding-zero mouse_point">
            <a class="dropdown-toggle head-nav-top-dropdown" data-toggle="dropdown" href="#">
              <span class="glyphicon glyphicon-star"></span>
              <span class="glyphicon glyphicon-chevron-down gly-size-small"></span>
            </a>
            <ul class="dropdown-menu count-order drop-menu-size-middle favorites" role="menu" aria-labelledby="dropdownMenu">
              <li>
                <a><div class="order"></div><div class="overflower" >가나다라마바사아자차카</div><button class="con-right del-btn"><span class="glyphicon glyphicon-remove"></span></button></a>
              </li>
              <li>
                <a><div class="order"></div><div class="overflower" >ASasdjfiASDhsdv</div><button class="con-right del-btn"><span class="glyphicon glyphicon-remove"></span></button></a>
              </li>
              <li>
                <a><div class="order"></div><div class="overflower" >$#^(@&@!#@!)</div><button class="con-right del-btn"><span class="glyphicon glyphicon-remove"></span></button></a>
              </li>
              <li>
                <a><div class="order"></div><div class="overflower" >123456789101112</div><button class="con-right del-btn"><span class="glyphicon glyphicon-remove"></span></button></a>
              </li>
              <li>
                <a><div class="order"></div><div class="overflower" >aㅁ1!~_+++qewaa</div><button class="con-right del-btn"><span class="glyphicon glyphicon-remove"></span></button></a>
              </li>

            </ul>
          </div>

          <div class="col-xs-4 padding-zero mouse_point">
            <a class="dropdown-toggle head-nav-top-dropdown" data-toggle="dropdown" href="#">
              <span class="glyphicon glyphicon-sunglasses"></span>
              아이콘
              <span class="glyphicon glyphicon-chevron-down gly-size-small"></span>
            </a>
            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu">
              <li><a href="">출석체크</a></li>
              <li><a href="">아이콘 샵</a></li>
            </ul>
           </div>
        </div>

        <div class="col-xs-8  banner-border ">
          <div class="banner-size">
            <ul class="banner ">
              <li class="">
                <a href="http://www.jobkorea.co.kr/Recruit/GI_Read/26998617?Oem_Code=C1&PageGbn=ST"><div class="overflower" >1</div></a>
              </li>
              <li class="">
                <a href="http://www.jobkorea.co.kr/Recruit/GI_Read/26998617?Oem_Code=C1&PageGbn=ST"><div class="overflower" >2</div></a>
              </li>
              <li class="">
                <a href="http://www.jobkorea.co.kr/Recruit/GI_Read/26998617?Oem_Code=C1&PageGbn=ST"><div class="overflower" >3</div></a>
              </li>
              <li class="">
                <a href="http://www.jobkorea.co.kr/Recruit/GI_Read/26998617?Oem_Code=C1&PageGbn=ST"><div class="overflower" >4</div></a>
              </li>
              <li class="">
                <a href="http://www.jobkorea.co.kr/Recruit/GI_Read/26998617?Oem_Code=C1&PageGbn=ST"><div class="overflower" >5</div></a>
              </li>
              <li class="">
                <a href="http://www.jobkorea.co.kr/Recruit/GI_Read/26998617?Oem_Code=C1&PageGbn=ST"><div class="overflower" >6</div></a>
              </li>
            </ul>
          </div>
        </div>

        <div class="col-xs-1 login-size">

			<!-- 로그아웃상태 -->
            <div class="header-login">
            
            <c:if test="${empty authUser }">
              <a href="login" class="head-nav-top-dropdown"><span class="glyphicon glyphicon-user"></span>로그인</a>
            </c:if>
              
              <!-- 로그인상태 -->
              <c:if test="${!empty authUser }">
              
              <c:if test="${authUser.admin }">
              <div class="manager">
                <a class="dropdown-toggle head-nav-top-dropdown" data-toggle="dropdown" href="#">
                  <span class="glyphicon glyphicon-cog"></span>
                  <span class="glyphicon glyphicon-chevron-down gly-size-small"></span>
                </a>
                <ul class="dropdown-menu col-xs-12" role="menu" aria-labelledby="dropdownMenu">
                  <li><a href="">전광판 관리</a></li>
                  <li><a href="">요청 관리</a></li>
                  <li><a href="">신고 관리</a></li>
                  <li class="divider"></li>
                  <li><a href="">공지사항</a></li>
                  <li><a href="">이벤트</a></li>
                </ul>
              </div>
              </c:if>
              
              <div class="login">
                <a class="dropdown-toggle head-nav-top-dropdown" data-toggle="dropdown" href="#">
                  <div class="icon-size">
                    <img src="" alt="" class="icon-size">
                  </div>

                  <span class="glyphicon glyphicon-chevron-down gly-size-small"></span>
                </a>
                <ul class="dropdown-menu userProfile col-xs-12" role="menu" aria-labelledby="dropdownMenu">
                  
                  
					  <li><div class="emphasis overNick">${authUser.nickName }</div>(<div class="overflower">${authUser.loginId }</div>)</li>
	                  <li><div class="emphasis ">${authUser.point }</div>포인트</li>
	                  <li class="divider"></li>
	                  <li><a href="">설정</a></li>
	                  <li><a href="">아이콘 보관함</a></li>
	                  <li><a href="logout">로그아웃</a></li>
                </ul>
              </div>
	          </c:if>

          </div>
        </div>
      </div>
    </div>




  </body>
</html>


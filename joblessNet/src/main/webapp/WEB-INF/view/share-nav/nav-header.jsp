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
          <!-- <form action="#" method="post">
            <input type="text" name="search" placeholder="search" class="searchBox">
            <button type="submit" name="button" class=" search-nav gly-color"><span class="glyphicon glyphicon-search"></span></button>
          </form> -->
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
                <a href="http://www.jobkorea.co.kr/Recruit/GI_Read/27108558?Oem_Code=C1&PageGbn=ST"><div class="overflower" >[잡코리아] LS빌드윈㈜
2018년 각 부문별 신입 및 경력 정규직 채용</div></a>
              </li>
              <li class="">
                <a href="http://www.jobkorea.co.kr/Recruit/GI_Read/27068494?Oem_Code=C1&PageGbn=ST"><div class="overflower" >[잡코리아 ]㈜아이디스
2018년 하반기 신입 및 경력사원 모집</div></a>
              </li>
              <li class="">
                <a href="http://www.jobkorea.co.kr/Recruit/GI_Read/27117535?Oem_Code=C1&PageGbn=ST"><div class="overflower" >[잡코리아] 이스타항공㈜
2019년 상반기 객실인턴승무원 채용</div></a>
              </li>
              <li class="">
                <a href="http://www.jobkorea.co.kr/Recruit/GI_Read/27060428?rPageCode=SL"><div class="overflower" >[잡코리아] ㈜아이비케이시스템
2019년 신입직원 모집</div></a>
              </li>
              <li class="">
                <a href="http://www.saramin.co.kr/zf_user/jobs/relay/view?view_type=etc&rec_idx=35188783&isMypage=no&gz=1&recommend_ids=eJxVj7sRxFAIA6u5HIl%2F7ELcfxf3Ao%2FB4c6CEOq0ROH2rl9e6pRW6KAJuax2w16EKZhjU0viDuKx7jpRqKicYTQruJLZ1gutLQZJxapxLq2ogy7LhlTWoAPdn1361KAEfL1fJu%2BwdUbVqRH4A4UCQJ4%3D&t_ref=recruit&t_ref_content=recruit_bbs"><div class="overflower" >[사람인] 에스케이매직(주)
SK매직 2019년 연구개발 및 생산관리부문 신입/경력 채용</div></a>
              </li>
              <li class="">
                <a href="http://www.saramin.co.kr/zf_user/jobs/relay/view?view_type=etc&rec_idx=35281326&isMypage=no&gz=1&recommend_ids=eJxNzsENwzAMQ9FpercsUaTOGST7b1GjDRAeHyh8O7F7Sbgx%2BvDKw1TyEH8yuPtGx7N2UXa85ARb85L71CyFLhgzoo0be172xMC5tIzkWBmqkq8YTxXkaxBejko7Pp%2F3h8Dhj1%2B5pkDn&t_ref=recruit&t_ref_content=insa"><div class="overflower" >[사람인] (주)한국금거래소쓰리엠
온라인몰/홈쇼핑 MD 및 마케팅 담당 (신입/경력2년내) 채용</div></a>
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
                  <li><a href="${pageContext.request.contextPath}/adminApplyPage">요청 관리</a></li>
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
	                  <li><a href="${pageContext.request.contextPath}/config/favoriteList">설정</a></li>
	                  <li><a href="">아이콘 보관함</a></li>
	                  <li><a href="${pageContext.request.contextPath}/logout">로그아웃</a></li>
                </ul>
              </div>
	          </c:if>

          </div>
        </div>
      </div>
    </div>




  </body>
</html>


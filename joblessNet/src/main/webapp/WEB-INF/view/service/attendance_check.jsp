<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/User_service.css">
  <meta charset="utf-8" />
  <title>백수넷</title>

</head>

<body>
	<%@include file="../share-nav/nav-header.jsp"%>

  <!-- 우측 메인 메뉴바 -->
  <div class="container margin-nav">
    <div class="row right-nav-bar">
    	<%@include file="../share-nav/nav-service.jsp"%>

      <!-- 게시판 메뉴 -->
      <div class="col-xs-10 setController">
        <div class="service-user">
          <div class="service-inner">
            <div>
            
            <c:if test="${errors.same }">
            	<div>출석체크는 하루에 한번만 가능합니다.</div>
            </c:if>
            
            <c:if test="${errors.userId }">
            	<div>찾을수 없는 회원입니다.</div>
            </c:if>
            
              <form action="attendanceCheck" method="POST" class="service-attendance-check">
                <div>
                  <h2>출석체크</h2>
                  매일 출석체크를 하시면 50포인트씩 드립니다.
                </div>
                <div class="service-delNotice check_system">
                  <div id="check_text_box">
                    <div id="check_text_font">
                      출석체크 한마디
                    </div>
                    <div>
                      <input type="hidden" name="userId" value="${authUser.userId }">
                      <input type="hidden" name="nickName" value="${authUser.nickName }">
                      <input type="text" name="comment" id="check_text"/>
                    </div>
                  </div>
                  <div id="check_img">
                    <img src="${pageContext.request.contextPath}/images/bot/alpago_1.png" alt="">
                  </div>
                    <div id="check_number_1">

                    </div>
                      +
                    <div id="check_number_2">

                    </div>
                     = <div id="check_2">
                         ?
                       </div>
                     <div>
                       <input type="text" id="check_number"/>

                       </div>
                       <div>
                         <input type="submit" name="" value="출석체크 하기" id="check_submit">
                         </div>
                  </div>
                  </form>
                  <div class="check_table">
                    <table>
                      <thead>
                        <th class="check_status">
                          #
                        </th>
                        <th id="check_nick">
                          닉네임
                        </th>
                        <th id="check_talk">
                          한마디
                        </th>
                      </thead>
                      <tbody>
                      <c:forEach var="CheckList" items="${attendanceCheck }" varStatus="ranking">
                      	<tr>
                          <td class="check_status">
                            ${ranking.count }등
                          </td>
                          <td>
                            ${CheckList.nickName }
                          </td>
                          <td>
                            ${CheckList.comment }
                          </td>
                        </tr>
                      </c:forEach>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>

          </div>
			 <%@include file="../share-nav/nav-bottom.jsp"%>
        </div>
        <%@include file="../share-nav/controller.jsp"%>
</body>

</html>
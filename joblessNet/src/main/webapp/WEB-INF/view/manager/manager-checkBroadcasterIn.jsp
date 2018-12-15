<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@
	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
 %>
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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/service.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/manager.css">
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
              <h2>방송인게시판 개설 승인</h2>
            </div>
            <div class="write-info-table">
                  <table>
                    <thead>
                      <th>
                        번호
                      </th>
                      <th class="maker-id">
                        신청자 아이디
                      </th>
                      <th class="why-makeing">
                        사유
                      </th>
                      <th>
                        승인여부
                      </th>
                    </thead>
                    <tbody>
                      <c:forEach var="boardApply" items="${boardApplyList }" varStatus="status">
                      <tr>
                        <td>
                          ${boardApply.applyId }
                        </td>
                        <td>
                          ${boardApply.ownerNickName}
                        </td>
                        <td>
                          ${boardApply.content}
                        </td>
                        <td>
                        <c:choose>
                          <c:when test="${boardApply.complete == false}">
                          	<a href="adminPermission?userId=${boardApply.ownerId}&applyId=${boardApply.applyId }" name="button" id="making-ok"><span class="glyphicon glyphicon-ok"></span></a>
                          	<a href="deleteAdminPermission?applyId=${boardApply.applyId }" name="button" id="making-none"><span class="glyphicon glyphicon-remove"></span></a>
                          	<!-- <button type="button" name="button" id="making-ok"><span class="glyphicon glyphicon-ok"></span></button>
                          	<button type="button" name="button" id="making-none"><span class="glyphicon glyphicon-remove"></span></button> -->
                          </c:when>
                          <c:when test="${boardApply.complete == true }">
                          	<span class="glyphicon glyphicon-ok"></span>
                          </c:when>
                        </c:choose>
                        </td>
                      </tr>
                      </c:forEach>
                    </tbody>
                    </table>
                </div>
              </div>
            </div>

          </div>
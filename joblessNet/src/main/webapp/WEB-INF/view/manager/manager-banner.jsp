<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en" dir="ltr">

<head>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/shareJs.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/sliceString.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/manager.js"></script>

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
<%@include file="../share-nav/nav-header.jsp"%>

  <!-- 우측 메인 메뉴바 -->
  <div class="container margin-nav">
    <div class="row right-nav-bar">
		<%@include file="../share-nav/nav-service.jsp"%>
      <!-- 게시판 메뉴 -->
      <div class="col-xs-10">
        <div class="service-user">
          <div class="service-inner">
            <div>
              <h2>광고 변경</h2>
            </div>
          <form action="addJobConfig" method="POST">
            <div class="write-info-table">
                  <table>
                    <thead>
                      <th>
                        번호
                      </th>
                      <th id="url">
                        URL
                      </th>
                      <th id="text">
                        내용
                      </th>
                      <th class="changer">
                        수정여부
                      </th>
                    </thead>
                    <tbody>
                    	
                    	<c:forEach var="job_add" items="${add }">
	                       <tr>
	                        <td>
	                          ${job_add.addId }
	                        </td>
	                        <td >
	                            ${job_add.addLink }
	                        </td>
	                        <td >
	                          ${job_add.addTitle }
	                        </td>
	                        <td>
	                          <button type="button" name="button" id="change_true" class="change_true"><span class="glyphicon glyphicon-repeat"></span></button>
	                        </td>
	                      </tr>
                    	</c:forEach>
                    </tbody>
                    </table>
                </div>
              </form>
              </div>
            </div>

          </div>

        </div>
      </div>
</body>

</html>
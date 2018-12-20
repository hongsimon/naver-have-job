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
              <form action="#" class="service-attendance-check">
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
                      <input type="text" value="백수 하이" id="check_text"/>
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
                        <tr>
                          <td class="check_status">
                            1등
                          </td>
                          <td>
                            나는_강하다
                          </td>
                          <td>
                            삭제해라 애송이
                          </td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>

          </div>

        </div>
</body>

</html>
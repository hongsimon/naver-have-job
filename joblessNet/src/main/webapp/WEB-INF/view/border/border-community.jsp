<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <%@include file="../header_Service/pageContextService.jsp"%>
    <meta charset="utf-8" />
    <script type="text/javascript">

    </script>
    <title>백수넷 - 커뮤니티</title>
    <%@include file="../share-nav/nav-header.jsp"%>

  </head>
  <body>

        <!-- 우측 메인 메뉴바 -->
        <div class="container margin-nav">
          <div class="row">
          <%@include file="../share-nav/nav-service.jsp"%>

            <!-- 게시판 메뉴 -->
            <div class="col-xs-10">

              <div class="row margin-container">
                <div class="col-xs-12">
                  <div class="border-community">
                    <div class="title-text-more-big border-title-hr">
                      커뮤니티
                    </div>
                    <div class="favorites">
                      <button type="button">즐겨찾기</button>
                    </div>
                    <div class="row">
                      <div class="col-xs-12">
                        <div class="category">
                          <ul>
                            <li>
                              <div>
                                <button type="button" name="button">전체</button>
                              </div>
                            </li>
                            <li>
                              <div>
                                <button type="button" name="button">유머</button>
                              </div>
                            </li>
                            <li>
                              <div>
                                <button type="button" name="button">게임</button>
                              </div>
                            </li>
                          </ul>
                        </div>
                      </div>
                    </div>


                    <div class="row">
                      <div class="col-xs-12">
                        <div class="border-table">
                          <table border="1">
                            <tr>
                              <!-- 추천수/공지/인기 -->
                              <td>1</td>
                              <!-- 현제 페이지가 전체 커뮤니티일때만 출력 -->
                              <td>유머</td>
                              <!-- 제목 -->
                              <td>아이콘/<img src="" class="icon"/>제목</td>
                              <!-- 작성자 -->
                              <td>작성자</td>
                              <!-- 작성일 -->
                              <td>작성일</td>
                            </tr>
                          </table>
                        </div>
                      </div>
                    </div>

                    <div class="row">
                      <div class="col-xs-12">
                        <div class="service display-in test-border">
                          <div class="col-xs-2 popularW con-left test-border " >
                            <a >인기글</a>
                          </div>

                          <div class="col-xs-8 page-nav test-border ">
                            <ol>
                              <li>
                                <a><</a>
                              </li>
                              <li>
                                <a>1</a>
                              </li>
                              <li>
                                <a>2</a>
                              </li>
                              <li>
                                <a>3</a>
                              </li>
                              <li>
                                <a>4</a>
                              </li>
                              <li>
                                <a>5</a>
                              </li>
                              <li>
                                <a>></a>
                              </li>
                            </ol>
                          </div>

                          <div class="col-xs-2 write con-right test-border ">
                            <a>글쓰기</a>
                          </div>

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
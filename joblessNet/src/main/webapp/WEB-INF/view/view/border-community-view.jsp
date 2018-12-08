<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <%@include file="../header_Service/pageContextService.jsp"%>
    
    <meta charset="utf-8" />
    <script type="text/javascript">

    </script>
    <title>백수넷</title>

  </head>
  <body>

        <!-- 우측 메인 메뉴바 -->
        <div class="container margin-nav">
          <div class="row">

            <!-- 게시판 메뉴 -->
            <div class="col-xs-10">

              <div class="row margin-container">
                <div class="title-size-more-big">
                  [커뮤니티 제목]
                </div>
                <div>
                  <div>
                    [작성자]님
                  </div>

                  <div>
                    <div>
                      [시간]전
                    </div>
                    <div>
                      [댓글]0
                    </div>
                    <div>
                      [좋아요]0
                    </div>
                    <div>
                      [뷰]0
                    </div>
                  </div>

                  <div>
                    내용
                  </div>
                  <div>
                    <button type="button" name="button">추천</button>
                  </div>
                  <div>
                    <div>
                      목록
                    </div>

                  </div>
                </div>

                <div>
                  댓글 [댓글]0개
                </div>
                <div>
                  <div>
                    <div>
                      [아이콘]
                    </div>
                    <div>
                      [댓글 작성자]
                    </div>
                    <div>
                      <a href="">좋아요</a>
                    </div>
                    <div>
                      <a href="">대댓글</a>
                    </div>
                    <div>
                      [시간]전
                    </div>
                  </div>

                  <div>
                    [내용]
                  </div>
                </div>


                <div>
                  댓글작성란
                </div>


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
  </body>
</html>

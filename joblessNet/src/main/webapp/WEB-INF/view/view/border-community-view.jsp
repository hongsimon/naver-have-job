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
                <div class="border-comm-view-title">
                  <a>
					${postReq.categoryId }                  	
                  </a>
                </div>
                <div class="border-comm-view">
                  <div class="border-comm-view-title-name">
                  	${postReq.title }
                  </div>
                  <div>
                    [${postReq.writerId }]님
                  </div>
                <div class=" border-comm-view-content">
                  <div class="border-comm-view-body">
                    <div>
                      <span class="glyphicon glyphicon-time"></span>
                      <c:set var="wdateStr" value="${postReq.writeDate }"></c:set>									
				 		<fmt:parseDate var="parseWdate" value="${wdateStr }" pattern="YYYY-MM-dd'T'HH:mm"></fmt:parseDate>
				 		<fmt:formatDate var="wdate" value="${parseWdate }" pattern="YYYY-MM-dd HH:mm"></fmt:formatDate>
                    	${wdate}
                    </div>
                    <div class="border-comm-view-info con-right">
                      <div>
                        <span class="glyphicon glyphicon-comment"></span>0
                      </div>
                      <div>
                        <span class="glyphicon glyphicon-thumbs-up"></span>0
                      </div>
                      <div>
                        <span class="glyphicon glyphicon-eye-open"></span>0
                      </div>
                    </div>
                  </div>

                  <div class="border-comm-content">
                  	${postReq.content }
                  </div>
                  <div class="border-comm-like">
                    <a><span class="glyphicon glyphicon-thumbs-up"></span>추천</a>
                  </div>
                  <div class="border-comm-service">
                    <a href="viewPostList?boardId=${postReq.boardId }"><span class="glyphicon glyphicon-list-alt"></span>목록</a>
                  </div>
                </div>
            </div>

              <div class="border-comm-comments">
                <div class="border-comm-comment">
                  <span class="glyphicon glyphicon-comment"></span> 댓글 0개
                </div>
                <div class="border-comm-comments-div">
                  <ul>
                    <li>
                      <div class="border-comm-comments-info">
                        <div class="border-comm-comments-icon">
                          <img />
                        </div>
                        <div class="border-comm-comments-writer">
                          머룽이다룽
                        </div>
                        <div class="con-right border-comm-comments-writer-service">
                          <div>
                            <a>수정</a>
                          </div>
                          <div>
                            <a>삭제</a>
                          </div>
                          <div>
                            <span class="glyphicon glyphicon-time"></span>1971.11.21 / 12:11
                          </div>

                        </div>
                      </div>
                      <div class="border-comm-comments-contents">
                        [내용]
                      </div>
                    </li>

                    <li>
                      <div class="border-comm-comments-info">
                        <div class="border-comm-comments-icon">
                          <img />
                        </div>
                        <div class="border-comm-comments-writer">
                          머룽이다룽
                        </div>
                        <div class="con-right border-comm-comments-writer-service">
                          <div>
                            <a>수정</a>
                          </div>
                          <div>
                            <a>삭제</a>
                          </div>
                          <div>
                            <span class="glyphicon glyphicon-time"></span>1971.11.21 / 12:11
                          </div>

                        </div>
                      </div>
                      <div class="border-comm-comments-contents">
                        [내용]
                      </div>
                    </li>

                    <li>
                      <div class="border-comm-comments-info">
                        <div class="border-comm-comments-icon">
                          <img />
                        </div>
                        <div class="border-comm-comments-writer">
                          머룽이다룽
                        </div>
                        <div class="con-right border-comm-comments-writer-service">
                          <div>
                            <a>수정</a>
                          </div>
                          <div>
                            <a>삭제</a>
                          </div>
                          <div>
                            <span class="glyphicon glyphicon-time"></span>1971.11.21 / 12:11
                          </div>

                        </div>
                      </div>
                      <div class="border-comm-comments-contents">
                        [내용]
                      </div>
                    </li>

                  </ul>

                </div>


                <div>
                  댓글작성란
                </div>
              </div>

              <div class="row">
                <div class="col-xs-12">
                  <div class="category ">
                    <ul>
                      <li class="">
                        <a href="" style="background-color:#414141;">
                            <span class="glyphicon glyphicon-home"></span>
                        </a>
                      </li>
                      <li>
                        <a style="background-color: #2e9895;">
                            전체
                        </a>
                      </li>
                      <li>
                        <a style="background-color: #A6261D;">
                            유튜브
                        </a>
                      </li>
                      <li>
                        <a style="background-color: #472650;">
                            트위치
                        </a>
                      </li>
                      <li>
                        <a style="background-color: #275B78;">
                            아프리카TV
                        </a>
                      </li>
                      <li>
                        <a style="background-color: #F2AA2E;">
                            카카오팟
                        </a>
                      </li>
                    </ul>
                  </div>
                </div>
              </div>

              <div class="row">
                <div class="col-xs-12">
                  <div class="border-table">
                    <ul>

                      <li>
                        <!-- 추천수/공지/인기 -->
                        <div class="border-comm-recomm "><div>1</div></div>
                        <!-- 현제 페이지가 전체 커뮤니티일때만 출력 -->
                        <div class="border-comm-name "><a>유튜브</a></div>
                        <!-- 제목 -->
                        <div class="border-comm-title "><span class="glyphicon glyphicon-picture"></span><a href="#" id="title" class="border-comm-title-url">제목a</a></div>
                        <!-- 작성일 -->
                        <div class="border-comm-day con-right">1971.11.21</div>
                        <!-- 작성자 -->
                        <div class="border-comm-writer con-right"><div><img src=""/><a>작성자</a></div></div>
                      </li>

                      <li>
                        <!-- 추천수/공지/인기 -->
                        <div class="border-comm-recomm "><div>1</div></div>
                        <!-- 현제 페이지가 전체 커뮤니티일때만 출력 -->
                        <div class="border-comm-name "><a>유튜브</a></div>
                        <!-- 제목 -->
                        <div class="border-comm-title "><span class="glyphicon glyphicon-picture"></span><a href="#" id="title" class="border-comm-title-url">제목a</a></div>
                        <!-- 작성일 -->
                        <div class="border-comm-day con-right">1971.11.21</div>
                        <!-- 작성자 -->
                        <div class="border-comm-writer con-right"><div><img src=""/><a>작성자</a></div></div>
                      </li>

                    </ul>


                  </div>
                </div>
              </div>



              <div class="row">
                <div class="col-xs-12">
                  <div class="service display-in border-community-service">
                    <div class="popularW con-left" >
                      <a ><span class="glyphicon glyphicon-star-empty"></span>인기글</a>
                    </div>

                    <div class="comm-write con-right">
                      <a><span class="glyphicon glyphicon-pencil"></span>글쓰기</a>
                    </div>
                  </div>
                </div>
              </div>

              <div class="border-hotclip-page-list">
                <ul class="pagination">
                  <li class="page-item">
                    <a href="#"><span class="glyphicon glyphicon-menu-left"></span></a>
                  </li>
                  <li class="page-item">
                    <a href="#" class="page-link">1</a>
                  </li v>
                  <li class="page-item">
                    <a href="#" class="page-link">2</a>
                  </li>
                  <li class="page-item">
                    <a href="#" class="page-link">3</a>
                  </li>
                  <li class="page-item">
                    <a href="#" class="page-link">4</a>
                  </li>
                  <li class="page-item">
                    <a href="#" class="page-link">5</a>
                  </li>
                  <li class="page-item">
                    <a href="#" class="page-link"><span class="glyphicon glyphicon-menu-right"></span></a>
                  </li>
                </ul>
              </div>

              <div class="search_box">
                <form>
                  <select name="borderName" class="borderSelect">
                    <option value="title">제목</option>
                    <option value="title_contents">제목+내용</option>
                    <option value="nickname">닉네임</option>
                  </select>
                  <input type="text" placeholder="검색어"/>
                  <button type="submit"><span class="glyphicon glyphicon-search"></span></button>
                </form>
              </div>


            </div>
          </div>
        </div>
      </div>
  </body>
</html>

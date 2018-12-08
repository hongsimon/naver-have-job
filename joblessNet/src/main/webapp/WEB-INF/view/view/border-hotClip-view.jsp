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
        <div class="container margin-nav">
          <div class="row">
              <div class="row margin-container hotclip">
                <div class="col-xs-8 test-border hotclip-view-box">
                  <div>
                    <div class="hotclip-view-frame">
                      <iframe src="https://clips.twitch.tv/embed?autoplay=false&clip=FlirtyCalmBatOneHand&tt_content=embed&tt_medium=clips_embed" frameborder="0" scrolling="no" allowfullscreen="true"></iframe>
                    </div>
                    <div class="hotclip-title ">
                      테스트 제목
                    </div>
                    <div class="hotclip-views">
                      <div>
                        조회수
                        <p>
                          0
                        </p>
                        회
                      </div>
                      <div class="con-right like-btn">
                        <button><span class="glyphicon glyphicon-thumbs-up"></span>0</button>
                      </div>
                    </div>
                  </div>

                  <!-- -댓글- -->
                  <hr />

                  <div>
                    <div>
                      댓글<p> 0 </p> 개
                    </div>
                    <div>
                      <div>
                        <img />
                      </div>
                      <div>
                        <form>
                          <input type="text" name="" value="">
                          <button type="submit" name="button" hidden></button>
                        </form>
                      </div>
                    </div>
                    <div>
                      <ul>
                        <li>
                          <div>
                            <div>
                              <img />
                            </div>
                            <div>
                              [닉네임]
                            </div>
                            <div>
                              내용
                            </div>
                          </div>
                        </li>
                      </ul>
                    </div>


                  </div>



                </div>
                <div class="col-xs-4 test-border">
                  <div>
                    <ul>
                      <li>
                        <a>
                          <div>
                            <img />
                          </div>
                          <div>
                            title
                          </div>
                          <div>
                            조회수<p>0</p>
                          </div>
                          <div>
                            <span class="glyphicon glyphicon-thumbs-up">0</span>
                          </div>
                        </a>
                      </li>
                    </ul>
                  </div>
                </div>



              </div>
            </div>
          </div>
  </body>
</html>
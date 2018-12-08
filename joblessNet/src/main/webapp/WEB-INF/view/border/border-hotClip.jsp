<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <%@include file="../header_Service/pageContextService.jsp"%>

    <meta charset="utf-8">
    <title>백수넷 - hotClip</title>
    
    <%@include file="../share-nav/nav-header.jsp"%>
  </head>
  <body>
    <div class="container margin-nav border-hotClip">
      <div class="row">
        <div class="col-xs-12">
          <div>
              <div>
                <ul>
                  <li>
                    home
                  </li>
                  <li>
                    요즘뜨는
                  </li>
                  <li>
                    새로운
                  </li>
                  <li>
                    추천
                  </li>
                </ul>
              </div>
              <div>
                <ul>
                  <li>
                    <a>6시간</a>
                    <a>오늘</a>
                  </li>
                </ul>
              </div>
              <div>
                <form>
                  <input type="text" placeholder="닉네임,태그,키워드..."/>
                  <button type="submit">S</button>
                </form>
              </div>
              <div>
                <a>클립올리기</a>
              </div>
              <div>
                <ul>
                  <li>
                    <iframe src="https://clips.twitch.tv/LazyRamshackleNikudonOSkomodo"></iframe>
                  </li>
                </ul>
              </div>

              <div>
                <ol>
                  <li>
                    <a href="#"><</a>
                  </li>
                  <li>
                    <a href="#">1</a>
                  </li>
                  <li>
                    <a href="#">2</a>
                  </li>
                  <li>
                    <a href="#">3</a>
                  </li>
                  <li>
                    <a href="#">4</a>
                  </li>
                  <li>
                    <a href="#">5</a>
                  </li>
                  <li>
                    <a href="#">></a>
                  </li>
                </ol>
              </div>
          </div>

        </div>
      </div>
    </div>
  </body>
</html>
$(function() {

        //메뉴바
        sliceString(".lately",".overflower",25,15);
        sliceString(".favorites",".overflower",24,12);
        sliceString(".banner",".overflower",145,90);
        sliceString(".userProfile",".overflower",10,8);
        sliceString(".userProfile",".overNick",20,10);
        sliceString(".userProfile",".overNick",20,10);

        //메인
        sliceString(".best-content-border",".content-in",60,35);
        sliceString(".q-and-a-border",".content-in",55,30);
        sliceString(".q-and-a-border",".writer-in",30,8);
        sliceString(".notice-border-event",".content-in",65,40);
        sliceString(".notice-border-notice",".content-in",65,40);
        sliceString(".hotclip-border",".hotclip-title",40,30);
        sliceString(".working-border",".content-in",55,30);
        sliceString(".working-border",".writer-in",30,8);
        sliceString(".play-border",".content-in",55,30);
        sliceString(".play-border",".writer-in",30,8);

        //view
        sliceString(".clip-list-view ul","#clip-list-title",90,30);

        //border
        sliceString(".border-hotclip-body ul:eq(0)","#clip-list-title",90,30);
        sliceString(".border-hotclip-body ul:eq(1)","#clip-list-title",90,30);



        function sliceString(ulClass,sideClass,maxByte,maxString){
          for (var i = 0; i < $(ulClass).children("li").length; i++) {

            var string = $(ulClass).find("li:eq(" + i + ") "+sideClass+"").text()
            var stringByteLength = 0;
            var change = false;

            stringByteLength = (function(s, b, i, c) {
              for (b = i = 0; c = s.charCodeAt(i++); b += c >> 11 ? 3 : c >> 7 ? 2 : 1);
              return b
            })(string);

              if (stringByteLength > maxByte) {
                for(var j=7; j<string.length; j++){
                  stringByteLength = reCheck(string,j);
                  if(stringByteLength >= maxByte){
                    string = string.slice(0,j-1);
                    change = true;
                    break;
                  }
                }
              }

            if(string.length > maxString ){
              string = string.slice(0,maxString);
              change = true;
            }

              $(ulClass).find("li:eq(" + i + ") "+sideClass+"").text(string);
              if(change == true){
                $(ulClass).find("li:eq(" + i + ") "+sideClass+"").append("...");
              }
            }
        }


















        function getByteLength(s, b, i, c) {
          for (b = i = 0; c = s.charCodeAt(i++); b += c >> 11 ? 3 : c >> 7 ? 2 : 1);
          return b;
        }

        function reCheck(s,last){
          var restring = s.slice(0,last);
          var restringByteLength = 0;

          restringByteLength = (function(s, b, i, c) {
            for (b = i = 0; c = s.charCodeAt(i++); b += c >> 11 ? 3 : c >> 7 ? 2 : 1);
            return b
          })(restring);
          return restringByteLength;
        }

        console.log("end")

      });

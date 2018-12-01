$(function() {

      $(".head-nav-top-dropdown").click(function() {
          for (var i = 0; i < $(".lately").children("li").length; i++) {

            var string = $(".lately").find("li:eq(" + i + ") .overflower").text()
            var stringByteLength = 0;
            var change = false;

            stringByteLength = (function(s, b, i, c) {
              for (b = i = 0; c = s.charCodeAt(i++); b += c >> 11 ? 3 : c >> 7 ? 2 : 1);
              return b
            })(string);

              if (stringByteLength > 25) {
                for(var j=7; j<string.length; j++){
                  stringByteLength = reCheck(string,j);
                  if(stringByteLength >= 25){
                    string = string.slice(0,j-1);
                    change = true;
                    break;
                  }
                }
              }

            if(string.length > 15 ){
              string = string.slice(0,15);
              change = true;
            }

              $(".lately").find("li:eq(" + i + ") .overflower").text(string);
              if(change == true){
                $(".lately").find("li:eq(" + i + ") .overflower").append("...");
              }
            }
          })

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



      });

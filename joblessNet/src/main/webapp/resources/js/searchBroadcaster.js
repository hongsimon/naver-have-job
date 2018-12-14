$(function() {

  //console.log($(".broadcasterList").text())
  var broadcasters = $(".broadcasterList-t").text();

  var broadcaster = broadcasters.split(",");

  var broadcast_List_join = [];
  var firstPont = [];

  for (var i = 0; i < broadcaster.length; i++) {
    broadcaster[i] = broadcaster[i].replace(/(\s*)/g, "")
    broadcast_List_join[i] = {
      "broadcaster": broadcaster[i]
    }
  }
  broadcast_List_join.forEach(function(item) {
    var dis = Hangul.disassemble(item.broadcaster, true);
    var cho = dis.reduce(function(prev, elem) {
      elem = elem[0] ? elem[0] : elem;
      return prev + elem;
    }, "");
    item.diassembled = cho;
  });



  broadcast_List_join.filter(function(item) {
      return item.diassembled || item.broadcaster
    })
    .forEach(function(item) {
      firstPont = item.diassembled.split("")
      switch (firstPont[0]) {
        case 'ㄱ': case'ㄲ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㄱ')").parent().append(str);
          break;
        case 'ㄴ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㄴ')").parent().append(str);
          break;
        case 'ㄷ': case 'ㄸ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㄷ')").parent().append(str);
          break;
        case 'ㄹ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㄹ')").parent().append(str);
          break;
        case 'ㅁ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㅁ')").parent().append(str);
          break;
        case 'ㅂ': case 'ㅃ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㅂ')").parent().append(str);
          break;
        case 'ㅅ': case 'ㅆ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㅅ')").parent().append(str);
          break;
        case 'ㅇ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㅇ')").parent().append(str);
          break;
        case 'ㅈ': case 'ㅉ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㅈ')").parent().append(str);
          break;
        case 'ㅊ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㅊ')").parent().append(str);
          break;
        case 'ㅋ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㅋ')").parent().append(str);
          break;
        case 'ㅌ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㅌ')").parent().append(str);
          break;
        case 'ㅍ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㅍ')").parent().append(str);
          break;
        case 'ㅎ':
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('ㅎ')").parent().append(str);
          break;
        default:
          var str = "<div><a href='#'>" + item.broadcaster + "</a></div>"
          $(".head-title:contains('A-Z')").parent().append(str);
          break;

      }
    })

//    $(".broadcasterList").text("");



  //----------------------------------------------------------------------

  var broadcastList = [];

  for (var i = 0; i < $("#broadcasterList a").length; i++) {
    broadcastList[i] = {
      "name": $("#broadcasterList a:eq('" + i + "')").html()
    }
  }

  broadcastList.forEach(function(item) {
    var dis = Hangul.disassemble(item.name, true);
    var cho = dis.reduce(function(prev, elem) {
      elem = elem[0] ? elem[0] : elem;
      return prev + elem;
    }, "");
    item.diassembled = cho;
  });


  $("#searchBox").keyup(function() {
    $(".broadcasterClass").hide();
    $("#broadcasterList").children().children().hide();

    var search = $(this).val();
    var search1 = Hangul.disassemble(search).join("");

    broadcastList.filter(function(item) {
        return item.name.includes(search) || item.diassembled.includes(search1);
      })
      .forEach(function(item) {

        $("#broadcasterList div>a:contains('" + item.name + "')").parent().show();
        $("#broadcasterList div>a:contains('" + item.name + "')").parent().parent().show();
        $("#broadcasterList div>a:contains('" + item.name + "')").parent().siblings("div:eq(0)").show();

      });

  });



});

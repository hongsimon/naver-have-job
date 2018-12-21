$(function() {

	  var broadcasters = $(".broadcasterList-t").text();

	  var broadcaster = broadcasters.split(",");

	  var broadcast_List_join = [];
	  var firstPont = [];
	  var broadcaster_href = [];

	  for (var i = 0; i < broadcaster.length; i++) {
	    broadcaster[i] = broadcaster[i].replace(/(\s*)/g, "")
	    broadcaster_href[i] = $(".broadcasterList-t>a:eq("+i+")").attr("href");

	    broadcast_List_join[i] = {
	      "broadcaster": broadcaster[i],
	      "href": broadcaster_href[i]
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
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㄱ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㄱ')").parent().append(str);
		        }
	          break;
	        case 'ㄴ':
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㄴ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㄴ')").parent().append(str);
		        }
	          break;
	        case 'ㄷ': case 'ㄸ':
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㄷ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㄷ')").parent().append(str);
		        }
	          break;
	        case 'ㄹ':
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㄹ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㄹ')").parent().append(str);
		        }
	          break;
	        case 'ㅁ':
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅁ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅁ')").parent().append(str);
		        }
	          break;
	        case 'ㅂ': case 'ㅃ':
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅂ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅂ')").parent().append(str);
		        }
	          break;
	        case 'ㅅ': case 'ㅆ':
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅅ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅅ')").parent().append(str);
		        }
	          break;
	        case 'ㅇ':
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅇ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅇ')").parent().append(str);
		        }
	          break;
	        case 'ㅈ': case 'ㅉ':
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅈ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅈ')").parent().append(str);
		        }
	          break;
	        case 'ㅊ':
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅊ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅊ')").parent().append(str);
		        }
	          break;
	        case 'ㅋ':
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅋ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅋ')").parent().append(str);
		        }
	          break;
	        case 'ㅌ':
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅌ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅌ')").parent().append(str);
		        }
	          break;
	        case 'ㅍ':
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅍ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅍ')").parent().append(str);
		        }
	          break;
	        case 'ㅎ':
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅎ')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('ㅎ')").parent().append(str);
		        }
	          break;
	        default:
	        	if(item.href!=undefined){
		        	var str = "<div><a href='"+item.href+"'>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('A-Z')").parent().append(str);
		        }else{
		        	var str = "<div><a>" + item.broadcaster + "</a></div>"
		        	$(".head-title:contains('A-Z')").parent().append(str);
		        }
	          break;

	      }
	    })



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
  

  //-------------------------------------------------------------------------------------------------

  var iconList = [];

  for (var i = 0; i < $(".icon-list-box").length; i++) {
    iconList[i] = {
      "icon_Name": $(".icon-name:eq("+i+")").text()
    }
  }

  iconList.forEach(function(item) {
    var dis = Hangul.disassemble(item.icon_Name, true);
    var cho = dis.reduce(function(prev, elem) {
      elem = elem[0] ? elem[0] : elem;
      return prev + elem;
    }, "");
    item.diassembled = cho;
  });


  $("#icon-search").keyup(function() {
    $(".icon-list-box").parent().hide();

    var search = $(this).val();
    var search1 = Hangul.disassemble(search).join("");

    iconList.filter(function(item) {
        return item.icon_Name.includes(search) || item.diassembled.includes(search1);
      })
      .forEach(function(item) {
        $(".icon-name:contains('" + item.icon_Name + "')").parent().parent().parent().show();
      });

  });



});

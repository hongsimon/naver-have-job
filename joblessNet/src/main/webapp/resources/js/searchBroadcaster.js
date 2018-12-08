$(function(){
      var key = $(this).val();
      var broadcastList =  [];

      for(var i=0; i<$("#broadcasterList a").length;i++){
        broadcastList[i] = {"name":$("#broadcasterList a:eq('"+i+"')").html()}
      }

      broadcastList.forEach(function (item) {
            var dis = Hangul.disassemble(item.name, true);
            var cho = dis.reduce(function (prev, elem) {
                elem = elem[0] ? elem[0] : elem;
                return prev + elem;
            }, "");
            item.diassembled = cho;
        });

      $("#searchBox").keyup(function(){
        $(".broadcasterClass").hide();
        $("#broadcasterList").children().children().hide();

          var search = $(this).val();
          var search1 = Hangul.disassemble(search).join("");

          broadcastList.filter(function(item){
            return item.name.includes(search) || item.diassembled.includes(search1);
          })
          .forEach(function(item){

            $("#broadcasterList div>a:contains('"+item.name+"')").parent().show();
            $("#broadcasterList div>a:contains('"+item.name+"')").parent().parent().show();
            $("#broadcasterList div>a:contains('"+item.name+"')").parent().siblings("div:eq(0)").show();

          });

        });



  });

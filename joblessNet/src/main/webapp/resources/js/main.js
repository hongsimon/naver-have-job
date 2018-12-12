$(function(){

  for(var i=0; i<$(".hotclip-border li").length;i++){
    var url = $(".hotclip-border li:eq('"+i+"')").find(".hotclip-border-video");
    var split = url.attr("src").split("/");
    var brand = split[2].split(".");

    switch (brand[1]) {
      case "youtube":
        $(url).css("border","5px solid #A6261D")
      break;
      case "twitch":
        $(url).css("border","5px solid #472650")
      break;
      case "afreecatv":
        $(url).css("border","5px solid #275B78")
      break;
      case "daumcdn":
        $(url).css("border","5px solid #F2AA2E")
      break;

      default :
        $(url).css("border","5px solid #287A72")
      break;
    }

  }

  $(".hotclip-border li:eq(5)").nextAll().hide();
  var startindex = 0;
  var lastindex = 6;
  var pagelength = 0;
  var index = 1;

  $(".chevron-right").click(function(){

          index++;
    $(".hotclip-border li").not($(".hotclip-border li[style='display: none;']")).hide();
      if(index==5){
        startindex = 0;
        lastindex = 6;
        pagelength = 0;
        index = 1;
        $(".hotclip-border li:eq(5)").nextAll().hide();
        $(".hotclip-border li:eq(0)").nextUntil($(".hotclip-border li:eq(6)")).show();
        $(".hotclip-border li:eq(0)").show();
      }else{
        startindex += 5+pagelength;
        lastindex += 6;
        if(pagelength==1){
        }else{
          pagelength++;
        }
        $(".hotclip-border li:eq('"+startindex+"')").nextUntil($(".hotclip-border li:eq('"+lastindex+"')")).show();
      }
      console.log(startindex)
      console.log(lastindex)
      console.log(pagelength)
  })

  $(".chevron-left").click(function(){

    $(".hotclip-border li").not($(".hotclip-border li[style='display: none;']")).hide();
      index--;

      if(index==1){
        startindex = 0;
        lastindex = 6;
        pagelength = 0;
        index = 1;
        $(".hotclip-border li:eq(5)").nextAll().hide();
        $(".hotclip-border li:eq(0)").nextUntil($(".hotclip-border li:eq(6)")).show();
        $(".hotclip-border li:eq(0)").show();
      }else if(index== 0){
      console.log("asd")
      startindex = 17;
      lastindex = 24;
      pagelength = 1;
      index = 4;
      $(".hotclip-border li:eq(17)").prevAll().hide();
      $(".hotclip-border li:eq(17)").nextUntil($(".hotclip-border li:eq(24)")).show();
    }else{
      startindex -= 5+pagelength;
      lastindex -= 6;

      if(index==1 || index==2 || index==3){
        pagelength=1;
      }else{
        pagelength--;
      }

      $(".hotclip-border li:eq('"+startindex+"')").nextUntil($(".hotclip-border li:eq('"+lastindex+"')")).show();

      console.log(startindex)
      console.log(lastindex)
      console.log(pagelength)
      console.log(index)
      console.log("----------")
    }
  })


});

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


});

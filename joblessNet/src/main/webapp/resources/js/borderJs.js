$(function(){

  for(var i=0; i<($(".best-content>.border_size li").length-1);i++){
    $(".best-content>.border_size li:eq("+i+")").css("border-bottom","1px solid #cccccc")
  }

  for(var i=0; i<($(".q-and-a>.border_size li").length-1);i++){
    $(".q-and-a>.border_size li:eq("+i+")").css("border-bottom","1px solid #cccccc")
  }

  for(var i=0; i<($(".notice-event>.border_size li").length-1);i++){
    $(".notice-event>.border_size li:eq("+i+")").css("border-bottom","1px solid #cccccc")
  }

  for(var i=0; i<($(".notice-notice>.border_size li").length-1);i++){
    $(".notice-notice>.border_size li:eq("+i+")").css("border-bottom","1px solid #cccccc")
  }

  $(".category").find("button").click(function(){
    $(".category").find("button").removeClass("focuse");
    $(this).addClass("focuse");
    console.log($(this).html())
  });

  for(var i=0; i<$(".border-table li").length;i++){
    var sling = $(".border-table li:eq("+i+")").find(".border-comm-recomm" ).text().split("");
    sling = sling.length;
    switch (sling) {
      case 1:
          $(".border-table li:eq("+i+")").find(".border-comm-recomm" ).css("padding","10px 16px");

        break;
      case 2:
          $(".border-table li:eq("+i+")").find(".border-comm-recomm" ).css("padding","10px 12px");

        break;
      default:
          $(".border-table li:eq("+i+")").find(".border-comm-recomm" ).css("padding","10px 8px");

    }
  }






});

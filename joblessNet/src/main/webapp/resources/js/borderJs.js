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


});

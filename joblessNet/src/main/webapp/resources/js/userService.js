$(function(){

  $(".controller-top").click(function(){
    $("html").animate({scrollTop: 0}, 400);
  });

  $(".controller-bottom").click(function(){
    var last = $(".setController").height();
    $("html").animate({scrollTop: last}, 400);
  });


})

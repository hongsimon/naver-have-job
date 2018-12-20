$(function(){
  var showAlert = playAlert = setInterval(function() {

    $(".banner").animate({"bottom":"+=20px"},1000,function(){

      $(".banner li:last").after($(".banner li:first"));
      $(".banner").css("bottom","-=20px");
      // $(".banner li").css("bottom","-=22px");

    });






  }, 3000);
});

$(function(){

  console.log($(".category").find("button").addClass("category-List"));


  $(".category").find("button").click(function(){
    $(".category").find("button").removeClass("focuse");
    $(this).addClass("focuse");
    console.log($(this).html())
  });


});

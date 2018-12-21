$(function(){

    var size = $(".border-color").length;

    var col=["#A6261D","#ff7f00","#472650","#275B78","#F2AA2E"];

    for(var i=0; i<size; i++){
      $(".border-color:eq("+i+")").attr("style","background-color:"+(col[i])+"");
    }

})

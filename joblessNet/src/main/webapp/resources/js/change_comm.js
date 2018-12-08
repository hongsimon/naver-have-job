$(function(){

  $(".borderSelect").change(function(){
    var text = $(".borderSelect option[value='"+$(".borderSelect").val()+"']").text();
    $(".border-title div").text(text)
  });

  $("form").submit(function(event){
    if($(".borderSelect").val()=="none"){
      alert("게시판을 선택해주십시오.");
      return false;
    }

  })

});

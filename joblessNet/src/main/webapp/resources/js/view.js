$(function(){

  $(".hotclip-comment-input button").attr("class","dis-none");

  $(".hotclip-comment-input input").keyup(function(){
    if($(".hotclip-comment-input input").val().trim()==""){
      $(".hotclip-comment-input button").attr("class","dis-none");
      $(".hotclip-comment-input input").attr("class","clip-comment-box");
    }else{
      $(".hotclip-comment-input button").attr("class","clip-comment-submit");
      $(".hotclip-comment-input input").attr("class","clip-comment-box-change");
    }
  })

})

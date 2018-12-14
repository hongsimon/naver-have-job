$(function(){

  $(".hotclip-comment-input button").attr("class","dis-none");

  $(".hotclip-comment-input input").keyup(function(){
    if($(".hotclip-comment-input input").val().trim()==""){
    	console.log("test")
      $(".hotclip-comment-input button").attr("class","dis-none");
      $("#clip-comment-inputBox").attr("class","clip-comment-box");
    }else{
    	console.log("end")
      $(".hotclip-comment-input button").attr("class","clip-comment-submit");
      $("#clip-comment-inputBox").attr("class","clip-comment-box-change");
    }
  })

})

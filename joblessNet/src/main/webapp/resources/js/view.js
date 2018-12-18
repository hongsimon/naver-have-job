$(function(){

  $(".hotclip-comment-input button").attr("class","dis-none");

  $("#hotclip-comment-input").keyup(function(){
	  console.log($("#hotclip-comment-input").val())
    if($("#hotclip-comment-input").val().trim()==""){
    	console.log("test")
      $(".hotclip-comment-input button").attr("class","dis-none");
      $("#hotclip-comment-input").attr("class","clip-comment-box");
    }else{
    	console.log("end")
      $(".hotclip-comment-input button").attr("class","clip-comment-submit");
      $("#hotclip-comment-input").attr("class","clip-comment-box-change");
    }
  })

})

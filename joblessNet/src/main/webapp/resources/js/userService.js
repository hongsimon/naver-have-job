$(function(){
	
	$(".controller").draggable();
	
  $(".controller-top").click(function(){
    $("html").animate({scrollTop: 0}, 400);
  });

  $(".controller-bottom").click(function(){
    var last = $(".setController").height();
    $("html").animate({scrollTop: last}, 400);
  });
  
  
  
  $(".service-icon-radio>input[name=iconId]").change(function(){
	    $(".service-submit-btn>button").attr("id","service-icon-active")
	      $(".service-submit-btn>button").removeAttr("disabled");
	    console.log("change1")
	  })




})

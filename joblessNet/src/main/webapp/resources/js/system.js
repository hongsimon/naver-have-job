$(function(){

  var doubleClick = false;
  console.log("js 적용확인")
  console.log("test66")
  var testi = 0;
 
  $(":submit").click(function(){
	  	testi++;
	  	if(doubleClick){
	  		return false;
	  	}else {
	  		doubleClick = true;
	  		$(this).parents($("form").attr("name")).submit();
	  	}
	  	
  })
   
})

$(function(){
	
  $("#search-eamil-toNext").attr("disabled",true);
  $("#search-eamil-toNext").addClass("search-email-false");
  $("#search-password-toNext").attr("disabled",true);
  $("#search-password-toNext").addClass("search-email-false");

  var email = "";
  var id="";
  var emailExp = /^[0-9a-zA-Z][0-9a-zA-Z\_\-\.\+]+[0-9a-zA-Z]@[0-9a-zA-Z][0-9a-zA-Z\_\-]*[0-9a-zA-Z](\.[a-zA-Z]{2,6}){1,2}$/;

  $("#search-email").keyup(function(){
    email = $("#search-email").val();
    if(email.match(emailExp)){
      $("#search-eamil-toNext").attr("disabled",false);
      $("#search-eamil-toNext").addClass("search-email-true");
      $("#search-eamil-toNext").removeClass("search-email-false");
    }else{
      $("#search-eamil-toNext").attr("disabled",true);
      $("#search-eamil-toNext").addClass("search-email-false");
      $("#search-eamil-toNext").removeClass("search-email-true");
    }
  })

$("#search-password").keyup(function(){
    email = $("#search-password").val();
    var sliceEmail = email.split("");
    if(sliceEmail.length>5){
      $("#search-password-toNext").attr("disabled",false);
      $("#search-password-toNext").addClass("search-email-true");
      $("#search-password-toNext").removeClass("search-email-false");
    }else{
      $("#search-password-toNext").attr("disabled",true);
      $("#search-password-toNext").addClass("search-email-false");
      $("#search-password-toNext").removeClass("search-email-true");
    }
  })

  $("#search-eamil-toNext").click(function(){
	  $.ajax({
		  type : "POST", //전송방식을 지정한다 (POST,GET)
		  url : "search_login_check.jsp?emailurl="+email,//호출 URL을 설정한다. GET방식일경우 뒤에 파라티터를 붙여서 사용해도된다.
		  dataType : "text",//호출한 페이지의 형식이다. xml,json,html,text등의 여러 방식을 사용할 수 있다.
		  error : function(){
			  alert("통신실패!!!!");
		  },
		  success : function(Parse_data){
			  $(".login_search_div").html(Parse_data);
		  }
	  });
  })
  
   $(".search_rep").click(function(){
	   email = $(".search-email input").val()
	  $.ajax({
		  type : "POST", //전송방식을 지정한다 (POST,GET)
		  url : "search_login.jsp?email="+email,//호출 URL을 설정한다. GET방식일경우 뒤에 파라티터를 붙여서 사용해도된다.
		  dataType : "text",//호출한 페이지의 형식이다. xml,json,html,text등의 여러 방식을 사용할 수 있다.
		  error : function(){
			  alert("통신실패!!!!");
		  },
		  success : function(Parse_data){
			  $(".login_search_div").html(Parse_data);
			  $(".search-email").val(email)
		  }
		  
	  });

  })
  
  $("#search-password-toNext").click(function(){
	  email = $(".search-email input").val()
	  id = $("#search-password").val()
	  
	  $.ajax({
		  type : "POST", //전송방식을 지정한다 (POST,GET)
		  url : "search_login_checkPassword.jsp?email="+email+"&id="+id,//호출 URL을 설정한다. GET방식일경우 뒤에 파라티터를 붙여서 사용해도된다.
		  dataType : "text",//호출한 페이지의 형식이다. xml,json,html,text등의 여러 방식을 사용할 수 있다.
		  error : function(){
			  alert("통신실패!!!!");
		  },
		  success : function(Parse_data){
			  $(".login_search_div").html(Parse_data);
		  }
		  
	  });
  });
  
  $(".search-restart").click(function(){
	  
	  $.ajax({
		  type : "POST", //전송방식을 지정한다 (POST,GET)
		  url : "search_login.jsp?email=",//호출 URL을 설정한다. GET방식일경우 뒤에 파라티터를 붙여서 사용해도된다.
		  dataType : "text",//호출한 페이지의 형식이다. xml,json,html,text등의 여러 방식을 사용할 수 있다.
		  error : function(){
			  alert("통신실패!!!!");
		  },
		  success : function(Parse_data){
			  $(".login_search_div").html(Parse_data);
		  }
		  
	  });
  });
  
$(".search-id-btn button").click(function(){
	 email = $(".search-email input").val()
	 
	  $.ajax({
		  type : "POST", //전송방식을 지정한다 (POST,GET)
		  url : "search_login_checkId.jsp?email="+email,//호출 URL을 설정한다. GET방식일경우 뒤에 파라티터를 붙여서 사용해도된다.
		  dataType : "text",//호출한 페이지의 형식이다. xml,json,html,text등의 여러 방식을 사용할 수 있다.
		  error : function(){
			  alert("통신실패!!!!");
		  },
		  success : function(Parse_data){
			  $(".login_search_div").html(Parse_data);
		  }
		  
	  });
  });


})

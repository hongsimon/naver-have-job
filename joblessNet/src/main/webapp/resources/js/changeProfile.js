$(function(){
  $(".service-del-btn>button").attr("disabled","true");
  console.log("test")
  $("#popOpenBtn").click(function(event){  //팝업 Open 버튼 클릭 시
		  $("#popupDiv").css({
	          "top": (($(window).height()-700)/2+$(window).scrollTop())+"px",
	          "left": (($(window).width()-1000)/2+$(window).scrollLeft())+"px"
	          //팝업창을 가운데로 띄우기 위해 현재 화면의 가운데 값과 스크롤 값을 계산하여 팝업창 CSS 설정
	
	       });

           $("#popup_mask").css("display","block"); //팝업 뒷배경 display block
           $("#popupDiv").css("display","block"); //팝업창 display block

           $("body").css("overflow","hidden");//body 스크롤바 없애기
       });

       $(".popCloseBtn").click(function(event){
           $("#popup_mask").css("display","none"); //팝업창 뒷배경 display none
           $("#popupDiv").css("display","none"); //팝업창 display none
           $("body").css("overflow","auto");//body 스크롤바 생성
       });


$(".service-checkbox>input").change(function(){
  if($('input:checkbox[id="del-check"]').is(":checked")){
    $(".service-del-btn>button").removeAttr("disabled");
    $(".service-del-btn>button").attr("class","del-btn-true");
    console.log("t")
  }else{
    $(".service-del-btn>button").attr("disabled","true");
    $(".service-del-btn>button").attr("class","del-btn-false");
  }

})


var num1 = Math.floor(Math.random() * 29) - 19;
var num2 = Math.floor(Math.random() * 29) - 19;
$("#check_number_1").text(num1);
$("#check_number_2").text(num2);

var result = num1 + num2 ;

$(".service-attendance-check").submit(function(){
  if($("#check_number").val()==""){
    alert("휴먼 제정신입니까?");
    $("#check_img>img").attr("src","/jobless-net/images/bot/alpago_2.png");
    $("#check_2").text("?????????")

    num1 = Math.floor(Math.random() * 29) - 19;
    num2 = Math.floor(Math.random() * 29) - 19;
    $("#check_number_1").text(num1);
    $("#check_number_2").text(num2);

    result = num1 + num2 ;

    $("#check_number").val("");

    return false;
  }else if($("#check_number").val()==result){
    alert("축하합니다 휴먼");
    return true;
  }else{
    alert("휴먼 제정신입니까?");
    $("#check_img>img").attr("src","/jobless-net/images/bot/alpago_2.png");
    $("#check_2").text("?????????")

    num1 = Math.floor(Math.random() * 29) - 19;
    num2 = Math.floor(Math.random() * 29) - 19;
    $("#check_number_1").text(num1);
    $("#check_number_2").text(num2);

    result = num1 + num2 ;

    $("#check_number").val("");

    return false;
  }
})




});

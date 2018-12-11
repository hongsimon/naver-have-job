$(function(){
  $(".search_box select").css("width","65px");
  $(".search_box input").css("width","285px");

  $(".search_box select").change(function(){
    var search_val = $(".search_box select").val();
    switch (search_val) {
      case "title":
        $(".search_box select").css("width","65px");
        $(".search_box input").css("width","285px");
        break;
      case "title_contents":
        $(".search_box select").css("width","100px");
        $(".search_box input").css("width","250px");
        break;
      case "nickname":
        $(".search_box select").css("width","80px");
        $(".search_box input").css("width","270px");
        break;

    }
  })


});

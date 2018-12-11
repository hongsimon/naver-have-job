$(function(){

  broadcaster($(".broadcasterClass").not($(".broadcasterClass[style='display: none;']")).length);

  var up_divs_hight =0;
  var up_divs_width =0;
  var down_divs_width =0;
  var down_divs_hight =0;
  var locationX = 0;
  var locationY = 0;

  $("#searchBox").keyup(function(){
    broadcaster($(".broadcasterClass").not($(".broadcasterClass[style='display: none;']")).length);
    console.log("a")
  })

  function broadcaster(broad_length){
    for(var i=0; i<broad_length; i++){
      // if(broad_length>0){
      //     up_divs_hight = $(".broadcasterClass:eq("+(i-1)+")").offset().top+$(".broadcasterClass:eq(0)").height();
      //     up_divs_width = $(".broadcasterClass:eq("+(i-1)+")").offset().left+$(".broadcasterClass:eq(0)").width();
      //     console.log(i-0)
      //     console.log(up_divs_width);
      //     console.log(up_divs_hight);
      //     console.log("-----------")
      // }
      //
      // if(broad_length>0){
      //   locationX = up_divs_width+20;
      //   locationY = down_divs_hight+30;
      // }
      //
      // if(broad_length%4 == 0 && broad_length!=0){
      //
      // }else{
      //   $(".broadcasterClass:eq("+i+")").css("top",locationX);
      //   $(".broadcasterClass:eq("+i+")").css("left",locationY);
      //
      // }

    }
  }

})

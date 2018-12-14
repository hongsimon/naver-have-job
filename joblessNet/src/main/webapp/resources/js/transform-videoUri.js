$(function(){

  $("#broadcasterList").hide();
  $(".clip-broadcaster-btn-up").hide();

  $(".clip").change(function(){
    var url = $(".clip").val();
    var splits = url.split("/");
    var brand = splits[2].split(".");
    var replaceUrl = "";
    var imgUrl = "";
    var video = "";
    for(var i=0; i<brand.length;i++){
      switch (brand[i]) {
        case "youtu":
          video = splits[3]
          replaceUrl = "https://www.youtube.com/embed/"+video;
          imgUrl = "https://img.youtube.com/vi/"+video+"/mqdefault.jpg"
          $(".clip_url").val(replaceUrl);
          $(".clip_Thumbnail").val(imgUrl);
        break;

        case "afree":

        break;
        case "twitch":
        	if(splits.length==4){     		
        		video = splits[3]
        	}else if(splits.length==6){
        		video = splits[5]
        	}
          if(video.indexOf("?tt_medium=clips_api&tt_content=url") != -1){
        	  video = video.replace("?tt_medium=clips_api&tt_content=url","");
          }
          
          replaceUrl =  "https://clips.twitch.tv/embed?autoplay=false&clip="+video+"&tt_content=embed&tt_medium=clips_embed";
          
           $.ajax({
             url : "https://api.twitch.tv/kraken/clips/"+video,
             type : "GET",
             headers: {
               "Client-ID": "9gtev8scgqmtryin1q0jg9o2px6o6m",
               "Accept": "application/vnd.twitchtv.v5+json"
             },
          
             dataType : "json",
          
             success: function(data) {
               imgUrl = data.thumbnails.small
               console.log(imgUrl)
               $(".clip_url").val(replaceUrl);
               $(".clip_Thumbnail").val(imgUrl);
             },
             error: function(status, e) {
               console.log(status)
               console.log(e)
             }
           });


          break;
          case "kakao":
          video = splits[4];
          replaceUrl = "https://play-tv.kakao.com/embed/player/cliplink/"+video+"?service=kakao_tv";
          $(".clip_url").val(replaceUrl);

          break;
        }
    }

  });


  $(".broadcasterClass a").click(function(){
    $("#searchBox").val($(this).text());
  })

  $(".clip-broadcaster-btn-down").click(function(){
    $("#broadcasterList").show();
    $(".clip-broadcaster-btn-up").show();
    $(".clip-broadcaster-btn-down").hide();
  })

  $(".clip-broadcaster-btn-up").click(function(){
    $("#broadcasterList").hide();
    $(".clip-broadcaster-btn-down").show();
    $(".clip-broadcaster-btn-up").hide();
  })
  
 var where = $('.border-hotclip-service>input').val()
 $(".border-hotclip-service>ul>a").attr("class","hotclip-service-none");
 $(".border-hotclip-service>ul>a[id='"+where+"']").attr("class","hotclip-service-active");




});

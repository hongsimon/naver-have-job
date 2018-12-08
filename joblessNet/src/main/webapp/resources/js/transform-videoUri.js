$(function(){

  //https://youtu.be/zxMdnXtcr3I
  //https://www.youtube.com/embed/zxMdnXtcr3I

  //https://img.youtube.com/vi/nVCubhQ454c/mqdefault.jpg

  //<iframe src="https://www.youtube.com/embed/zxMdnXtcr3I" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>



  $(".clip").change(function(){
    var url = $("input:eq(0)").val();
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
        case "afreecatv":

        break;
        case "twitch":
        replaceUrl = url.replace("www","clips");
        replaceUrl = replaceUrl.replace("ajehr/clip/","embed?clip=");

        $(".clip_url").val(replaceUrl);
        // var options = {
          //   width : 400,
          //   height: 300,
          //   video : "v344902174",
          // };
          // var player = new Twitch.Player("test",options);
          // console.log(player.getVideo());
          //
          // // thumbnail_maker(replaceUrl);
          //
          $.ajax({
            //            url : "https://clips.twitch.tv/embed?clip=FlirtyCalmBatOneHand",
            type : "GET",


            url : "https://api.twitch.tv/kraken/clips/MildSuperCroissantPrimeMe",	//ㅈ위치
            headers: {
              "Client-ID": "9gtev8scgqmtryin1q0jg9o2px6o6m",
              "Accept": "application/vnd.twitchtv.v5+json"
            },




            //        	url : "http://liveimg.afreecatv.co.kr/209358801_480x270.gif?5",	//우가우가

            //        	url : "https://tv.kakao.com/channel/3146476/cliplink/393451215",
            dataType : "json",

            success: function(data) {
              console.log(data.thumbnails)
            },
            error: function(status, e) {
              console.log(status)
              console.log(e)
            }
          });
          break;
          case "kakao":

          break;
        }
    }

  });





});

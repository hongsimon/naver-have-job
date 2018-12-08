$(function(){

  //https://clips.twitch.tv/FlirtyCalmBatOneHand

  $(".clip_url").change(function(){
    var url = $("input:eq(0)").val();
    var split = url.split("/");
    var brand = split[2].split(".");
    var replaceUrl ="";

    switch (brand[1]) {
      case "youtube":

        break;
      case "afreecatv":

        break;
      case "twitch":
        replaceUrl = url.replace("www","clips");
        replaceUrl = replaceUrl.replace("ajehr/clip/","embed?clip=");

        $(".clip_url").val(replaceUrl);
        // $(".upload_ifram").attr("src",replaceUrl);
        // var options = {
        //   width : 400,
        //   height: 300,
        //   video : "v344902174",
        // };
        // var player = new Twitch.Player("test",options);
        // console.log(player.getVideo());
        //
        // // thumbnail_maker(replaceUrl);


        break;
      case "kakao":

        break;
    }
  });



  function thumbnail_maker(url){
    var _CANVAS = document.querySelector("#video-canvas"),
    	_CTX = _CANVAS.getContext("2d"),
    	_VIDEO = document.querySelector("#main-video");

    $("#main-video source").attr('src',url);

    _VIDEO.load();
	  _VIDEO.style.display = 'inline';

    _VIDEO.addEventListener('loadedmetadata', function() { console.log(_VIDEO.duration);
    var video_duration = _VIDEO.duration,
      duration_options_html = '';

    // Set canvas dimensions same as video dimensions
    _CANVAS.width = _VIDEO.videoWidth;
  _CANVAS.height = _VIDEO.videoHeight;
  });

  document.querySelector("#main-video").addEventListener('timeupdate', function() {
	// Re-enable the dropdown and show the Download link
    document.querySelector("#get-thumbnail").style.display = 'inline';
});

document.querySelector("#get-thumbnail").addEventListener('click', function() {
    _CTX.drawImage(_VIDEO, 0, 0, _VIDEO.videoWidth, _VIDEO.videoHeight);

	document.querySelector("#get-thumbnail").setAttribute('href', _CANVAS.toDataURL());
	document.querySelector("#get-thumbnail").setAttribute('download', 'thumbnail.png');
});




  }





});

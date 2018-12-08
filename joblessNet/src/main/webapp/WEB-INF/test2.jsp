<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="video-demo-container">
		<video width="800px" id="video-element"
			src="https://clips-media-assets2.twitch.tv/AT-cm%7C350794810.mp4"
			controls>
			<source type="video/mp4">
		</video>
		<canvas id="canvas-element"></canvas>
		<div id="thumbnail-container">
			Seek to <select id="set-video-seconds"></select> seconds <a
				id="download-link" href="#">Download Thumbnail</a>
		</div>
	</div>
	<script type="text/javascript">
		var _VIDEO = document.querySelector("#video-element"),
		_CANVAS = document.querySelector("#canvas-element"),
	    _CANVAS_CTX = _CANVAS.getContext("2d");
	
		// Video metadata is loaded
		_VIDEO.addEventListener('loadedmetadata', function() {
			// Set canvas dimensions same as video dimensions
			_CANVAS.width = _VIDEO.videoWidth;
			_CANVAS.height = _VIDEO.videoHeight;
		});
		
		document.querySelector("#download-link").addEventListener('click', function() {
			_CANVAS_CTX.drawImage(_VIDEO, 0, 0, _VIDEO.videoWidth, _VIDEO.videoHeight);

			document.querySelector("#download-link").setAttribute('href', _CANVAS.toDataURL());
		});

		// Placing the current frame image of the video in the canvas
		

		document.querySelector("#download-link").setAttribute('download', 'thumbnail.png');
		// Setting parameters of the download link
	</script>
</body>
</html>
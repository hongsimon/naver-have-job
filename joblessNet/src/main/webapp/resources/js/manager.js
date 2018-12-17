$(function(){
  $(".change_true").click(function(){
    var text = $(this).parent().prev();
    var url = $(this).parent().prev().prev();
    var num = $(this).parent().prev().prev().prev();

    text.html("<textarea class='changearea'>"+text.text().replace(/(\s*)/g, "")+"</textarea>");
    url.html("<textarea class='changearea'>"+url.text().replace(/(\s*)/g, "")+"</textarea>");
    num.html("<input type='hidden' value="+num.text().replace(/(\s*)/g, "")+" readonly>"+num.text().replace(/(\s*)/g, ""));
    $(this).parent().html("<button type='submit' id='change_true' ><span class='glyphicon glyphicon-ok'></span></button>");


  })
})

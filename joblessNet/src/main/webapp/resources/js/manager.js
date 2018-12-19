$(function(){
  $(".change_true").click(function(){
    var text = $(this).parent().prev();
    var url = $(this).parent().prev().prev();
    var num = $(this).parent().prev().prev().prev();
    
    text.html("<textarea name='addTitle' class='changearea' rows='10'>"+text.text().replace(/(\s*)/g, "")+"</textarea>");
    url.html("<textarea name='addLink' class='changearea' rows='10'>"+url.text().replace(/(\s*)/g, "")+"</textarea>");
    num.html("<input name='addId' type='hidden' value="+num.text().replace(/(\s*)/g, "")+" readonly>"+num.text().replace(/(\s*)/g, ""));
  
//    text.html("<textarea name='text"+num.text().replace(/(\s*)/g, "")+"' class='changearea' rows='10'>"+text.text().replace(/(\s*)/g, "")+"</textarea>");
//    url.html("<textarea name='url"+num.text().replace(/(\s*)/g, "")+"' class='changearea' rows='10'>"+url.text().replace(/(\s*)/g, "")+"</textarea>");
//    num.html("<input name='number="+num.text().replace(/(\s*)/g, "")+"' type='hidden' value="+num.text().replace(/(\s*)/g, "")+" readonly>"+num.text().replace(/(\s*)/g, ""));
    
    $(".change_true").parent().not($(this).parent()).html("<button type='button' class='change_false'  id='change_false' disabled='true' ><span class='glyphicon glyphicon-remove'></span></button>");
    $(this).parent().html("<button type='submit' class='change_true'  id='change_true' ><span class='glyphicon glyphicon-ok'></span></button>");


  })
  
  
})

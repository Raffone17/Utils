/*$(document).ready(function(){ 
	$("h1").addClass("greenBack");
	$("h2").addClass("redBack");
	
	var listItemH1 = $('h1');
	var listItemH2 = $('h2');
	listItemH1.addClass("greenBack");
	listItemH1.addClass("greenBack");
	
});*/

$("#add").click(function(){
	$("h1").addClass("greenBack");
	$("h2").addClass("redBack");
});
$("#remove").click(function(){
	$("h1").removeClass("greenBack");
	$("h2").removeClass("redBack");
});

$('#addRemove').click(function() {
  var clicks = $(this).data('clicks');
  if (clicks) {
    $("h1").addClass("greenBack");
	$("h2").addClass("redBack");
  } else {
     $("h1").removeClass("greenBack");
	$("h2").removeClass("redBack");
  }
  $(this).data("clicks", !clicks);
});

$('#changeColor').click(function(){
	if($("h1").hasClass("greenBack") && $("h2").hasClass("redBack"))
	{
		$("h1").removeClass("greenBack");
		$("h2").removeClass("redBack");
	}else{
		$("h1").addClass("greenBack");
	    $("h2").addClass("redBack");
		
	}
});

$('#changeColor2').click(function(){
	$("h1").toggleClass("greenBack");
	$("h2").toggleClass("redBack");
});

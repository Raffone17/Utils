$(document).ready(function(){

	$("textarea[name='message']").keyup(function(){
		
		var length = $("textarea[name='message']").val().length;
		var res= 140 - length;
		$('h6').html(res);
		if(length == 0  || length > 140 ){
			
    		 document.getElementById("button").disabled = true;
			
		}else{
			document.getElementById("button").disabled = false;
		}

	});

	$('#button').click(function(){
		var text= $("textarea[name='message']").val();
		$("textarea[name='message']").val('');
		$('h6').html('140');
		document.getElementById("button").disabled = true;
		$('#postato').prepend('<div class="col-sm-12 box">'+text+'</div>');

	});


});
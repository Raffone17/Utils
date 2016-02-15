$().ready(function(){
	
	/*$('input[type="password"]').keyup(function(){
		console.log($(this).val());
		});*/
		
	$('input[type="email"]').keyup(function(){
		$('#ciao').html($(this).val());
	});
		
	$('input[type="email"]').keyup(function(){
		$('.container').append('<div>'+$(this).val()+'</div>');
		});
	
});

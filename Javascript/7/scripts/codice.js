$().ready(function(){

	var root = 'http://jsonplaceholder.typicode.com';

	$('#pressMe').click(function(){
		var ajaxOptions ={
			url: root + '/posts',
			method: 'GET'	
		};
		$.ajax(ajaxOptions).
			then(function(data){
				console.log(data[0].title);
				var i;
				for(i = 0; i<10; i++){
					/*var row = 'vkmvlmlkvmfdlmvkldfklvmdfklmvd';
					$('.text-center')appent(row);*/
					$('.container').append('<div class="box"><h4>Title:</h4>');
					$('.container').append(data[i].title);
					$('.container').append('<h4>Content:</h4>');
					$('.container').append(data[i].body+'</div>');

				}
			});
	});

});
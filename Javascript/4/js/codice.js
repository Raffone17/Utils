$().ready(function(){

	var listItem = $('li');

	for(var i=0; i<listItem.length; i++){

		var elem = listItem.eq(i);
		if (elem.is('.special')) {
			elem.removeClass('special');
			elem.addClass('bomba');
		};
	}
	





});




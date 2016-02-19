$( document ).ready(function() {
	$(document).keydown(function(e){
	    switch (e.which){
	    case 37:    //left arrow key
	        $(".mario").animate({left: "-=25"},'fast');

	        break;
	    case 38:    //up arrow key
	        $(".mario").animate({bottom: "+=25px"},'fast');
	 
	        break;
	    case 39:    //right arrow key
	        $(".mario").animate({left: "+=25px"},100);

	        break;
	    case 40:    //bottom arrow key
	    var img = $("img");
	    var position = $("img").position();
	    var bottom = $(window).height() - position.top - img.height();
	    console.log(position.top+" "+bottom);
	    if(bottom > 0){
	        $(".mario").animate({bottom: "-=25px"},'fast');
	    }
	    setTimeout(function(){
    			//do what you need here
		}, 500);
	        break;
	    }
	});
	setInterval(function(){
		var img = $("img");
	    var position = $("img").position();
	    var bottom = $(window).height() - position.top - img.height();
	    console.log(position.top+" "+bottom);
	    if(bottom > 0){
	    	$(".mario").animate({bottom: "-=25px"},'fast');
	    }

	}, 400);
	window.setInterval(function(){
		var img = $("img");
	    var position = $("img").position();
	    var bottom = $(window).height() - position.top - img.height();
	    console.log(position.top+" "+bottom);
	    if(bottom < 0){
	    	$(".mario").animate({bottom: "+=25px"},'fast');
	    }

	}, 100);

	/*window.setInterval(function(){
		var rand = Math.floor((Math.random() * 4) + 1);
		 switch (rand){
	    case 1:    //left arrow key
	        $(".mario").animate({left: "-=25"},'fast');

	        break;
	    case 2:    //up arrow key

	        $(".mario").animate({bottom: "+=25px"},'fast');
	 
	        break;
	    case 3:    //right arrow key
	        $(".mario").animate({left: "+=25px"},'fast');

	        break;
	    case 4:    //bottom arrow key
	    var img = $("img");
	    var position = $("img").position();
	    var bottom = $(window).height() - top - img.height();
	    console.log(position.top);
	    if(bottom > 0){
	        $(".mario").animate({bottom: "-=25px"},'fast');
	    }
	
	        break;
	    }
			
		}, 200);*/


});

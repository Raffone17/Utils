$(document).ready(function(){
	console.log('ciaociao');

	$('#submit').click(function(){
		validateName($('#name').val());
		validateEmail($('#email').val());
		validatePhone($('#phone').val());
		validateCompany($('#company').val());
		validateMessage($('#message').val());
	});
	




	function validateName(name){
		if($.isNumeric(name) || name === ""){
			console.log('validateName: not correct');
			return false;
		}else{
			console.log('validateName: correct');
			return true;
		}

	}

	function validateEmail(email){
		var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
  		if(regex.test(email)){
  			console.log('validateEmail: correct Email');
  			return true;
  		}else{
  			console.log('validateEmail: incorrect Email');
  			return false;
  		}
	}

	function validatePhone(number){
		var regex = /\(?([0-9]{3})\)?([ .-]?)([0-9]{3})\2([0-9]{4})/
		if(regex.test(number)){
			console.log('validatePhone: correct Phone number');
  			return true;
		}else{
			console.log('validatePhone: incorrect Phone number');
  			return false;
		}

	}


	function validateCompany(name){
		if($.isNumeric(name) || name === ""){
			console.log('validateCompany: not correct');
			return false;
		}else{
			console.log('validateCompany: correct');
			return true;
		}

	}

	function validateMessage(name){
		if($.isNumeric(name) || name === "" || name.length>140){
			console.log('validateMessage: not correct');
			return false;
		}else{
			console.log('validateMessage: correct');
			return true;
		}

	}


});
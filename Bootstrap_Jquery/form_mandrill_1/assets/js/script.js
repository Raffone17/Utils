$(document).ready(function(){
	

	$('#contact-form').on('submit',function(){

		// API Key
		var key = 'inserisci key'

		var email = $("#email").val(); // estrapolo valore campo email
	     var name = $("#name").val(); // estrapolo valore campo nome
	     var phone = $('#phone').val();
	     var company = $('#company').val();
	     var message = $("#message").val(); // estrapolo valore campo messaggio


	     if(validateAll(name,email,phone,company,message)){



	     	message = "Company: "+company+"\n"+"Phone: "+phone+"\n"+message;
	     	$.ajax(
	     	{
	     		type: "POST",
	     		url: "https://mandrillapp.com/api/1.0/messages/send.json",
	     		data: {
	     			'key': key,
	     			'message': {
	     				'from_email': email,
	     				'from_name': name,	                 
	     				'headers': {
	     					'Reply-To': email
	     				},
	     				'subject': 'Contatto generato da Mio Sito',
	     				'text': message,
	     				'to': [
	     				{
	     					'email': 'tuaemail@email.com',
	     					'name': 'TuoNome',
	     					'type': 'to'
	     				}]
	     			}
	     		}
	     	})
	     	.done(function(response) {
	     		console.log(response);	
	            alert('Messaggio inviato corretamente! Grazie'); // Messaggio di successo
	            $("#name").val(''); // reset campo dopo l'invio
	            $("#email").val(''); // reset campo dopo l'invio
	            $("#phone").val('');
	            $("#company").val('');
	            $("#message").val(''); // reset campo dopo l'invio
	            $('.text-danger').html("");
	            $('#contact-form').html("");
	            $('#small').html("Grazie per averci contattato. Risponderemmo al piu' presto!")

	        })
	     	.fail(function(response) {
	     		console.log(response);
	     		$('.text-danger').html("");
	     		alert('Errore durante l\'invio del messaggio.');
	     	});
	        return false; // previene il refresh della pagina

	    }else{
	    	return false;
	    }


	});


function sendEmail(params)
{

}


function validateName(name)
{
	if($.isNumeric(name) || name === ""){
		console.log('validateName: not correct');
		$('.text-danger').html("Nome non valido!");
		return false;
	}else{
		console.log('validateName: correct');
		return true;
	}

}

function validateEmail(email)
{
	var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if(regex.test(email)){
		console.log('validateEmail: correct Email');
		return true;
	}else{
		console.log('validateEmail: incorrect Email');
		$('.text-danger').html("Email non valida!");
		return false;
	}
}

function validatePhone(number)
{
	var regex = /\(?([0-9]{3})\)?([ .-]?)([0-9]{3})\2([0-9]{4})/;
	if($.isNumeric(number)&&number.length>8){
		console.log('validatePhone: correct Phone number');
		return true;
	}else{
		console.log('validatePhone: incorrect Phone number');
		$('.text-danger').html("Numero non valido!");
		return false;
	}

}


function validateCompany(name)
{
	if($.isNumeric(name) || name === ""){
		console.log('validateCompany: not correct');
		$('.text-danger').html("Nome compania non valida!");
		return false;
	}else{
		console.log('validateCompany: correct');
		return true;
	}

}

function validateMessage(name)
{
	if($.isNumeric(name) || name === "" || name.length>140){
		console.log('validateMessage: not correct');
		$('.text-danger').html("Messaggio non valido!");
		return false;
	}else{
		console.log('validateMessage: correct');
		return true;
	}

}

function validateAll(name,email,phone,company,message)
{
	if(validateName(name)&&validateEmail(email)&&
		validatePhone(phone)&&validateCompany(company)&&
		validateMessage(message)){

		console.log("Puoi mandare l'email.");
	return true;
}else{
	console.log("Non puoi mandare l'email!");
	return false;
}


}


});


/*var params{
	'message': {
		'from_email': email,
		'from_name': name,	                 
		'headers': {
			'Reply-To': email
		},
		'subject': 'Contatto generato da Mio Sito',
		'text': message,
		'to': [
		{
			'email': 'tuaemail@gmail.com',
			'name': 'nome',
			'type': 'to'
		}]
	}
}*/

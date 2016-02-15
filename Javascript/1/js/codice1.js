function Salutami(){
	alert("Stai morendo?");
}

function Prove(){
	var testo = "il mio testo";
	console.log(typeof(testo));
	console.log(testo+3);
	testo = 2;
	console.log(typeof(testo));
	console.log(testo+3);
	testo = true;
	console.log(typeof(testo));
	console.log(testo+1);
}

function changeImage() {
    var image = document.getElementById('myImage');
    if (image.src.match("bulbon")) {
        image.src = "img/pic_bulboff.gif";
    } else {
        image.src = "img/pic_bulbon.gif";
    }
}

<html>
<h3>Calcolatrice in php, inserire operazione con spazi</h3>
	<form method="POST">
		<br /> Calcolatrice: <br />
		<input type="text" name="expr"/>
		<input type="submit" value="Calcola"/>
	</form>
</html>

<?php

	if(isset($_POST["expr"])){
		$expr=$_POST["expr"];
		echo $expr;
		$array=[];
		$array = explode(" ",$expr);
		if(is_numeric($array[0]) && is_numeric($array[2])){

			echo "<br />Il risultato &egrave: ";
			switch ($array[1]){
	
			case "+":
				echo ($array[0] + $array[2]);
				break;
			case "-":
				echo ($array[0] - $array[2]);
				break;
			case "*":
				echo ($array[0] * $array[2]);
				break;
			case "/":
				echo ($array[0] / $array[2]);
				break;
			default: 
				echo "OPERANDO SBAGLIATO!";
			}
		}else{
			echo "<br />Hai sbagliato a inserire qualcosa!";
		}
	}
?>

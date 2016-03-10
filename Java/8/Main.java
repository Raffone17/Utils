public class Main{

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Matteo", "Candeliere", "CNDMTT90M05L219E");
		Persona persona2 = new Persona("Filippo", "Cocchia", "CCCAHJUAHSF842U2");
		Persona persona3 = new Persona("Mario","Rossi","2385271ERRGASG42");
		
		Cane cane1 = new Cane("Dio", 7, "M");
		Cane cane2 = new Cane("Athos", 4, "M");
		Cane cane3 = new Cane("Dolly", 10, "F");
		Cane cane4 = new Cane("Pluto", 1, "M");
		
		Coppia coppia1 = new Coppia(persona1, cane1);
		Coppia coppia2 = new Coppia(persona2, cane2);
		Coppia coppia3 = new Coppia(persona3, cane3);
		Coppia coppia4 = new Coppia(persona3, cane4);
		
		Coppia[] coppie = {coppia1, coppia2, coppia3, coppia4};
		AnagrafeCanina anagrafe = new AnagrafeCanina(coppie);
		
		/*anagrafe.stampaNomeCanePadrone();
		anagrafe.stampaNomeCompletoCani();*/
		System.out.println(anagrafe.ritornaPadrone(1));
		anagrafe.contaNumeroCaniConPadrone("Mario");
	
	}

}
import java.util.Scanner;

public class ProvaVendita
{
	public static void main (String [] args)
	{
		Vendibile[] lista = new Vendibile[6];
		int i;

		lista[0] = new Bicicletta("BMX","Marco Aurelio",(float)125.25);
		lista[1] = new Bicicletta("Mountain Bike","Giacomo Rossi",(float)180.75);
		lista[2] = new CompactDisc("Che palle","Felice Mastronzo","1998",10,(float)22.31);
		lista[3] = new CompactDisc("BELAAAAA","Tizio Caio","1977",7,15);
		lista[4] = new BiciElettrica("SigleSpeed","Pirlone",(float)80,190,6);
		lista[5] = new BiciElettrica("SigleSpeed","Pirlone",(float)100,190,6);

		EngimMarket mercato = new EngimMarket();
		for( i=0; i<lista.length; i++){
			mercato.addVenduto(lista[i]);
		}

		System.out.println(mercato);
		for( i=0; i<5; i++){
			mercato.addVenduto(new CompactDisc("BELAAAAA","Tizio Caio","1977",7,15));
		}
		for( i=0; i<3; i++){
			mercato.addVenduto(new Bicicletta("BMX","Marco Aurelio",(float)125.25));
		}
		
		System.out.println(mercato);
		System.out.println("Bici vendute: "+mercato.biciVendute());

		for( i=0; i<10; i++){
			mercato.addVenduto(new CompactDisc("BELAAAAA","Tizio Caio","1977",7,15));
		}
		System.out.println(mercato);
		//mercato.stampaVenduti();
	}


}
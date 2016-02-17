import java.util.Scanner;

public class Esercizio04
{
	public static void main (String [] args)
	{
		int i;
		double media,somma=0;

		Scanner tastiera=new Scanner(System.in);
		for(i=0; i<3; i++){
			System.out.println("Inserisci uno dei 3 valori: ");
			somma+=tastiera.nextInt();
		}
		media = somma/3;
		System.out.println("La media dei numeri è: "+media);
	}
}
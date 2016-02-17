import java.util.Scanner;

public class Esercizio05
{
	public static void main (String [] args)
	{
		int i;
		double numero, max=0;

		Scanner tastiera=new Scanner(System.in);
		for(i=0; i<3; i++){
			System.out.println("Inserisci uno dei 3 valori: ");
			numero=tastiera.nextInt();
			

			if(numero>max){
				max = numero;

			}
		}

		System.out.println("Il massimo fra i 3 numeri è: "+max);
	}
}
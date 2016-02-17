import java.util.Scanner;

public class Esercizio14
{
	public static void main (String [] args)
	{
		double num, fattoriale=1;
		int i;

		Scanner tastiera=new Scanner(System.in);

		System.out.println("Immetere un numero di cui calcolare il fattoriale: ");
		num = tastiera.nextInt();

		for(i=1; i<=num; i++){
			fattoriale*=i;
		}

		System.out.println("Il fattoriale è: "+fattoriale);

	}
}
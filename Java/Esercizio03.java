import java.util.Scanner;

public class Esercizio03
{
	public static void main (String [] args)
	{
		double base,altezza,ipotenusa;

		Scanner tastiera=new Scanner(System.in);
		System.out.println("--------Calcolo ipotenusa triangolo rettangolo------- ");

		System.out.println("Dammi la base del triangolo: ");
		base=tastiera.nextInt();

		System.out.println("Dammi l'altezza: ");
		altezza=tastiera.nextInt();

		ipotenusa= Math.sqrt(base*base+altezza*altezza);
		System.out.println("Ia misura dell'ipotenusa e': "+ipotenusa);
	}
}
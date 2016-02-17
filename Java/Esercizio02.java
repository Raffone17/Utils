import java.util.Scanner;

public class Esercizio02
{
	public static void main (String [] args)
	{
		int base,altezza,perimetro;

		Scanner tastiera=new Scanner(System.in);
		System.out.println("--------Calcolo permetro rettangolo------- ");

		System.out.println("Dammi la base del rettangolo: ");
		base=tastiera.nextInt();

		System.out.println("Dammi l'altezza: ");
		altezza=tastiera.nextInt();

		perimetro=(altezza+base)*2;
		System.out.println("Il perimetro e': "+perimetro);
	}
}
import java.util.Scanner;

public class Esercizio01
{
	public static void main (String [] args)
	{
		int anno_nascita,anno_attuale,eta;
		
		Scanner tastiera=new Scanner(System.in);
		System.out.println("Dammi l'anno di nasicta?");

		anno_nascita=tastiera.nextInt(); 

		System.out.println("Dimmi l'anno attuale?");

		anno_attuale=tastiera.nextInt(); 
		eta = anno_attuale-anno_nascita;
		
		System.out.println("Ciao, hai "+eta+" anni.");


	}
}

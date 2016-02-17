import java.util.Scanner;

public class Esercizio15
{
	public static void main (String [] args)
	{

		

		int i, count=0;

		Scanner tastiera=new Scanner(System.in);

		System.out.println("Scrivi una parola: ");
		String word = tastiera.nextLine();

		System.out.println("Scrivi la lettera da cercare: ");
		String lettera = tastiera.nextLine();
		
		for(i=0; i<word.length(); i++){
			if(lettera.charAt(0) == word.charAt(i)){
				count++;
			}
		}

		System.out.println("La lettera è presente "+count+" volte!");
	}
}
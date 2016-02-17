import java.util.Scanner;

public class Esercizio09
{
	public static void main (String [] args)
	{
		int num1, num2, i;

		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserisci il primo numero:");

		num1=tastiera.nextInt();
		System.out.println("Inserisci il secondo numero:");
		num2=tastiera.nextInt();

		while(num2<num1){
			System.out.println("Inserisci un secondo numero più grande:");
			num2=tastiera.nextInt();
		}

		for(i=(num1+1); i<num2; i++){
			System.out.println("num: "+i);
		}
	}
}
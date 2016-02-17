import java.util.Scanner;

public class Esercizio06
{
	public static void main (String [] args)
	{
		
		double num1,num2,max;

		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserisci il primo numero: ");
		num1=tastiera.nextInt();
		System.out.println("Inserisci il secondo numero: ");
		num2=tastiera.nextInt();
		System.out.println("Inserisci il numero maggiore: ");
		max=tastiera.nextInt();

		if(Math.sqrt(num1*num1+num2*num2)==max){
			System.out.println("E' una terna pitagorica. ");
		}else{
			System.out.println("Non è una terna pitagorica. ");
		}
		

		
	}
}
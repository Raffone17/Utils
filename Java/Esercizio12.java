import java.util.Scanner;

public class Esercizio12
{
	public static void main (String [] args)
	{
		int i=0,max=10;
		double somma=0, media, min=0,num;

		Scanner tastiera=new Scanner(System.in);
		System.out.println("Immettere 10 numeri:");

		for(i=0; i<max; i++){
			System.out.println("Scrivere numero "+i+" :");
			num = tastiera.nextInt();
			somma += num;
			if(i==0){
				min = num;
			}else{
				if(num<min){
					min = num;
				}
			}

		}
		media = somma / max;
		System.out.println("La media dei numeri e': "+media);
		System.out.println("Il numero più piccolo è: "+min);
	}
}
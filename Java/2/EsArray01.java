import java.util.Scanner;

public class EsArray01
{
	public static void main (String [] args)
	{
		int[] array = new int[5];
		int i, somma=0;

		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserire 5 numeri: ");

		for(i=0; i<5; i++){
			System.out.println("Inserire numero "+(i+1)+" :");
			array[i]=tastiera.nextInt();
			somma+=array[i];
		}
		System.out.println("La somma dei numeri è: "+somma);

	}
}

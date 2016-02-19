import java.util.Scanner;

public class EsArray07
{
	public static void main (String [] args)
	{ 
		int dim, somma1, somma2;

		Scanner tastiera=new Scanner(System.in);

		System.out.println("Inserisci la dimensione del primo array: ");
		dim = tastiera.nextInt();
		int [] array1 = new int [dim];
		

		System.out.println("Inserisci primo array: ");
		salvaArray(array1);
		stampArray(array1);

		System.out.println("Inserisci la dimensione del primo array: ");
		dim = tastiera.nextInt();
		int [] array2 = new int [dim];
		salvaArray(array2);
		stampArray(array2);

		somma1=sommaArray(array1);
		somma2=sommaArray(array2);
		System.out.println("Somma primo array: "+somma1+" Somma secondo array: "+somma2);


		

		

	}

	public static void salvaArray (int [] array)
		{
			int i;
			Scanner tastiera=new Scanner(System.in);

			for(i=0; i<array.length; i++){
				System.out.println("Inserire numero "+(i+1)+" :");
				array[i]=tastiera.nextInt();
			}
		}

	public static void stampArray (int [] array)
		{
			int i;
			for(i=0; i < array.length; i++){
				System.out.println("Array pos "+i+" = "+array[i]);
			}

		}

	public static int sommaArray(int [] array)
	{
		int i,somma=0;

		for(i=0; i < array.length; i++){
				somma+=array[i];
			}

		return somma;

	}

}
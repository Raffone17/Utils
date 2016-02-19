import java.util.Scanner;

public class EsArray08
{
	public static void main (String [] args)
	{ 
		int dim;

		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserisci la dimensione dei array: ");
		dim = tastiera.nextInt();
		int [] array1 = new int [dim];
		int [] array2 = new int [dim];

		salvaArray(array1);
		copiaArray(array1,array2);
		System.out.println("Stampa copia array: ");
		stampArray(array2);

		copiaInversoArray(array1,array2);
		System.out.println("Stampa inverso array: ");
		stampArray(array2);

		scambiaArray(array1,array2);
		System.out.println("Stampa scambio array 1: ");
		stampArray(array1);
		System.out.println("Stampa scambio array 2: ");
		stampArray(array2);

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

	public static void copiaArray (int [] array1, int [] array2)
	{
		int i;
		if(array1.length==array2.length){
			for(i=0; i<array1.length; i++)
			{
				array2[i]=array1[i];
			}
		}
	}

	public static void copiaInversoArray (int [] array1, int [] array2)
	{
		int i;
		if(array1.length==array2.length){
			for(i=0; i<array1.length; i++)
			{
				array2[i]= -array1[i];
			}
		}
	}

	public static void stampArray (int [] array)
		{
			int i;
			for(i=0; i < array.length; i++){
				System.out.println("Array pos "+i+" = "+array[i]);
			}

		}

	public static void scambiaArray (int [] array1, int [] array2)
	{
		int i, tmp;
		if(array1.length==array2.length){
			for(i=0; i<array1.length; i++)
			{
				tmp = array1[i];
				array1[i] = array2[i];
				array2[i] = tmp;
			}
		}

	}

}
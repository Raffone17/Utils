import java.util.Scanner;

public class CercaNomi
{
	public static void main (String [] args)
	{ 
		int i,dim,num;
		String nome;


		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserisci la dimensione della classe: ");
		dim = tastiera.nextInt();
		String[] studenti = new String[dim];

		System.out.println("Inserisci gli studenti della classe: ");
		riempiStringaArray(studenti);
		stampStringaArray(studenti);

		System.out.println("Inserisci il nome da cercare: ");
		tastiera.nextLine();
		nome = tastiera.nextLine();

		num = cercaStringa(studenti,nome);

		System.out.println("Il nome è presente "+num+" volte");

	}



	public static void riempiStringaArray(String [] array)
	{
		int i;

		Scanner tastiera=new Scanner(System.in);	

		for(i=0; i<array.length; i++){
			array[i]=tastiera.nextLine();
		}


	}

	public static void stampStringaArray (String [] array)
		{
			int i;
			for(i=0; i < array.length; i++){
				System.out.println("Array pos "+i+" = "+array[i]);
			}

		}

	public static int cercaStringa (String[] array, String nome)
	{
		int i, num=0;
		for(i=0; i < array.length; i++){
				if(array[i].equals(nome)){
					num++;
				}
			}
		return num;
	}
}
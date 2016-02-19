import java.util.Scanner;

public class Classifica
{
	public static void main (String [] args)
	{ 
		int i,dim=10, count=1;
		String[] concorrenti = new String[dim];

		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserire uno dopo l'altro quelli che posano il peso: ");

		for(i=0; i<dim; i++){
			concorrenti[i]=tastiera.nextLine();
		}

		System.out.println("Classifica dei partecipanti: ");
		for(i=9; i>=0; i--){
			System.out.println("Concorrente in posizione"+count+": "+concorrenti[i]);
			count++;
		}
	}

}
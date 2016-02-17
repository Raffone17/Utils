import java.util.Scanner;

public class EsArray05
{
	public static void main (String [] args)
	{
		int dim,max=0,i;
		boolean ordinato = true;
		

		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserire dimensione array: ");
		dim=tastiera.nextInt();

		int[] array = new int[dim];
		for(i=0; i<dim; i++){
			System.out.println("Inserire numero in posizione: "+i+" :");
			array[i]=tastiera.nextInt();
			if(i!=0){
				if(array[i]<array[i-1]){
					ordinato=false;
				}
			}
			
		}

		System.out.println("E' ordinato: "+ordinato);

	}


}

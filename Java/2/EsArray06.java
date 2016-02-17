import java.util.Scanner;

public class EsArray06
{
	public static void main (String [] args)
	{
		int dim,i;
		boolean sequenza = true;
		

		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserire dimensione array: ");
		dim=tastiera.nextInt();


		int[] array = new int[dim];
		for(i=0; i<dim; i++){
			System.out.println("Inserire numero in posizione: "+i+" :");
			array[i]=tastiera.nextInt();
			if(dim>=3&&i>1){
				if(array[i]!=array[i-1]+array[i-2]){
					sequenza = false;
				}

			}
			
		}
		if(dim<3){
			sequenza=false;
		}

		System.out.println("Squenza soddisfatta: "+sequenza);

		

	}


}
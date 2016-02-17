import java.util.Scanner;

public class EsArray04
{
	public static void main (String [] args)
	{
		int dim,max=0,i,confr,count=0;
		boolean res=false;

		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserire dimensione array: ");
		dim=tastiera.nextInt();

		int[] array = new int[dim];
		for(i=0; i<dim; i++){
			System.out.println("Inserire numero in posizione: "+i+" :");
			array[i]=tastiera.nextInt();
			
		}

		System.out.println("Inserire valore di confronto: ");
		confr=tastiera.nextInt();

		for(i=0; i<dim; i++){
			if(max<array[i]){
				max=array[i];
				if(array[i]>confr){
					count++;
				}
			}

		}
		if(confr>max){
			res=true;
		}

		System.out.println("Il risultato e': "+res);
		System.out.println("Ci sono "+count+" elementi maggiori di "+confr);

	}


}

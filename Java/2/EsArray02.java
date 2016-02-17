import java.util.Scanner;

public class EsArray02
{
	public static void main (String [] args)
	{
		int dim,max=0,pos=0,i;

		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserire dimensione array: ");
		dim=tastiera.nextInt();

		int[] array = new int[dim];
		for(i=0; i<dim; i++){
			System.out.println("Inserire numero in posizione: "+i+" :");
			array[i]=tastiera.nextInt();
			if(i==0){
				max=array[i];
			}
			if(array[i]>max){
				max=array[i];
				pos=i;
			}
		}

		System.out.println("Il numero più grande è: "+max+" in posizione: "+pos);
	}
}
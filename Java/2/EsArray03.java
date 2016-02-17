import java.util.Scanner;

public class EsArray03
{
	public static void main (String [] args)
	{
		double[] data = {13,24,78,34,67,16};
		stampArray(data);
		scambiaMinMax(data);

		System.out.println("Scambio min e max: ");
		stampArray(data);
	}


	public static void stampArray (double [] array)
	{
		int i;
		for(i=0; i < array.length; i++){
			System.out.println("Array pos "+i+" = "+array[i]);
		}

	}

	public static void scambiaMinMax (double [] array)
	{
		int i,posmin=0, posmax=0;
		double min=0,max=0;

		for(i=0; i < array.length; i++){
			if(i==0){
				min=array[i];
				posmin=i;
				max=array[i];
				posmax=i;
			}
			if(array[i]<min){
				min=array[i];
				posmin=i;
			}
			if(array[i]>max){
				max=array[i];
				posmax=i;
			}
		}
		array[posmin]=max;
		array[posmax]=min;

	}
}
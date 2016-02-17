import java.util.Scanner;

public class Esercizio10
{
	public static void main (String [] args)
	{
		int num1, num2, mcm=0,mcd=0;

		Scanner tastiera=new Scanner(System.in);

		System.out.println("Inserisci il primo numero:");
		num1=tastiera.nextInt();
		System.out.println("Inserisci il secondo numero:");
		num2=tastiera.nextInt();

		if(num1>=num2){
			mcm=num1;
			mcd=num2;
		}else{
			mcm=num2;
			mcd=num1;
		}

		while((mcm%num1!=0)||(mcm%num2!=0)){
			mcm++;

		}

		while((num1%mcd!=0)||(num2%mcd!=0)){
			mcd--;
		}

		System.out.println("MCM = "+mcm+" MCD = "+mcd);

	}
}
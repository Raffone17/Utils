import java.util.Scanner;
import java.lang.reflect.Constructor;

public class Bicicletta
{
	String modello, nomeProrpietario;
	int marcia, velocita;

	public Bicicletta(String modelloP, String nome, int velInz, int marciaInz)
	{
		modello = modelloP;
		nomeProrpietario = nome;
		marcia = marciaInz;
		velocita = velInz;

	}

	public Bicicletta(String modelloP, int marciaInz)
	{
		modello = modelloP;
		marcia = marciaInz;

	}

	public String getModello()
	{

		return modello;

	}

	public String getNomeProprietario()
	{
		if(nomeProrpietario != null){
			return nomeProrpietario;
		}else{
			return "Nessun Prorpietario";
		}

	}

	public int getMarcia()
	{
		return marcia;

	}

	public void cambiaMarcia(int nMarcia)
	{
		marcia = nMarcia;

	}

	public int getVelocita()
	{
		return velocita;

	}

	public void aumentaVelocita(int incr)
	{
		velocita += incr;


	}

	public void stampaStato()
	{
		String proprietario;

		if(nomeProrpietario != null){
			proprietario = nomeProrpietario;
		}else{
			proprietario = "Nessun Prorpietario";
		}
		System.out.println("Modello: "+modello);
		System.out.println("Proprietario: "+proprietario);
		System.out.println("Marcia: "+marcia);
		System.out.println("Velocita: "+velocita);


	}

	/*public static void main (String [] args)
	{
		 String nomeBici, modello, proprietario;
		 int i;

		 Bicicletta[] a = new Bicicletta[3];

		 Scanner tastiera=new Scanner(System.in);

		 System.out.println("Ciao Ciao");
		 Bicicletta laMiaBici = new Bicicletta("BMX","Raffone",10,3);
		 Bicicletta biciBrutta = new Bicicletta("MountainBike",1);
		 laMiaBici.stampaStato();
		 biciBrutta.stampaStato();

		 biciBrutta.getNomeProprietario();
		 laMiaBici.aumentaVelocita(20);

		 laMiaBici.stampaStato();
		 
		 
		 for(i=0; i<3; i++){
		 		a[i] = new Bicicletta("MountainBike",1);
		 }
		 for(i=0; i<3; i++){
		 		a[i].stampaStato();
		 }


	}
	*/


}

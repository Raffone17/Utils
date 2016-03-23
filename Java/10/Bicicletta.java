import java.util.Scanner;
import java.lang.reflect.Constructor;
import java.util.Random;

public class Bicicletta implements Vendibile
{
	protected String modello, proprietario;
	protected int marcia, velocita;
	final int num_telaio;
	static int contatore=0;
	float prezzo;
	protected static int VELO_MAX = 60;
	protected static int MAX = 20000;
	final static int MIN = 10000;
	Random rand = new Random();

	public Bicicletta(String modelloP, String proprietario, int velInz, int marciaInz)
	{
		this.proprietario = proprietario;
		modello = modelloP;
		marcia = marciaInz;
		if(velInz>VELO_MAX){
			velocita=VELO_MAX;
		}else{
			velocita = velInz;
		}
		num_telaio = rand.nextInt((MAX - MIN) + 1) + MIN;
		contatore++;

	}

	public Bicicletta(String modelloP, String proprietario, float prezzo)
	{
		
		this(modelloP,proprietario,0,1);
		this.prezzo = prezzo;
		contatore++;


	}

	public void setPrezzo(float prezzo)
	{
		this.prezzo = prezzo;
	}
	public String getModello()
	{

		return modello;

	}

	public String getNomeProprietario()
	{
		if(this.proprietario  != null){
			return this.proprietario;
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

	public static int getContatore()
	{
		return contatore;
	}

	public int getNum_telaio()
	{
		return num_telaio;

	}

	public void aumentaVelocita(int incr)
	{
		velocita += incr;
		if(velocita>VELO_MAX){
			velocita=VELO_MAX;
		}


	}

	public void stampaStato()
	{
		

		if(this.proprietario != null){
			System.out.println("Prorpietario: "+this.proprietario);
		}else{
			proprietario = "Nessun Prorpietario";
		}
		System.out.println("Modello: "+modello);
		System.out.println("Numero telaio: "+num_telaio);
		System.out.println("Marcia: "+marcia);
		System.out.println("Velocita: "+velocita);


	}

	@Override
	public String toString()
	{
		
		return "\nProrpietario: "+this.proprietario+"\nModello: "+modello+"\nNumero telaio: "+num_telaio+
		"\nMarcia: "+marcia+"\nVelocita: "+velocita;

	}


	@Override
	public float getPrezzo()
	{
		return this.prezzo;
	}


	@Override
	public int compareTo(Object obj)
	{
		if(this.prezzo < ((Vendibile)obj).getPrezzo()){
			return -1;
		}else if(this.prezzo > ((Vendibile)obj).getPrezzo()){
			return 1;
		}

		return 0;

	}

	/*@Override
	public boolean equals(Object object2) {
    	return object2 instanceof MyClass && a.equals(((MyClass)object2).a);
	}*/

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

import java.util.Scanner;

public class Ufficio
{
	int dim;
	Impiegati[] impiegato = new Impiegati[dim];

	public Ufficio(Impiegati impiegato[])
	{
		this.dim=impiegato.length;
		this.impiegato = impiegato;


	}
	
	public String getNomeImpiegato(int pos)
	{
		return impiegato[pos].getNome();
	}

	public float getStipendioImpiegato(int pos)
	{
		return impiegato[pos].getStipendio();
	}

	public void stampaUfficio()
	{
		int i;
		for(i=0; i<this.dim; i++){
			System.out.println("****Impiegato n"+(i+1)+": *****");
			System.out.println("Nome e cognome: "+this.impiegato[i].getNome());
			System.out.println("Stipendio: "+this.impiegato[i].getStipendio());
			
		}
		System.out.println("****************************");
	}

	public int cercaImpiegato(String nome)
	{
		int i;
		for(i=0; i<this.dim; i++){
			if(this.impiegato[i].getNome().equals(nome)){
				return i;
			}
		}
		return -1;
	}

	public void incrementaStipendio(int pos,float incremento)
	{
		if(this.impiegato[pos] != null){
			this.impiegato[pos].aumentaStipendio(incremento);
		}
	}

	public void stampaImpiegato(int pos)
	{
		System.out.println("****Impiegato n"+(pos+1)+": *****");
		System.out.println("Nome e cognome: "+this.impiegato[pos].getNome());
		System.out.println("Stipendio: "+this.impiegato[pos].getStipendio());

	}
}
import java.util.Scanner;
import java.util.*;

public class Ufficio
{
	int dim;
	
	List<Impiegati> list = new ArrayList<Impiegati>();


	public Ufficio(List<Impiegati> lista)
	{
		
		this.list = lista;
		this.dim = lista.size();


	}
	
	public String getNomeImpiegato(int pos)
	{
		return this.list.get(pos).getNome();
	}

	public float getStipendioImpiegato(int pos)
	{
		return this.list.get(pos).getStipendio();
	}

	public void stampaUfficio()
	{
		int i=1;
		Iterator<Impiegati> iterator = this.list.iterator();
		while(iterator.hasNext()){

			Impiegati impiegato = iterator.next();

			System.out.println("****Impiegato n"+(i)+": *****");
			System.out.println("Nome e cognome: "+impiegato.getNome());
			System.out.println("Stipendio: "+impiegato.getStipendio());

			i++;
		}
		System.out.println("****************************");
	}

	public int cercaImpiegato(String nome)
	{
		int i=0;
	
		Iterator<Impiegati> iterator = this.list.iterator();
		while(iterator.hasNext()){
			if(iterator.next().getNome().equals(nome)){
				return i;
			}
			i++;
		}
		return -1;
	}

	public void incrementaStipendio(int pos,float incremento)
	{
		if(this.list.get(pos) != null){
			this.list.get(pos).aumentaStipendio(incremento);
		}
	}

	public boolean licenziaImpiegato(String nome)
	{
		int pos = this.cercaImpiegato(nome);
		if(pos != -1){
			this.list.remove(pos);
			return true;
		}
		return false;

	}


	public boolean licenziaImpiegato2(String nome)
	{
		boolean licenziato = false;
		for(Impiegati imp:list)
		{
			if(imp.getNome().equals(nome))
			{
				list.remove(imp);
				licenziato = true;
			}
		}

		return licenziato;

	}

	public void stampaImpiegato(int pos)
	{
		System.out.println("****Impiegato n"+(pos+1)+": *****");
		System.out.println("Nome e cognome: "+this.list.get(pos).getNome());
		System.out.println("Stipendio: "+this.list.get(pos).getStipendio());

	}
}
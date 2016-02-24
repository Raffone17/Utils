import java.util.Scanner;

public class Persona
{
	String nome, cognome;
	int eta;

	public Persona(String nome, String cognome, int eta)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String getName()
	{	

		return this.nome;

	}
	public String getCognome()
	{
		return this.cognome;
		
	}
	public int getEta()
	{
		return this.eta;
		
	}

	public void stampaPersona()
	{
		System.out.println("Nome: "+this.nome);
		System.out.println("Cognome: "+this.cognome);
		System.out.println("Eta: "+this.eta);
		
	}

}
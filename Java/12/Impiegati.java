import java.util.Scanner;

public class Impiegati
{

	String nome_cognome;
	float stipendio;

	public Impiegati(String nome_cognome,float stipendio)
	{
		this.nome_cognome = nome_cognome;
		this.stipendio = stipendio;
		
	}

	public String getNome()
	{
		return this.nome_cognome;
	}
	public float getStipendio()
	{
		return this.stipendio;
	}

	public void aumentaStipendio(float aumento)
	{
		this.stipendio += aumento;

	}

}

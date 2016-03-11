public class Persona
{
	protected String nome, cognome, annoNascita;

	public Persona(String nome,String cognome,String annoNascita)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = annoNascita;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}
	public void setAnnoNascita(String annoNascita)
	{
		this.annoNascita = annoNascita;
	}

	public String getNome()
	{
		return this.nome;
	}
	public String getCognome()
	{
		return this.cognome;
	}
	public String getAnnoNascita()
	{
		return this.annoNascita;
	}

	public String toString()
	{
		return "Nome: "+this.nome+" Cognome: "+this.cognome+" Anno nascita: "+this.annoNascita;
	}

}
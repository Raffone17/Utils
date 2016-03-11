public class SocioEngim extends Persona
{
	protected int numeroTessera, numeroCrediti;

	public SocioEngim(String nome, String cognome, String annoNascita, int numeroTessera)
	{
		super(nome,cognome,annoNascita);
		this.numeroTessera = numeroTessera;
		this.numeroCrediti = 0;
	}

	public int getNumeroTessera()
	{
		return this.numeroTessera;
	}
	public void setNumeroTessera(int numero)
	{
		this.numeroTessera = numero;
	}

	public int getNumeroCrediti()
	{
		return this.numeroCrediti;
	}
	public void setNumeroCrediti(int numero)
	{
		this.numeroCrediti = numero;
	}

	public void addOreLezione(int numero)
	{
		this.numeroCrediti += (5*numero);
	}
	public void addLezioneStandard()
	{
		this.addOreLezione(4);
	}
	public String toString()
	{
		return super.toString()+"\nNumero Tessera: "+this.numeroTessera+" Numero Crediti: "+this.numeroCrediti;
	}
}
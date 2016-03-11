public class SocioPlus extends SocioEngim
{
	protected String indirizzoEmail;


	public SocioPlus(String nome, String cognome, String annoNascita, int numeroTessera)
	{
		super(nome,cognome,annoNascita,numeroTessera);
		this.indirizzoEmail = nome.toLowerCase().concat("@engim.it");
	}

	public void addOreLezione(int numero)
	{
		super.numeroCrediti += (10*numero);
	}
	public String toString()
	{
		return super.toString()+"\nIndirizzo email: "+this.indirizzoEmail;
	}

}
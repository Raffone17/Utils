public class SocioProf extends SocioPremium
{
	private String indirizzoPostale;

	public SocioProf(String nome, String cognome, String annoNascita, int numeroTessera, String indirizzoPostale)
	{
		super(nome,cognome,annoNascita,numeroTessera);
		this.indirizzoPostale = indirizzoPostale;
	} 

	public String getIndirizzoPostale()
	{
		return this.indirizzoPostale;
	}
	public void setIndirizzoPostale(String indirizzo)
	{
		this.indirizzoPostale = indirizzo;
	}
	public String toString()
	{
		return super.toString()+"\nIndirizzo postale: "+this.indirizzoPostale;
	}
}
public class SocioPremium extends SocioPlus
{
	protected float contoDistributore;
	protected int puntiMensa;

	public SocioPremium(String nome, String cognome, String annoNascita, int numeroTessera)
	{
		super(nome,cognome,annoNascita,numeroTessera);
		this.puntiMensa = 0;
	}

	public void addOreLezione(int numero)
	{
		super.numeroCrediti += (10*numero);
		this.puntiMensa += numero;
	}
	public String toString()
	{
		return super.toString()+"\nConto per distributore: "+this.contoDistributore+
		" Punti mensa: "+this.puntiMensa;
	}

}
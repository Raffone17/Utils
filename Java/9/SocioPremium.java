public class SocioPremium extends SocioPlus
{
	protected float contoDistributore;
	protected int puntiMensa;

	public SocioPremium(String nome, String cognome, String annoNascita, int numeroTessera)
	{
		super(nome,cognome,annoNascita,numeroTessera);
		this.puntiMensa = 0;
	}

	public int getPuntiMensa()
	{
		return this.puntiMensa;
	}
	public void setPuntiMensa(int punti)
	{
		this.puntiMensa = punti;
	}
	public float getContoDistributore()
	{
		return this.contoDistributore;
	}
	public void setContoDistributore(float punti)
	{
		this.contoDistributore = punti;
	}

	@Override
	public void addOreLezione(int numero)
	{
		super.addOreLezione(numero);
		this.puntiMensa += numero;
		this.contoDistributore += (0.25 * numero);
	}
	@Override
	public String toString()
	{
		return super.toString()+"\nConto per distributore: "+this.contoDistributore+
		" Punti mensa: "+this.puntiMensa;
	}

}
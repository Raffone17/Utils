public class CollezioneBici
{
	private Bicicletta [] bici;

	public CollezioneBici(Bicicletta [] bici)
	{
		this.bici = bici;
	}

	public void setBici(Bicicletta [] bici)
	{
		this.bici = bici;
	}
	public Bicicletta [] getBici()
	{
		return bici;
	}

	public boolean biciIsElettrica(String nome)
	{
		for(int i=0; i<bici.length; i++)
		{
			if(bici[i]!= null){
				if(bici[i].getNomeProprietario().equals(nome) && bici[i] instanceof BiciElettrica){
					
					return true;
					
				}
			}
		}
		return false;

	}
}
public class BiciElettrica extends Bicicletta
{
	protected int durataBatteria;
	protected int potenza;


	public BiciElettrica(String modelloP, String proprietario, int velInz, int marciaInz, int durata, int potenza)
	{
		super(modelloP,proprietario,velInz,marciaInz);
		this.durataBatteria = durata;
		this.potenza = potenza;
	}
	public BiciElettrica(String modelloP, String proprietario, float prezzo, int durata, int potenza)
	{
		super(modelloP,proprietario,prezzo);
		this.durataBatteria = durata;
		this.potenza = potenza;
	}

	public int getDurataBatteria()
	{
		return this.durataBatteria;
	}
	public int getPotenza()
	{
		return this.potenza;
	}

	public void setDurataBatteria(int durata)
	{
		this.durataBatteria = durata;
	}
	public void setPotenza(int potenza)
	{
		this.potenza = potenza;
	}

	public String toString()
	{
		return super.toString()+"\nPotenza: "+potenza+"\nDurata Batteria: "+durataBatteria;
	}

	// overide stampastato()
	public void stampaStato()
	{
		super.stampaStato();
		System.out.println("Durata batteria: "+this.durataBatteria);
		System.out.println("Potenza: "+this.potenza+" KW");
	}
}
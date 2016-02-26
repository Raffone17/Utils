public class CompactDisc
{
	String anno;
	String titolo, autore;
	String[] canzoni;

	public CompactDisc(String titolo, String autore, String anno, String []canzoni)
	{
		this.titolo = titolo;
		this.autore = autore;
		this.anno = anno;
		this.canzoni = canzoni;
		

	}
	/*public CompactDisc(int dim)
	{
		int i;
		this.dim = dim;

		for(i=0 ; i<dim; i++){
			this.canzoni[i] = "Track"+(i+1);
		}
	}*/

	public void setTitolo(String titolo)
	{
		this.titolo = titolo;

	}
	public void setAutore(String autore)
	{
		this.autore = autore;
	}
	public void setAnno(String anno)
	{
		this.anno = anno;
	}
	public void setTrack(int pos,String track)
	{
		this.canzoni[pos]=track;
	}

	public String getTitolo()
	{
		return this.titolo;
	}
	public String getAutore()
	{
		return this.autore;
	}
	public String getAnno()
	{
		return this.anno;
	}
	public String getTrack(int pos)
	{
		return this.canzoni[pos];
	}

	public void stampAll()
	{
		int i;

		System.out.println("Titolo: "+this.titolo);
		System.out.println("Autore: "+this.autore);
		System.out.println("Anno: "+this.anno);
		for(i=0 ; i<this.canzoni.length; i++){
			System.out.println("Track"+(i+1)+": "+this.canzoni[i]);
		}


	}

	public int cercaTrack(String nome)
	{
		for(int i=0; i<this.canzoni.length; i++){
			if(nome.equals(this.canzoni[i])){
				return i;
			}
		}
		return -1;
	}


}
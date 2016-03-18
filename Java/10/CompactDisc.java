public class CompactDisc implements Vendibile
{
	String anno;
	String titolo, autore;
	String[] canzoni;
	float prezzo;
	int dim;

	public CompactDisc (String titolo, String autore, String anno, String []canzoni)
	{
		this.titolo = titolo;
		this.autore = autore;
		this.anno = anno;
		this.canzoni = canzoni;
		

	}
	public CompactDisc(String titolo, String autore, String anno,int dim,float prezzo)
	{
		this.titolo = titolo;
		this.autore = autore;
		this.anno = anno;
		this.prezzo = prezzo;
		this.dim = dim;
		

		/*for(i=0 ; i<=dim; i++){
			this.canzoni[i] = "Track"+(i+1);
		}*/
	}

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
	public void setPrezzo(float prezzo)
	{
		this.prezzo = prezzo;
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

	@Override
	public float getPrezzo()
	{
		return this.prezzo;
	}
	@Override
	public String toString()
	{
		return "Titolo: "+this.titolo+"\nAutore: "+this.autore+"\nAnno: "+this.anno+
		"\nBrani: "+this.dim;
	}

	@Override
	public int compareTo(Object obj)
	{
		if(this.prezzo < ((CompactDisc)obj).getPrezzo()){
			return -1;
		}else if(this.prezzo > ((CompactDisc)obj).getPrezzo()){
			return 1;
		}

		return 0;

	}


}
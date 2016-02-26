public class Catalogo
{
	String nome;
	CompactDisc[] catalogo;

	public Catalogo(CompactDisc[] catalogo)
	{
		this.catalogo=catalogo;
	}

	public void setCatalogo(CompactDisc[] catalogo)
	{
		this.catalogo=catalogo;
	}
	public CompactDisc[] getCatalogo()
	{
		return this.catalogo;
	}

	public void stampAll()
	{
	
		for(int i=0; i<this.catalogo.length; i++){
			if(this.catalogo[i] != null){
			this.catalogo[i].stampAll();
			System.out.println("***********************");	
		}
		}
	}

	public int numeroCdAutore(String nome)
	{
		int count=0;
		for(int i=0; i<this.catalogo.length; i++){
			if(this.catalogo[i] != null){
				if(nome.equals(this.catalogo[i].getAutore())){
					count++;
				}
			
			}
		}
		return count;

	}

	public int numeroCdAnno(String anno)
	{
		int count=0;
		for(int i=0; i<this.catalogo.length; i++){
			if(this.catalogo[i] != null){
				if(anno.equals(this.catalogo[i].getAnno())){
					count++;
				}
			
			}
		}
		return count;
	}

	public int trovaAlbum(String nome)
	{
		for(int i=0; i<this.catalogo.length; i++){
			if(this.catalogo[i] != null){
				if(nome.equals(this.catalogo[i].getTitolo())){
					this.catalogo[i].stampAll();
					return 1;
				}
			
			}
		}
		return -1;
	}


	public void elencoCdAutore(String nome)
	{
		
		for(int i=0; i<this.catalogo.length; i++){
			if(this.catalogo[i] != null){
				if(nome.equals(this.catalogo[i].getAutore())){
					this.catalogo[i].stampAll();
				}
			
			}
		}
		

	}

}
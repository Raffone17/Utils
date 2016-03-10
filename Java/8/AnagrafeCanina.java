
public class AnagrafeCanina {

	Coppia [] coppie;
	
	public AnagrafeCanina(int i){
		this.coppie = new Coppia[i];
	}
	
	public AnagrafeCanina(Coppia[] coppie){
		this.coppie = coppie;
	}
	public int contaNumeroCoppie()
	{
		return this.coppie.length;
	}
	
	
	/*methods here:*/
	public void contaNumeroCaniConPadrone(String nomePadrone){
		
		int count = 0;
		
		for (int i=0; i<coppie.length; i++){
			if(coppie[i].getPersona().getNome() == nomePadrone){
				count ++;
				/****DA FINIRE****/
			} 
		}
		if (count != 0) {
		System.out.println(nomePadrone + " ha " + count + " cani");
		} else {
			System.out.println(nomePadrone + " non esiste");
		}
	}
	
	public String ritornaPadrone(int id){
		for (int i=0; i<coppie.length; i++){
			if(coppie[i].getCane().getId() == id){
				return coppie[i].getPersona().getNome();		
			}
		}
				return "non esiste questo id!";
	}
	public boolean cercaCanePadrone(int id){
		for (int i=0; i<coppie.length; i++){
			if(coppie[i].getCane().getId() == id){
				return true;		
			}
		}
		return false;
	}

	public void stampaNomeCanePadroneId(int id){
		for (int i=0; i<coppie.length; i++){
			if(coppie[i].getCane().getId() == id){
					System.out.println(coppie[i].getCane().getNome()+" Prorpietario: "+coppie[i].getPersona().getNome());

			}
		}
		
	}

	public void stampaNomeCanePadrone(){
		for (int i=0; i<coppie.length; i++){
		System.out.println(coppie[i].getPersona().getNome());
		System.out.println(coppie[i].getCane().getNome());
		}
	}
	
	public void stampaNomeCompletoCani(){
		for (int i=0; i<coppie.length; i++){
		System.out.println(coppie[i].getPersona().getCognome());
		System.out.println(coppie[i].getCane().getNome());
		}
	}
	
	public void stampaNomeCanePadrone(int pos){
		
			if(pos <= coppie.length){
			System.out.println(coppie[pos].getPersona().getNome());
			System.out.println(coppie[pos].getCane().getNome());
			} else {
				System.out.println("Non ci sono cani né padroni in questa posizione");
			}
	}
	
	
	
	
}

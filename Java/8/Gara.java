public class Gara
{
	private AnagrafeCanina lista;
	private int[] classifica;
	private static int count=0;

	public Gara (AnagrafeCanina lista)
	{
		this.lista = lista;
		this.classifica = new int[this.lista.contaNumeroCoppie()];
	}

	boolean addInClassifica(int idCane)
	{
		if(lista.cercaCanePadrone(idCane)&&!(this.cercaInClassifica(idCane))){
			classifica[count]=idCane;
			count++;
			return true;
		}else{
			return false;
		}

	}

	private boolean cercaInClassifica(int idCane)
	{
		for(int i=0; i<classifica.length; i++){
			if(classifica[i]==idCane){
				return true;
			}
		}
		return false;
	}

	public void stampaClassifica() 
	{
		for(int i=0; i<classifica.length; i++){
			System.out.println("Posizione "+(i+1)+": ");
			lista.stampaNomeCanePadroneId(classifica[i]);
		}
	}

}
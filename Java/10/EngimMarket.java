import java.util.Arrays;
import java.util.*;

public class EngimMarket
{
	private final static int MAX=10;

	private Vendibile[] lista;
	private Vendibile[] tmp;
	private float incasso;
	private int pos;
	private int biciVendute;

	public EngimMarket()
	{
		this.incasso=0;
		this.pos=0;
		this.biciVendute=0;
		lista = new Vendibile[MAX];
		
	}

	public Vendibile[] getLista()
	{
		return this.lista;
	}
	public void	setLista(Vendibile[] lista)
	{
		this.lista = lista;
	} 

	public void addVenduto(Vendibile obj)
	{
		int i;

		if(obj instanceof Scontabile ){
			this.incasso+=((Scontabile)obj).getPrezzoScontato();
		}else{
			this.incasso+=obj.getPrezzo();
		}

		if(obj instanceof Bicicletta){
			biciVendute++;
		}

		if(pos<lista.length){
			this.lista[pos] = obj;
			pos++;
		}else{
			tmp = new Vendibile[lista.length*2];
			for( i=0; i<lista.length; i++){
				tmp[i]=lista[i];
			}
			
			lista = tmp;

			lista[pos]=obj;
			pos++;

		}
		
		
	}

	public float getIncasso()
	{
		return this.incasso;
	}
	public int biciVendute()
	{
		return biciVendute;
	}
	public void stampaVenduti()
	{
		System.out.println("****** Lista Venduti EngimMarket: *****");
		for(int i=0; i<pos; i++){
		
				System.out.println(this.lista[i]);
				System.out.println("\n-----------");
		}
		

	}

	@Override
	public String toString()
	{

		return "\nNumero oggetti venduti: "+pos+"\nIncasso totale: "+incasso;

	}

	public void prezzoPiuAlto()
	{
		tmp = new Vendibile[pos];
		for(int i=0; i<pos; i++){

				tmp[i]=lista[i];
			}

		Arrays.sort(tmp, Collections.reverseOrder());


		System.out.println(tmp[0]+"\nAl prezzo di: "+tmp[0].getPrezzo());

	}
}
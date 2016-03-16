public class EngimMarket
{
	private Vendibile[] lista;
	static float incasso = 0;

	public EngimMarket(Vendibile[] lista)
	{
		this.lista = lista;
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
		this.incasso+=obj.getPrezzo();

	}
	public float getIncasso()
	{
		return this.incasso;
	}
}
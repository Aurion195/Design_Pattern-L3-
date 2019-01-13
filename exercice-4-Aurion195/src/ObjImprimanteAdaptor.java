
public class ObjImprimanteAdaptor implements Connectable
{
	Imprimante i ;

	public ObjImprimanteAdaptor(String name)
	{
		this.i = new Imprimante() ;
		this.i.setName(name);
	}
	
	@Override
	public void demarer() 
	{
		System.out.println("L'imprimante "+this.getName()+" imprime !!");
	}

	@Override
	public void arreter() 
	{
		System.out.println("L'imprimante"+this.getName()+" n'a plus de papaier :(");
	}

	@Override
	public String getName() 
	{
		return this.i.getName() ;
	}
	
	
}

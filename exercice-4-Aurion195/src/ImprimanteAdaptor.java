
public class ImprimanteAdaptor extends Imprimante
{
	private String name ;

	public ImprimanteAdaptor()
	{
		super();
		this.name = "HP" ;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	
}

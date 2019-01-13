
public class Imprimante implements Connectable
{
	private String name ;
	private String type ;
	
	public Imprimante() 
	{
		super();
		this.name = "HP 2018";
		this.type = "PS 2018" ;
	}

	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * @return the type
	 */
	public String getType() 
	{
		return type;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) 
	{
		this.type = type;
	}

	@Override
	public void demarer() 
	{
		System.out.println("L'imprimante "+this.name+" imprime !!");
	}

	@Override
	public void arreter() 
	{
		System.out.println("L'imprimante"+this.name+" n'a plus de papaier :(");
	}
	
	
	
}

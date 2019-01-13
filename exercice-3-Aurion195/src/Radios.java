
public class Radios implements Connectable
{
	private String name ;
	private String type ;
	private boolean demarer ;
	
	public Radios() 
	{
		super();
		this.name = "Radio";
		this.type = "XBF03";
	}

	public void demarer()
	{
		this.demarer = false ;
		System.out.println("La radio "+this.name+" se met en marche");
	}
	
	public void arreter()
	{
		this.demarer = true ;
		System.out.println("La radio "+this.name+" s'arrète !");
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
}


public class Aspirateur implements Connectable 
{
	private String name ;
	private String type ;
	private boolean de ;
	
	public Aspirateur()
	{
		super();
		this.name = "DAYZON";
		this.type = "Z400";
		this.de = false ;
	}

	public void demarer()
	{
		this.de = false ;
		System.out.println("L'aspirateur "+this.name+" se met en marche");
	}
	
	public void arreter()
	{
		this.de = true ;
		System.out.println("L'aspirateur "+this.name+" s'arrète !");
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

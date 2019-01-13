
public class Aspirateur 
{
	private String name ;
	private String type ;

	public Aspirateur()
	{
		super();
		this.name = "DAYZON";
		this.type = "Z400";
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

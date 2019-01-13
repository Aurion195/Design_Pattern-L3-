
public class Cafetiere 
{
	private String name ;
	private String type ;
	
	public Cafetiere() 
	{
		super();
		this.name = "Cafet";
		this.type = "S3000";
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

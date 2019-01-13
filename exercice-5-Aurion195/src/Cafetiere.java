import java.util.HashMap;

public class Cafetiere implements Connectable
{
	private String name ;
	private String type ;
	private int power = 20 ;
	private int time = 50 ;
	private HashMap<Integer, String> modeConsomation = new HashMap<Integer, String>();
	private int modeUtilisation = 0 ;
	
	public Cafetiere() 
	{
		super();
		this.name = "Cafet";
		this.type = "S3000";
		this.modeConsomation.put(0, "10") ;
		this.modeConsomation.put(1, "30") ;
		this.modeConsomation.put(2, "45") ;
	}
	
	@Override
	public void demarer()
	{
		System.out.println("La cafetiere "+this.name+" se met en marche");
	}
	
	@Override
	public void arreter()
	{
		System.out.println("La cafetiere "+this.name+" s'arrète !");
	}
	
	@Override
	public void displayModeConsomation()
	{
		System.out.println("La cafetiere est en mode : "+this.modeUtilisation+" elle consomme donc "+this.modeConsomation.get(this.modeUtilisation)+" % d'énergie !");
	}
	
	@Override
	public int getPower()
	{
		return this.power ;
	}
	
	@Override
	public void setPower(int power)
	{
		this.power = power ;
	}
	
	@Override
	public int getTime()
	{
		return this.time ;
	}
	
	@Override
	public void setTime(int time)
	{
		this.time = time ;
	}
	
	@Override
	public void setMode(int mode)
	{
		this.modeUtilisation = mode ;
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

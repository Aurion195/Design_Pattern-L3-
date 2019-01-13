import java.util.HashMap;

public class Radios implements Connectable
{
	private String name ;
	private String type ;
	private int power = 25 ;
	private int time = 50 ;
	private HashMap<Integer, String> modeConsomation = new HashMap<Integer, String>();
	private int modeUtilisation = 0;
	
	public Radios() 
	{
		super();
		this.name = "Radio";
		this.type = "XBF03";
		this.modeConsomation.put(0, "5") ;
		this.modeConsomation.put(1, "10") ;
		this.modeConsomation.put(2, "20") ;
	}

	
	@Override
	public void demarer()
	{
		System.out.println("La radio "+this.name+" se met en marche");
	}
	
	@Override
	public void arreter()
	{
		System.out.println("La radio "+this.name+" s'arrète !");
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
	
	@Override
	public void displayModeConsomation()
	{
		System.out.println("La radio est en mode : "+this.modeUtilisation+" elle consomme donc "+this.modeConsomation.get(modeUtilisation)+" % d'énergie !");
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

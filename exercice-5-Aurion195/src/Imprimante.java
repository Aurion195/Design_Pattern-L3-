import java.util.HashMap;

public class Imprimante implements Connectable
{
	private String name ;
	private String type ;
	private int power = 20 ;
	private int time = 10 ;
	private HashMap<Integer, String> modeConsomation = new HashMap<Integer, String>();
	private int modeUtilisation = 0;
	
	public Imprimante() 
	{
		super();
		this.name = "HP 2018";
		this.type = "PS 2018" ;
		this.modeConsomation.put(0, "20") ;
		this.modeConsomation.put(1, "50") ;
		this.modeConsomation.put(2, "65") ;
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
		System.out.println("L'imprimante est en mode : "+this.modeUtilisation+" elle consomme donc "+this.modeConsomation.get(this.modeUtilisation)+" % d'énergie !");
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

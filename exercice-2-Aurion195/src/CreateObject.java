
public class CreateObject 
{
	public static Class obj ;
	
	public static Object creatObject(String name)
	{
		try {
			obj = Class.forName(name) ;
		} catch(Exception e)
		{
			obj = null ;
			System.out.println("La classe n'existe pas");
		}
		
		return obj ;
	}

	public static Object getClasse()
	{
		try {
			obj.newInstance() ;
		} catch(Exception e)
		{
			System.out.println("La classe n'existe pas !");
			return null ;
		}
		
		return obj ;
	}
}

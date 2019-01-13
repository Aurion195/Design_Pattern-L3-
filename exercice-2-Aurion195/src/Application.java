import java.util.Vector;

public class Application 
{
	Vector<Object> myVec = new Vector<Object>() ;
	
	public void addConnectable()
	{
		String x = "" ;
		
		do {
			x = SaisieEntier.saisieEntier() ;
			if(CreateObject.creatObject(x) != null) myVec.addElement(CreateObject.getClasse()) ;
			this.display();
		} while(x != "") ;
	}

	private void display() 
	{
		for(int i = 0 ; i < myVec.size(); i++)
		{
			try {
				System.out.println(i+" -	"+myVec.elementAt(i).toString());
			} catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}

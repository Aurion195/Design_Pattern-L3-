import java.util.Vector;

public class Controlleur 
{
	private Vector<Connectable> myVec = new Vector<Connectable>() ;
	
	public void ajouter(Connectable c)
	{
		this.myVec.addElement(c);

	}
	
	public void display()
	{
		System.out.println("Voici la liste des objets connectable qui sont en marche !");
		
		for(int i = 0 ; i < this.myVec.size() ; i++)
		{
			this.myVec.elementAt(i).demarer();
		}
	}
	
	public void enlever(Connectable c)
	{
		System.out.println("L'objet : "+c.getName()+" s'arrête !");
		this.myVec.elementAt(this.myVec.lastIndexOf(c)).arreter();
		this.myVec.remove(c) ;
	}
}

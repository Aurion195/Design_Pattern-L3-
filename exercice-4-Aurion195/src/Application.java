import java.util.Scanner;
import java.util.Vector;

public class Application 
{
	Vector<Connectable> myVec = new Vector<Connectable>() ;
	Controlleur c = new Controlleur() ;

	public void addObject()
	{
		this.myVec.addElement(new Aspirateur()) ;
		this.myVec.addElement(new Cafetiere()) ;
		this.myVec.addElement(new Radios()) ;
		this.myVec.addElement(new Imprimante()) ;
		this.myVec.addElement(new ObjImprimanteAdaptor("HP 2020"));

		this.display();
	}

	private void display() 
	{
		String c = "" ;

		do {
			for(int i = 0 ; i < myVec.size(); i++)
			{
				try {
					System.out.println(i+" -	"+myVec.elementAt(i).getName());
					System.out.println("Voulez-vous la démarer ? ");

					Scanner sc = new Scanner(System.in) ;
					c = sc.nextLine() ;

					if(c.equals("y") || c.equals("Y"))
					{
						this.c.ajouter(this.myVec.elementAt(i));
					}
					
					
				} catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			this.c.display();
		} while(!c.equals(" ")) ;
	}
}

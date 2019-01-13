import java.util.Scanner;
import java.util.Vector;

public class Application 
{
	Vector<Connectable> myVec = new Vector<Connectable>() ;
	Controlleur c = new Controlleur() ;
	CalculStat calPercent = new CalculPourcent() ;
	private int puissance ;
	private int time ;
	
	public Application(int puissance, int time)
	{
		this.puissance = puissance ;
		this.time = time ;
	}
	
	public void addObject()
	{
		this.myVec.addElement(new Aspirateur()) ;
		this.myVec.addElement(new Cafetiere()) ;
		this.myVec.addElement(new Radios()) ;
		this.myVec.addElement(new Imprimante()) ;

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
					
					
				} 
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
				System.out.println("Pourcentate puissance utilié -> "+this.calPercent.calculPourcent(this.myVec.elementAt(i).getPower(), this.puissance));
				System.out.println("Pourcentage temps utilisé -> " +this.calPercent.calculPourcent(this.myVec.elementAt(i).getTime(), this.time));
				this.myVec.elementAt(i).displayModeConsomation();
			}
			
			this.c.display();
			
			
		} while(!c.equals(" ")) ;
	}
}

import java.util.Scanner;

public class SaisieEntier 
{
	public static String saisieEntier()
	{
		Scanner sc = new Scanner(System.in) ;
		String s = "" ;
		
		System.out.println("Entrer le nom d'une classe");
		s = sc.nextLine() ;
		
		return s ;
	}
}

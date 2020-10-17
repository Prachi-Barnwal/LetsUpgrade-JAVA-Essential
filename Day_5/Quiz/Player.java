import java.util.Scanner;

public class Player {
	
	String name;
	int score;
	Scanner sc=new Scanner(System.in);
	
	
	public void detail()
	{
		System.out.println("Enter Your Name :");
		name=sc.next();
	}
	

}

import java.util.Scanner;

public class Odd {
		
	Scanner sc=new Scanner(System.in);
	public int n;
	
	public void getNumber()
	{
		
			System.out.println("Enter a Number");
			n=sc.nextInt();
		
	}
		
	public void displayNumber()
	{
		if(n%2!=0)
		{
			System.out.println(n);
		}
	}

}
	
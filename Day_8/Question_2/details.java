import java.util.Scanner;

public class details {
	
	Scanner sc=new Scanner(System.in);
	int age;
	double salary;
	String name, proffession;
	
	public void getdetails()
	{
		System.out.println("Enter Your Name, proffession, Age, Salary :: ");
		name=sc.next();
		proffession=sc.next();
		age=sc.nextInt();
		salary=sc.nextDouble();
	}
	
	public void displaydetails()
	{
		System.out.println(name+" "+proffession+" "+age+" "+salary);
	}

}

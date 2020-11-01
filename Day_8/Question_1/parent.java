
import java.util.Scanner;
public class parent {
	
	Scanner sc=new Scanner(System.in);
	int age;
	double salary;
	String name, designation;
	
	public void getdetails()
	{
		System.out.println("Enter Your Name, Age, Salary, Designation :: ");
		name=sc.next();
		age=sc.nextInt();
		salary=sc.nextDouble();
		designation=sc.next();
	}
	
	public void displaydetails()
	{
		System.out.println(name+" "+age+" "+salary+" "+designation);
	}

}
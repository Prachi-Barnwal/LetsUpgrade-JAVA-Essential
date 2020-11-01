import java.util.Scanner;

public class employee {
	
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	
	public void getdetail()
	{
		System.out.println("Enter Employee Name:");
		name=sc.next();
		System.out.println("Enter Employee Id:");
		id=sc.nextInt();
	}
	
	public void printdetail()
	{
		System.out.println("Employee name is " +name+" "+ "and ID is" +id);
	}

}

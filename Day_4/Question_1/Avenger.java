import java.util.Scanner;

public class Avenger {
	
	String name,power,weapon,planet;
	int age;
	
	Scanner sc=new Scanner(System.in);
	
	public void getDetails()
	{
	
		System.out.println("Enter Avenger Details: ");
		System.out.println("Enter Avenger Name :- ");
		name = sc.next();
		System.out.println("Enter Avenger Age :- ");
		age = sc.nextInt();
		System.out.println("Enter Avenger Power :- ");
		power = sc.next();
		System.out.println("Enter Avenger Weapon :- ");
		weapon = sc.next();
		System.out.println("Enter Avenger Planet :- ");
		planet = sc.next();

	}
	
	public void displayDetails()
	{
	
		System.out.println("Avenger Details are: ");
		System.out.println("Avenger Name is :- "+ name);
		System.out.println("Avenger Age is :- "+ age);
		System.out.println("Avenger Power is :- "+ power);
		System.out.println("Avenger Weapon is :- "+ weapon);
		System.out.println("Avenger Planet is :- "+ planet);

	}

}

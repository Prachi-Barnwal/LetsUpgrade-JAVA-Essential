import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;		
		int d, m, y, age;
		float sal, ansal, tax;
				
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter the Name :- ");
		name = sc.next();
		System.out.println("Enter Dtae of Birth :- ");
		d = sc.nextInt();
		System.out.println("Enter Month of Birth :- ");
		m = sc.nextInt();
		System.out.println("Enter Year of Birth :- ");
		y = sc.nextInt();
		System.out.println("Enter Monthly Salary :- ");
		sal = sc.nextInt();
		
		ansal = sal*12;
		age = 2020-y;
		
		if(ansal>500000) {
			tax=(ansal/100)*20;
		}
		else if(ansal>400000 && ansal<=500000) {
			tax=(ansal/100)*15;
		}
		else if(ansal>300000 && ansal<=400000) {
			tax=(ansal/100)*10;
		}
		else if(ansal>200000 && ansal<=300000) {
			tax=(ansal/100)*5;
		}
		else {
			tax=0;
		}
		
		System.out.println("The Name is :- "+ name);
		System.out.println("The Age is :- "+ age);
		System.out.println("The Annual Salary is :- "+ ansal);
		System.out.println("The Tax Amount :- "+ tax);

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m1, m2, m3, m4, m5;
		float per;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First sublect Marks :- ");
		m1 = sc.nextInt();
		System.out.println("Enter First sublect Marks :- ");
		m2 = sc.nextInt();
		System.out.println("Enter First sublect Marks :- ");
		m3 = sc.nextInt();
		System.out.println("Enter First sublect Marks :- ");
		m4 = sc.nextInt();
		System.out.println("Enter First sublect Marks :- ");
		m5 = sc.nextInt();
		
		per = (m1 + m2 + m3 + m4 + m5)/5;
		
		if(per>=80) {
			System.out.println("You have got A grade with "+ per +" Percent");
		}
		else if(per>=60 && per<80) {
			System.out.println("You have got B grade with "+ per +" Percent");
		}
		else if(per>=40 && per<60) {
			System.out.println("You have got C grade with "+ per +" Percent");
		}
		else {
			System.out.println("You are FAIL with "+ per +" Percent");
		}

	}

}

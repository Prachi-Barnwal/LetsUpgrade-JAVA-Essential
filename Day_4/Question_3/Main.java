import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		Scanner sc=new Scanner(System.in);
		Sum[] arr= new Sum[5];
		
		for(int i=0;i<5;i++)
        {
            arr[i]=new Sum();
            arr[i].getnum();
        }

        for(int i=0;i<5;i++)
        {
        	s=s+arr[i].n;
        }
        System.out.println("Sum of all the elements of an array: " + s);
	}

}

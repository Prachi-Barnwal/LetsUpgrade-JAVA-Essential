import java.util.Scanner;

public class Question {
	
	Scanner sc=new Scanner(System.in);
	String que,op1,op2,op3,op4,op5; 
	int uans,cans;
	
	public boolean askquestion()
	{
		System.out.println(que);
        System.out.println("1. "+op1);
        System.out.println("2. "+op2);
        System.out.println("3. "+op3);
        System.out.println("4. "+op4);
        System.out.println("please choose an option");
        uans=sc.nextInt();
        if(uans==cans){
            return true;
        }
       return false;
	}

}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee[] arr=new employee[3];
		int i;
		
		for(i=0;i<3;i++)
			arr[i]=new employee();
		
		for(i=0;i<3;i++)
		{
			System.out.println("Enter details of "+ (i+1) +" Employee");
		    arr[i].getdetail();
		}
		
		System.out.println("Details of Employees");
		for(i=0;i<3;i++)
		{
			System.out.println((i+1) +" Employee detail");
		    arr[i].printdetail();
		}
		
	}

}
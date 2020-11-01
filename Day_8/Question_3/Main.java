
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee[] arr=new employee[3];
		
		arr[0]=new employee("preet", 642627);
		arr[1]=new employee("vinet", 573242);
		arr[2]=new employee("Rupa", 218767);
		
		System.out.println("Employee detail in arr 1:");
		arr[0].printdetail();
		System.out.println("Employee detail in arr 2:");
		arr[1].printdetail();
		System.out.println("Employee detail in arr 3:");
		arr[2].printdetail();

	}

}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Odd odd[]= new Odd[5];
		
		for(int i=0;i<5;i++)
        {
            odd[i]=new Odd();
            odd[i].getNumber();
        }

		System.out.println("All the ODD Numbers are:");
        for(int i=0;i<5;i++)
        {
            odd[i].displayNumber();
        }

	}

}

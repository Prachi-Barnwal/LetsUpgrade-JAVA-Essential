
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avenger avenger[]= new Avenger[5];
		
		for(int i=0;i<5;i++)
		{
			avenger[i]=new Avenger();
		}
		
		for(int i=0;i<5;i++)
		{
			avenger[i].getDetails();
		}
		
		for(int i=0;i<5;i++)
		{
			avenger[i].displayDetails();
		}

	}

}

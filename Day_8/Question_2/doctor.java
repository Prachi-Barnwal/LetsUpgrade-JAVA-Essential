
public class doctor extends details{
	
	public void checkpatients()
	{
		
		String name, disease, medicine;
		
		System.out.println("Enter paitents Name:");
		name=sc.next();
		System.out.println("Enter patients disease");
		disease=sc.next();
		System.out.println("Enter patients medicine");
		medicine=sc.next();
		
		System.out.println(name+" "+disease+" "+medicine);
		
	}

}

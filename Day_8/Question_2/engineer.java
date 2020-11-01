
public class engineer extends details{
	
	public void construction()
	{
		
		double cost;
		String name, c;
				
		System.out.println("Enter Project Name:");
		name=sc.next();
		System.out.println("Enter Project Cost:");
		cost=sc.nextDouble();
		System.out.println("Is your Project is Approved? y for yes and n for no:");
		c=sc.next();
		System.out.println(name+" "+cost);
		
		
		if(c=="y")
			System.out.println("Construction is possible");
		else
			System.out.println("Construction is not possible");
		
		
	}

}
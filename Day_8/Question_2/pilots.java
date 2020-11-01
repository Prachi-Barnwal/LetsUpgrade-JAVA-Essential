
public class pilots extends details{
	
	public void takeoff()
	{
		
		int feet, rpm;
				
		System.out.println("Takeoff below Feet:");
		feet=sc.nextInt();
		System.out.println("Throttle RPM:");
		rpm=sc.nextInt();
		
		if(feet>3000 && rpm>1600||rpm<=1700)
			System.out.println("You are Safe to Takeoff.");
		else
			System.out.println("Please Check RPM and Feet");
		
		
	}

}
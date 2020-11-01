
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		doctor d=new doctor();
		d.getdetails();
		d.displaydetails();
		d.checkpatients();
		
		pilots p=new pilots();
		p.getdetails();
		p.displaydetails();
		p.takeoff();
		
		engineer e=new engineer();
		e.getdetails();
		e.displaydetails();
		e.construction();
		
	}
}
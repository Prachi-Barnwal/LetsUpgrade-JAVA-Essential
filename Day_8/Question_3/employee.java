
public class employee {
	
	int id;
	String name;
	
	employee (String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public void printdetail()
	{
		System.out.println("Employee name is " +name+" "+ "and ID is" +id);
	}

}

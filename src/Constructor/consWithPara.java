package Constructor;

public class consWithPara {
	
	

	public static void main(String[] args) 
	{
		consWithPara cp = new consWithPara();
		cp.info("Ramesh", 121);
		consWithPara cp2 = new consWithPara();
		cp2.info2("Pune");
	}

	
	public void info(String name, int flatno )
	{		
		System.out.println("Name is " +name);

		System.out.println("flat number is " +flatno);

	}
		
	public void info2(String address)
	{
		System.out.println("Address is " +address);

	}
	
}
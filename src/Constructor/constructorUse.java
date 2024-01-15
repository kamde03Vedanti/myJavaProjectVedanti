package Constructor;

// Default Constructor..
public class constructorUse {
	
	int a=10;
	int b=60;
	int c=50;
	int sum;
	
	public void addition()    // Non static method
	{
		sum=a+b+c;
		System.out.println("These is by default constructor");
		System.out.println(" ");
		System.out.println("Addition is " +sum);
	}
	
	public static void main(String[] args)
	{
		constructorUse cu = new constructorUse(); //By-default Constructor
		cu.addition();
		
		cu.substraction(25);
		
		
	}

	public void substraction(int x)  // Non static with single  parameter
	{
		a=x;
		System.out.println("constructor with single parameter");
		System.out.println(" The value of a is " +x);
		
	}
	
	public constructorUse()
	{
		
	}
	
}

 
	
		
		
	
	
		
	


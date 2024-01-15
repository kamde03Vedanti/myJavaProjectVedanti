package Constructor;

public class Demo {

	int a;
	int b;
	int c;
	
	public Demo()
	{
		a=300;
		b=400;
		c=500;
	}
		
	public static void main(String[] args)
	{
		Demo obj = new Demo();
		obj.addition();
		obj.substraction();
		obj.average();
 
	}
	public void addition()
	{
		int sum = a+b+c;
		System.out.println("Sum of variable is "+sum);
	}
	public void substraction()
	{
		int sub= b-a;
		System.out.println("Sub of variable is " +sub);
		
	}
	
	public void average()
	{
		int avg = (a+b+c)/3;
		System.out.println("Average of variable is " +avg);
	}
}

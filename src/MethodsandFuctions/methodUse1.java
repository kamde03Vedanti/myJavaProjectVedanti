package MethodsandFuctions;

public class methodUse1 {

	public static void main(String[] args) 
	{
		methodUse1 m1 = new methodUse1();
		m1.a();
		m1.c(120, 17, "Ind");
		b();
		d(101, 442236,"Vasundara");
		d(140, 776663,"Seven Star");
		
		
		
	}
	
	public void a()
	{
		System.out.println("This is non static method without parameter");
		System.out.println(" ");
	}
	public static void b()
	{
		System.out.println("This is static method with parameter");
		System.out.println(" ");
	}
	public void c(int run, int over, String team)
	{
	
		System.out.println("Team is " +team);
	    System.out.println("Total run is " +run);
	    System.out.println("Remaining over is " +over);
	    System.out.println(" ");
	    System.out.println("***************************");
	    System.out.println(" ");
	}
	    
	public static void d(int flatno, int pincode, String flatname)
	{
	
		System.out.println("My flat number is " +flatno);
		System.out.println("Pin code is " +pincode);
		System.out.println("My flat name is " +flatname);
		
	}
	
}
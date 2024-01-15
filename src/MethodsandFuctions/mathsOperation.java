package MethodsandFuctions;

public class mathsOperation {

	public static void main(String[] args) 
	{
     mathsOperation mo = new mathsOperation();
     mo.addition(); //calling non static method without parameter
     mo.subtraction(230, 120);
     mo.subtraction(59, 69);
		
	}
	public void addition()               //Method without parameter
	{
		int a=20;
		int b=80;
		int sum=(a+b);
		System.out.println("These is without parameter method");
		System.out.println("Addition is " +sum);
		System.out.println("********************");
		
		
	}
	
	public void subtraction(int a, int b)  //Method with parameter
	
	{
		int sub=(a-b);
		System.out.println("These is with parameter method");
		System.out.println("Substraction is " +sub);
		System.out.println("**********************");
	 
		
	 	
	}
     
}

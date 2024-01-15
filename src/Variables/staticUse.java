package Variables;

public class staticUse {
	
	static int x=10; // static global variable
	int y=50;		// non static global variable
    int mul= x*y;
	public static void main(String[] args) 
	{
		staticUse su = new staticUse();
		System.out.println("Value of y is " +su.y);
		
		System.out.println("Value of x is " +x);
		
		System.out.println("Multiplication is " +su.mul);
		
		demo1 d1 = new demo1();
		System.out.println("Value of b is " +d1.b);   // calling non static global variable from another class
		
		System.out.println("Value of a is " +demo1.a);  // calling static global variable from another class
		
		System.out.println("Sub of value is " +d1.sub);
	   su.add();
	}
	
	public void add()
	{
		int z=60;
		int y=50;
		int sum=z+x;
		System.out.println("Sum is " +sum );
	}

}

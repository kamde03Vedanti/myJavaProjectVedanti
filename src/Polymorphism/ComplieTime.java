package Polymorphism;

public class ComplieTime {
	public static void main(String[] args) 
	{
		ComplieTime ct = new ComplieTime();
		ct.calculate();
		ct.calculate(26, 38);
		ct.calculate(25.5F, 15, 21.8F);
	}

	public void calculate()
	{
		System.out.println("These is calculate method with no arguments ");
	}
	public void calculate(int len, int b)
	{
		System.out.println("These is calculate method with two arguments ");

		System.out.println("Calculate area is " +len*b);
	}
	
	public void calculate(float l , int b, float h)
	{
		System.out.println("These is calculate method with three arguments ");

		System.out.println("Calculate area is " +l*b*h );
	}
}

package Abstract;

public class Concrete_Class extends Example  {

	public static void main(String[] args)
	{
		Concrete_Class cc = new Concrete_Class();
		cc.rectangle(20,52);
		cc.triangle(15,25,30);
		cc.test();
		cc.demo();

	}

	@Override
	public void rectangle(int l, int b) 
	{
		int mul = l*b;
		System.out.println("This is complete method in concrete class");
		System.out.println(" Area of rectangle is " +mul);
		
	}

	@Override
	public void triangle(int l, int b, int h)
	{
		int mul= l*b*h;
		System.out.println("Area of Triangle is " +mul);
	}
	public void test()
	{
		System.out.println("These is complete method of concrete class");
	}
}

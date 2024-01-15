package Constructor;

public class Sample1 {
	int sum;
	int sum1;
    int a=99;

	public static void main(String[] args) 
	{
		Sample1 s1 = new Sample1();
		s1.addition1();
	}
	
	public void addition1() // non static method without parameter
	{  
		int x=1;
		int y=2;
		sum=x+y+a;
		sum1=y+a;
		
		System.out.println(" Addition is " +sum);
		System.out.println(" Addition is " +sum1);
	}

}	



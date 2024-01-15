package Variables;

public class variableType 
{
	//global variables
	int a=90;
	int b=99;
	
	public static void main(String[] args) 
	{
		variableType var = new variableType();
		var.sum();
		var.mul();

	}
	
	public void sum()
	{
		//Local Variables
		int x=30;
		int y=40;
		int sum=x+a;
		int sub=y-a;
		System.out.println("Sum is " +sum);
		System.out.println("Sub is " +sub);
	}
	
	public void mul()
	{
		int y=12;
		int mul= y*b;
		System.out.println("Multiplication is " +mul);
	}
}

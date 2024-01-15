package Abstract;

public class Institute extends College{

	public static void main(String[] args) 
	{
		Institute i = new Institute();
		i.Academy();
		i.Professor();
		i.Student();

	}

	@Override
	public void Academy() 
	{
		System.out.println("These is incomplete method of Concrete class 2 (College");
	}

	@Override
	public void Professor() 
	{
		System.out.println("These is incomplete method of Concrete class 1 (abstract demo)");
	}

	@Override
	public void Student() 
	{
		System.out.println("These is incomplete method of Concrete class 1 (abstract demo)");
	}

}

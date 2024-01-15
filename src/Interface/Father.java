package Interface;

public interface Father
{
		
	void hardwork();
	void honesty();
	void house();
	default void love()
	{
		System.out.println("These is loves method in Father ");
	}
	



}

package Interface;

public interface Bank_Emp 
{
	void empInfo();
	
	default void saving_account()
	{
		System.out.println("These is saving account complete method in interface Bank Emp ");
	}
	
	static void money()
	{
		System.out.println("These is money complete method in Bank Emp");
	}
}
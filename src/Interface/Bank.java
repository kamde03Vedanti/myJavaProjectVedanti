package Interface;

public interface Bank 
{
	int a= 10;		
	int b=20;      // Variable by default static and final
//	int sum=a+b;	  
	void withdraw();
	void deposite();
	default void saving_account()
	{
		System.out.println("These is complete method in interface Bank");
	}
	static void money()
	{
		System.out.println("These is money complete method in Bank ");

	}
	

}

package Interface;

public class Bank_Imp implements Bank, Bank_Emp{

	public static void main(String[] args) 
	{
		Bank_Imp bi = new Bank_Imp();
		bi.loan();
		bi.withdraw();
		bi.deposite();
		int sum= a+b;
		System.out.println("Addition = " +sum);
		bi.empInfo();
		bi.saving_account();
		Bank.money();
		Bank_Emp.money();
	}
	
	public void loan()
	{
		System.out.println("These is complete method in Own class ");
	}

	@Override
	public void withdraw() 
	{
		System.out.println("These Withdraw method is completed in Bank Imp class ");
	}

	@Override
	public void deposite() 
	{	
		
		System.out.println("These Deposite method is completed in Bank Imp class ");}

	@Override
	public void saving_account() 
	{
		Bank_Emp.super.saving_account();
		Bank.super.saving_account();
	
}

	@Override
	public void empInfo() 
	{
		System.out.println("These empInfo method is completed in Bank Imp class");
		
	}	
}	
	

package Encapsulation;

public class Encapsulation_Use {

	public static void main(String[] args) 
	{
		Encapsulation_Use eu = new Encapsulation_Use();
		eu.addition();
		

	}
	private int a=10;
	private int b=20;
	public void addition()
	{
	int sum=a+b;
	System.out.println("addtion is " +sum);
	}
	public int getAvalue()
	{
	return a;
	}
	public int getBvalue()
	{
	return b;
	}
	


}

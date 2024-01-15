package Inheritance;

public class Vehicale 
{

	
	public void car()
	{		
		String name = "Hundai Car";
		System.out.println("The model car name is " +name);
	}
}	

		
	class Sport extends Vehicale
		{
		public void detatil()
		{
		String name = "mustang";
		System.out.println("Sport car is " +name);
		}
		
	public static void main(String[] args) 
	{
		Sport s1 = new Sport();
		s1.detatil();
		s1.car();

	}
}
	


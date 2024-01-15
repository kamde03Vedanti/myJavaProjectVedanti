package Polymorphism;


public class run_Use extends Runtime
{
   public static void main(String[] args)
   {
	   run_Use ru = new run_Use();
	   ru.callme();
	   ru.stdInfo(120,"Suresh", 80.20f);
	   
	   Runtime rt = new Runtime();
	   rt.callme();
	   rt.stdInfo(121,"Ramesh",75.50f);
	   
	
   }
	public void callme()
	{
		System.out.println("These callme method in class run_Use ");
	}
	
	public void stdInfo(int rollno,String name, float per )
	{
		System.out.println("These is stdInfo method in run_Use class");
		System.out.println("Student name is " +name);
		System.out.println("Student roll number is " +rollno);
		System.out.println("Student percentage is " +per);
		System.out.println(" =============================== ");

	}
}

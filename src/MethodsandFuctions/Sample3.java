package MethodsandFuctions;

public class Sample3 {

	public static void main(String[] args)
	{
        		
		employee("Shreyas", 12345, "03-03-2000", 25600l, 'M', 5.6f);
		
		Sample3 std = new Sample3();
		std.student();
		
	}
	
	public static void employee(String name, int id, String DOB, long sal, char gender, float height) // static regular method and with parameter
	{
      System.out.println("Employee name is " +name);
      System.out.println("Employee ID is " +id);
      System.out.println("Salary is " +sal);
      System.out.println("Gender is " +gender);
      System.out.println("Height of employee is " +height);
      System.out.println(" ");
      System.out.println("*************************************** ");
      System.out.println(" ");
	}
	
	public void student()                     //non static method
	{
		String name;
		int rollno;
		char Division;
		float marks;
		boolean result;
		
		name="Mahesh";
		rollno=101;
		Division='A';
		marks=75.09f;
		result=true;
		
		System.out.println("Student name is " +name);
		System.out.println("Roll number is " +rollno);
		System.out.println( Division+ " of Student ");
		System.out.println("Student marks is " +marks);
		System.out.println("Result of Student is " +result);
		
	}
}

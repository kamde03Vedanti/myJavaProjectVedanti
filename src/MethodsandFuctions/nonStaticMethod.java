package MethodsandFuctions;

public class nonStaticMethod {

	public static void main(String[] args) 
	{
		//to create object 
		//syntax---> ClassName ObjectName = new ClassName();
		 nonStaticMethod obj = new nonStaticMethod();
		 nonStaticMethod values = new nonStaticMethod();
		//to call non static method from same class
		//syntax---> ObjectName.MethodName
		 obj.sample();
		 values.stud1();
		 
		 //to call non static from another class
		 
		 
	}
	
	public void sample()
	{
		System.out.println("This is Non Static Regular Method Sample");
	}
	public void stud1()
	{
		String name="Riya";
	    int marks=80;
		System.out.println("Student name is " +name);
		System.out.println("Marks of Student is " +marks);
	}
	public void stud2()
	{
		String name= "pooja";
		int marks=85;
	     System.out.println("Student name is " +name);
	     System.out.println("Marks of Student is " +marks);
	}

}

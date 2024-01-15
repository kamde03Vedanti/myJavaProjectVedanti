package Inheritance;

public class single_Inheritance {

	public static void main(String[] args)
	{
		Teacher t = new Teacher();// super class object
		t.teach(); // calling non static method of another Super class 
		Teacher.test(); //calling static method of another Super class
		
		Student s = new Student(); // sub class object 
		s.science(); // calling non static method of another sub class 
		s.teach();   // calling non static method of another super class by ref object of sub class
		Student.commerce();// calling static method of sub class 
		Student.test();	//calling non static method of super class by ref object of sub class
		
	}

}

package MethodsandFuctions;

public class studentInfo {

	public static void main(String[] args) 
	{
		studentInfo si = new studentInfo();
		si.studentDetails();
		
		si.studentDetails( "Neha", 25, 89.90f, 'A' );
		
		

	}
	
	public void studentDetails() // Method without parameter
	{
		String name="Anushree";
		int rollno=56;
		float avg_result=79.50f;
		char grade='A';
		System.out.println(" Student name is "+name);
		System.out.println(" Roll no is " +rollno);
		System.out.println(" Average result is " +avg_result);
		System.out.println(" Total grade is " +grade);
		
	}
		 
	public void studentDetails(String name, int rollno, float avg_result, char grade) // Method with parameter 

	// name, rollno, avg_result, 
	
	{
		System.out.println("*********************************");
		System.out.println(" Student name is "+name);
		System.out.println(" Roll no is " +rollno);
		System.out.println(" Average result is " +avg_result);
		System.out.println(" Total grade is " +grade);
				
	}

}

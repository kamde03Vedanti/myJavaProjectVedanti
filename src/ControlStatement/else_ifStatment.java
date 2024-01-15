package ControlStatement;

public class else_ifStatment {
	
	public static void main(String[] args) 
	{
	  //if student marks is greater than equal to 75 and less than equal 100 than distinction
	  //else if marks is greater than equal to 65 and less than equal 75 than first class 
	  //else if marks is greater than equal to 55 and less than equal to 65 than second class
	  //else if marks is greater than equal to 45 and less than equal to 55 than third class
	  //else Student is fail 
		
	  int marks=85;
	  if(marks>100)
	  {
		  System.out.println("Enter valid marks, Less than 100 ");
	  }
	  else if(marks>=75 && marks<=100)
	  {
		  System.out.println("Student is Distinction");
	  }
	  else if(marks>=65 && marks<=75)
	  {
		  System.out.println("Student is in Fisrt class");
	  }
	  else if(marks>=55 && marks<=65)
	  {
		  System.out.println("Student is in Second class");
	  }
	  else if(marks>=45 && marks<=55)
	  {
		  System.out.println("Student is in Third class");
		  
	  }
	   else
	  {
		  System.out.println("Student is fail ");
	  }
	}

}


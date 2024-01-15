package MethodsandFuctions;

public class Sample2 {

	public static void main(String[] args) 
	{
	 // To call Static Method From Another class
	// Classname.MethodName
		
	  
      Sample1.x(20,40,60);	
      
	//To call Non static method from another class
	//Create object of that method
	  Sample1 s1 = new Sample1();
	  s1.y();
	  
	  
	  Sample4 s4 = new Sample4();
	  s4.arthematics(23, 34, 56, 1.6f, 4.5d);
	 
	  
	  
		
		
	}
	
	
		
	

}

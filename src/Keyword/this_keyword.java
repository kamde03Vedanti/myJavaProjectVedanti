package Keyword;

public class this_keyword {

	int a=20;
 }
	
   class Myclass extends this_keyword
	{
		int a=30;
		
		void t1()
		{
			int b =20;
			int add=this.a+b;
			System.out.println("Addition of " +add);
			 
			
		}
		
		public static void main(String[] args) 
		{
			Myclass mc = new Myclass();
			mc.t1();
		}
	}



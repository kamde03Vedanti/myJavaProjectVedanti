package ArrayStudy;

public class Array {

	public static void main(String[] args) {
		//Array[] can be written infront of variable as well as infront of datatype
		// To store names of students using String array
		//	String name[]= new String[5]; ---> Infront of variable[]
		//To store table of 2 using int array
		//int[] table0f2= new int[10];  ---> Infront of datatype
		
		//to stored players 
		// 1. decleration part
		String[] players = new String[10];
		// 2. Initilization part
		players[0]= "Ms Dhoni";
		players[1]=	"Rohit";
		players[2]="Virat";
		players[3]="Rahul";
		players[4]="Gill";
		
		
		System.out.println(players[0]);
		System.out.println(players[1]);
		System.out.println(players[2]);
		System.out.println(players[3]);
		System.out.println(players[4]);
		System.out.println(players[5]);//default value of string ...
		
		System.out.println("==============================");
		
		//int array
		int[] age = new int[5];
		age[0]= 25;
		age[1]= 30;
		age[2]= 45;
		age[3]= 50;
		age[4]= 55;
		System.out.println("The age is " +age[3]);
	//System.out.println(age[5]);// ArrayIndexOutOfBoundsException
		System.out.println(age.length + " is length");
		
		System.out.println("==================================");
		// we can use For loop for traversing in array 
		//static loop 
		for(int i=0;i<=4;i++)
		{
			System.out.println(age[i]);
		}
		System.out.println("length of age " +age.length);
		
		System.out.println("-----------------------------------");
		 //dynamic loop 
		for(int i=0;i<=age.length-1;i++)
		{
			System.out.println(age[i]);
		}
		System.out.println("===================================");
		
		//to store alphates using char[]
		char[] alpha = {'H','D','A','R','S'};
		//USING static loop
		for(int i=0;i<=4;i++)
		{
			System.out.println(alpha[i]);
		}
		System.out.println("----------------------------------");
		//USING dynamic loop
		for(int i=0;i<=alpha.length-1;i++)
		{
			System.out.println(alpha[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

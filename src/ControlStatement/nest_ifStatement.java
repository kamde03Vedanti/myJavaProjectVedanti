package ControlStatement;

public class nest_ifStatement {

	public static void main(String[] args) 
	{	
		//if email id is correct than enter the password
		//password is correct than welcome the home page
		//if password is incorrect than please enter the correct password 
		//if email id is incorrect than please enter the correct email id
		
		String email_id= "vedanti@gmail.com";
		String password="vk@121";
		
		if(email_id=="vedanti@gmail.com")
		{
		
			System.out.println("Please Enter the password");
		
		if(password=="vk@121")
			{
				System.out.println("Welcom to home page");
			}
			else
			{
				System.out.println("Please enter a valid password");
				
			}
		}
		else
		{
			System.out.println("Please enter a correct email id");
		}

	}

}

package ControlStatement;

public class switchStatement {

	public static void main(String[] args) 
	{
		
		String signal="Red";
		
		switch (signal)
		{
		case "Red": System.out.println("RED=STOP ");
		break;
		case "Green": System.out.println("GREEN=START ");
		break;
		case "Yellow": System.out.println("YELLOW=GO ");
		break;

		default:System.out.println("Please enter a valid colour");
        break;
		}
	}

}

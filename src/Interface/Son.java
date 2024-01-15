package Interface;

public class Son implements Father,Mother
{

	public static void main(String[] args) 
	{
		Son s = new Son();
		s.look();
		s.nature();
		s.recipe();
		s.hardwork();
		s.honesty();
		s.house();
		Mother.love();
	}

	@Override
	public void look() 
	{
		System.out.println("These Mother class method look which is implemented in Son ");
		
	}

	@Override
	public void nature() 
	{
		System.out.println("These Mother class method nature which is implemented in Son ");

	}

	@Override
	public void hardwork() 
	{
		System.out.println("These Father class method Hardwork which is implemented in Son ");
	
	}

	@Override
	public void honesty() 
	{
		System.out.println("These Father class method Honesty which is implemented in Son ");

	}

	@Override
	public void recipe() 
	{
		System.out.println("These Mother class method Recipe which is implemented in Son ");

	}

	@Override
	public void house() 
	{
		System.out.println("These Father class method House which is implemented in Son ");

	}

	@Override
	public void love() 
	{
		Father.super.love();
	}

}

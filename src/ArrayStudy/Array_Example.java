package ArrayStudy;

import java.util.Arrays;

public class Array_Example {

	public static void main(String[] args) {

		
		char[] alpha = {'r','t','i','e','j','s','a','n'};
		
		for(int i=0;i<=alpha.length-1;i++)
		{
			System.out.println(alpha[i]);
		}
		
		System.out.println("*********Reversed Order**********");
		
		for(int i=alpha.length-1;i>=0;i--)
		{
			System.out.println(alpha[i]);
		}
		System.out.println("*********Ascending Order**********");
		
		Arrays.sort(alpha);		//inbuilt method of array
		for(int i=0;i<=alpha.length-1;i++)
		{
			System.out.println(alpha[i]);
		}
		System.out.println("*********Descending Order**********");
		for(int i=alpha.length-1;i>=0;i--)
		{
			System.out.println(alpha[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

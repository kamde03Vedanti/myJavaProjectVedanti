package List_CollectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Traversingin_Vector 
{
	public static void main(String[] args) 
	{
		Vector<Object> v= new Vector<Object>();
		v.add("Maharashtra");
		v.add(29);
		v.add("State");
		v.add(true);
		v.add(null);
		v.add("Captial");
		v.add('M');
		v.add(null);
		System.out.println(v.set(7, "India"));  // replace element at index no.7
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		//traversing using For loop
		System.out.println("---------for loop---------");
		 for(int i=0;i<=v.size()-1;i++)
		 {
			 System.out.println(v.get(i));
		 }
		System.out.println("---------for each---------");
		for(Object v1:v)
		{
			System.out.println(v1);
		}
		System.out.println("---------using Iterator------");

		Iterator<Object> it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("---------using List Iterator---------");
		
		ListIterator<Object> lt = v.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		System.out.println("--------previous----------");
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}

		System.out.println("---------using Enumeration---------");
		 Enumeration<Object> e1 = v.elements();
		 while(e1.hasMoreElements())
		 {
			 System.out.println(e1.nextElement());
		 }

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

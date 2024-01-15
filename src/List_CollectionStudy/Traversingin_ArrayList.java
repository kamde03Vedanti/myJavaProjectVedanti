package List_CollectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversingin_ArrayList {

	public static void main(String[] args)
	{
		ArrayList<Object> arl = new ArrayList<Object>();
		arl.add("Microsoft");
		arl.add("Amazon");
		arl.add(22);
		arl.add(45.4f);
		arl.add('A');
		arl.add(null);
		System.out.println(arl);
		
		System.out.println("*******using for loop************");
		
		for( int i=0;i<arl.size();i++)
		{
			System.out.println(arl.get(i));	
		}
			
		System.out.println("*******using for each loop************");
		
		for(Object show : arl)
		{
			System.out.println(show);
		}
		System.out.println("*******using Iterator************");
		
				Iterator<Object>it=arl.iterator();
				
//				System.out.println(it.next());
//		        System.out.println(it.next());
//				System.out.println(it.next());
//				System.out.println(it.next());
//				System.out.println(it.next());
//				System.out.println(it.next());
//			    System.out.println(it.hasNext());
				
				while(it.hasNext())
				{
					System.out.println(it.next());		//only uni-direction cursor
				}
				
//				Object ele1 = it.next();
//				Object ele2 = it.next();
//				System.out.println(ele1);
//				System.out.println(ele2);
				
				System.out.println("*******using ListIterator************");
				
				ListIterator<Object>lit=arl.listIterator();
				//bidirectional cursor
				while(lit.hasNext())
				{
					System.out.println(lit.next());
				}
				System.out.println("*******using ListIterator by reverse************");
	
				while(lit.hasPrevious())
				{
					System.out.println(lit.previous());
				}
				
				
				
	}
}

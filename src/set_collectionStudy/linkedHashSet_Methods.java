package set_collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSet_Methods {

	public static void main(String[] args)
	{
		LinkedHashSet<Character> lh= new LinkedHashSet<Character>();
		lh.add('H');
		lh.add('D');
		lh.add('B');
		lh.add('K');
		lh.add(null);
		lh.add('A');
		lh.add('S');
		lh.add('M');
//      only one null value and no duplicate is allowed 
//		lh.add(null);
//		lh.add('D');
	    System.out.println(lh);
	    
	    System.out.println(lh.size());
	    
	    System.out.println(lh.contains('S'));
	    System.out.println(lh);
	    
	    System.out.println("------Using for each---------");
	    for(Character e:lh)
	    {
	    	System.out.println(e);
	    }
	    
	    System.out.println("------Using Iterator----------");
	    Iterator<Character> it = lh.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    lh.clear();
	    System.out.println(lh.isEmpty());
	    System.out.println(lh);
		
	}

}

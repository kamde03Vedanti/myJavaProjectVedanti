package set_collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Methods {

	public static void main(String[] args) 
	{
		HashSet<Object> hs = new HashSet<Object>();
		hs.add(200);
		hs.add("hello");
		hs.add(false);
		hs.add(56.4f);
		hs.add(null);
		hs.add("World");
//	    hs.add(null);   only one null value allowed 
		hs.add("India");
//		hs.add(200);    Duplicates are not allowed 
		System.out.println(hs);
		
		System.out.println(hs.size());
		System.out.println(hs.contains(false));
		System.out.println(hs.remove(null));
		System.out.println(hs);
//		hs.clear();
//		System.out.println(hs);
//		System.out.println(hs.isEmpty());
		
		System.out.println("------using Iterator-------");
		
		Iterator<Object> hit = hs.iterator();
		while(hit.hasNext())
		{
			System.out.println(hit.next());
		}
		System.out.println("------for each-------");
	
		for(Object o:hs)
		{
			System.out.println(o);
		}
	    System.out.println("-------------------");	
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		
		
		
		
		
		
	}

}

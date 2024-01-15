package set_collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Methods {

	public static void main(String[] args) {

//		TreeSet<Object> ts = new TreeSet<>();
//		 ts.add("Math");
//		 ts.add("Science");
//		 ts.add("Commerce");
//		 ts.add("Arts");
//       ts.add(null);		NullPointerException
//       ts.add(256);		ClassCastException
//	    System.out.println(ts);
		
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(11);
		ts1.add(26);
		//ts1.add(9);
		//ts1.add(2);
		ts1.add(10);
		ts1.add(20);
		ts1.add(3);
		ts1.add(5);
		ts1.add(15);
		System.out.println(ts1);
		System.out.println("===========================");
		System.out.println(ts1.ceiling(5));
		System.out.println(ts1.ceiling(9)); // showing greater than 9
		System.out.println(ts1.ceiling(15));
		System.out.println(ts1.ceiling(27));
		System.out.println("===========================");
		System.out.println(ts1.floor(3));
		System.out.println(ts1.floor(18));
		System.out.println(ts1.floor(1));
		System.out.println("===========================");
		System.out.println(ts1.higher(4));
		System.out.println(ts1.higher(15));
		System.out.println(ts1.higher(26));
		System.out.println(ts1.lower(5));
		System.out.println(ts1.lower(3));
		System.out.println("================================");
		System.out.println(ts1.remove(5));
		System.out.println(ts1);
//		System.out.println(ts1.lower(5));
		
		//traversing
//		System.out.println("--------for loop------");
//		for(int i=0;i<=ts1.size()-1;i++)
//		{
//			System.out.println(ts1);
//		}
		
		System.out.println("--------for each Loop----");
		for(Integer o:ts1)
		{
			System.out.println(o);
		}
		
		System.out.println("-------using Iterator------");
		
		Iterator<Integer> it = ts1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
		System.out.println("-------using Descending Iterator---------");
		Iterator<Integer> it1 = ts1.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println(ts1);
		
		
	}

}

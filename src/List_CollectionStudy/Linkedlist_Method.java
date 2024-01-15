package List_CollectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist_Method{
	
public static void main(String[] args) {
		
		 LinkedList<Character> l = new LinkedList<Character>();
		 
		 l.add('F');
		 l.add('G');
		 l.add('N');
		 l.add('D');
		 l.add('A');
		 l.add('H');
		 l.add('S');
		 l.add('N');
	     l.add(null);      
		 System.out.println(l);
		 l.addFirst('M');
		 System.out.println(l);
		 l.addLast('V');
		 System.out.println(l);
		 System.out.println(l.get(4));
		 System.out.println("========element method======");
		 System.out.println(l.element());  // retrieve but not remove
		 System.out.println(l);
		 System.out.println("=======poll method=========");
		 System.out.println(l.poll());     //retrieve and remove
		 System.out.println(l);
		 System.out.println("=======peek method=========");
		 System.out.println(l.peek());		//retrieve the element
		 System.out.println(l);
		 System.out.println("=======get first=====");
		 System.out.println(l.getFirst());
		 System.out.println(l);
		 System.out.println("=======get last=====");
		 System.out.println(l.getLast());
		 System.out.println(l);
		 System.out.println("======offer method=====");
		 System.out.println(l.offer('Y'));
		 System.out.println(l); 
		 System.out.println(l.offerFirst('R'));
		 System.out.println(l);
		 System.out.println(l.offerLast('U'));
		 System.out.println(l);
		 
		 //traversing
		 System.out.println("-----using For loop--------");
		 
		 for(int i=0;i<=l.size()-1;i++)
		 {
			 System.out.println(l.get(i));
		 }
		 System.out.println("----using for each---------");
		
		 for(Character o:l)
		 {
			System.out.println(o); 
		 }
		
		 System.out.println("----using Iterator---------");
		 Iterator<Character> it = l.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 System.out.println("-----using listIterator------");
		 
		 ListIterator<Character> lit = l.listIterator();
		 while(lit.hasNext())
		 {
			 System.out.println(lit.next());
		 }
		 System.out.println("------previous---------");
		 while(lit.hasPrevious())
		 {
			 System.out.println(lit.previous());
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

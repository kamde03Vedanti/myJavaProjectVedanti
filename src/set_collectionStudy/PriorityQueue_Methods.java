package set_collectionStudy;

import java.util.PriorityQueue;

public class PriorityQueue_Methods {
	
	public static void main(String[] args)

{
	PriorityQueue<String> pq = new PriorityQueue<>();
	pq.add("Pune");
	pq.add("Mumbai");
	pq.add("Nashik");
	pq.add("Hydrabad");
	pq.add("Indore");
	//pq.add(null);		//NullPointerException
	System.out.println(pq);
	System.out.println(pq.peek());				//retrieve the element
	System.out.println(pq);
	System.out.println("******************");
	System.out.println(pq.poll());				//retrieve and remove
	System.out.println(pq);
	System.out.println("******************");
	System.out.println(pq.element());			//retrieve but not remove
	System.out.println(pq);
	System.out.println("******************");
	System.out.println(pq.offer("Nagpur"));
	System.out.println(pq);
	
	
	
}
}

package List_CollectionStudy;

import java.util.Vector;

public class Vector_Methods {

	public static void main(String[] args) 
	{
		//Legacy Class
		Vector<String> v = new Vector<>();
		v.add("Mumbai");
		v.add("Pune");
		v.add("Nashik");
		v.add("Hydrabad");
		v.add("Banglor");
		v.add(4,"Pune");	
		//Duplicates element and No. null value
		v.add("Mumbai");
		v.add(null);
		v.add(null);
		System.out.println(v);
		System.out.println("=============capacity and size===========");
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.contains("Hydrabad"));
		System.out.println("=============get and elementAt===========");
		System.out.println(v.get(2));
		System.out.println(v.elementAt(4));
		System.out.println("=============firstElement and lastElement===========");
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println("==========inerstElementAt==============");
		v.insertElementAt("Indore", 6);
		System.out.println(v);			//by inserting value Left shift 
		System.out.println("=============remove===========");
		System.out.println(v.remove("Indore"));
		System.out.println(v);
		System.out.println("=========SetSize================");
		v.setSize(15);
		System.out.println(v);
		System.out.println("=========RemoveAll Elements and empty================");

//		v.removeAllElements();
//		System.out.println(v);
//		System.out.println(v.isEmpty());
		
		v.ensureCapacity(6);
		System.out.println(v.add("INd"));
		System.out.println(v);
	
		
		
	}

}

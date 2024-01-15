package List_CollectionStudy;

import java.util.ArrayList;

public class ArrayList_Method {

	public static void main(String[] args)
	{
		ArrayList<Object> arl = new ArrayList<>();
		arl.add("Pune");
		System.out.println(arl);
		System.out.println("=============================");
		arl.add(1,"MH" );
		System.out.println(arl);
		
		System.out.println("=============================");
		
		
		 Object al=arl.clone();
		 System.out.println("Clone ArrayList " +al);
		 
		 System.out.println("=============================");
		System.out.println( arl.contains("MH"));
		System.out.println(arl.contains("Ind"));
		
		System.out.println("=============================");
		
		arl.ensureCapacity(2);
		System.out.println(arl.add("Ind"));
		System.out.println(arl);
		arl.add("City");
		System.out.println(arl);
		
		System.out.println("=============================");
		
		arl.equals(al);
		System.out.println(al);
		System.out.println(arl);
		System.out.println(	arl.equals(al));
		System.out.println("=============================");
		
		System.out.println(arl.get(3));
		//System.out.println(arl.get(5));
		System.out.println("=============================");
		
		System.out.println(arl.indexOf("MH"));
		
		System.out.println("=============================");
		
		System.out.println(arl.lastIndexOf("Ind"));
		
		System.out.println("=============================");
		
		arl.remove(3);
		System.out.println(arl); //left shift
		System.out.println("=============================");
		arl.set(2, "Pratiksha");
		System.out.println(arl); // replaced
		
		System.out.println("=============================");
		System.out.println(arl.size());
		
		System.out.println("==============================");
		
		arl.clear();
		System.out.println(arl);
		
		System.out.println(arl.isEmpty());
	}

}

package String;

public class String_Method {

	public static void main(String[] args) {
		
		
		// 1.length()
		
		String str = "Software testing";
		
		int strlength = str.length();
		System.out.println(strlength);
		
		//2.toUppercase()
		
		String st = "Do a Smart Work";
		
		System.out.println(st.toUpperCase());
		
		//3.toLowercase()
		
		System.out.println(st.toLowerCase());
		
		String lowercase = st.toLowerCase();
		System.out.println(lowercase);     // to reuse the method
		System.out.println("=========================================");

		
		//4.equals()
		
		String a = "Java";						 // constant pool area
		String b = "Java";
		String c = "java";
		String d = new String("Java");           //non constant pool area 
		String e = new String("Java");
		String f = new String("java");
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(d));
		System.out.println(a==d);
		System.out.println(e==f);
		System.out.println(d==e);
		System.out.println("=========================================");

		
		
		//5.equalsIgnorCase()
		
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(c.equalsIgnoreCase(e));
		System.out.println("=========================================");
		
		//6. contains()
		
		String x = "INDIA";
		
		System.out.println(x.contains("A"));
		System.out.println(x.contains("i"));
		System.out.println(x.contains("IDA"));
		System.out.println(x.contains("NDI"));
		System.out.println("=========================================");
		
		//7. isEmpty()
		String y = "Pune";
		String y1 = "";
		String y2 = "  ";
		System.out.println(y.isEmpty());
		System.out.println(y1.isEmpty());
		System.out.println(y2.isEmpty());
		System.out.println("=========================================");

		// isBlank()
		
		System.out.println(y2.isBlank());
		System.out.println(y1.isBlank());
		System.out.println("=========================================");

		
		// 8.charAt()
		
		String s = "Haldiram";
		
		char show = s.charAt(4);
		System.out.println(show);
		System.out.println(s.charAt(6));
		System.out.println("=========================================");

		
		//9. endsWith()
		
		System.out.println(s.endsWith("ram"));
		System.out.println(s.endsWith("dir"));
		System.out.println(s.endsWith("Haldi"));
		System.out.println(s.endsWith("m"));
		System.out.println(s.endsWith("Haldiram"));
		System.out.println("=========================================");
		
		//10. startsWith()
		
		System.out.println(s.startsWith("Haldi"));
		System.out.println(s.startsWith("dir"));
		System.out.println(s.startsWith("dir",3));
		
		//11.Split Method
		
		String s1 = "Never_Give_Up";
		String[] name =s1.split("_");
		System.out.println("=========================================");

		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]+" ");
		}
		
		
		   
		
		
		
		
		

		
	
		
		
		
		
		
		
		        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

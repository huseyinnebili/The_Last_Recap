package recap;

import java.util.Iterator;
import java.util.LinkedList;

public class Names_LinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<String>names=new LinkedList<>();
		
		names.add("Ava");
		names.add("Smith");
		names.add(null);
		names.add("Zlatan");
		names.add("Joe");
		names.add("Joe");
		names.add(null);
		
		System.out.println(names.size());
		
		System.out.println(names);
		
		names.add(1,"Tomas");
		

		System.out.println(names.size());
		System.out.println(names);
		
	

		System.out.println("=======For Loop=======");
		
		for(int i=0;i<names.size();i++) {
			
			System.out.println(names.get(i));
		}
		
		System.out.println("=======Enhanced For Loop=======");
		
		for(String name:names) {
			
			System.out.println(name);
		}
		
		System.out.println("=======Iterator=======");
		
		Iterator<String>it=names.iterator();
		
		while(it.hasNext()) {
			
			String name=it.next();
			
			System.out.println(name);
		}
	}

}

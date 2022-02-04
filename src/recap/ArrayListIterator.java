package recap;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		
		
		ArrayList<String>choco=new ArrayList<>();
		
		choco.add("Kinder");
		choco.add("Hershey");
		choco.add("Godiva");
		choco.add("Snickers");
		
		
		
		ArrayList<String >sweets=new ArrayList<>();
		
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco);
		
		System.out.println(sweets);
		System.out.println("The size of sweets arraylist = "+sweets.size());

		
		Iterator<String>it=sweets.iterator();
		
		
		while(it.hasNext()) {
			
			String text=it.next();
			
			System.out.print(text+"-");
			
			if(text.contains("ice cream")) {
				
				it.remove();
			}
		}
		
		System.out.println();
		System.out.println(sweets);
	
	
		
		for(String sweet:sweets) {
			
			System.out.print(sweet+"-");
			
		}
	}

}

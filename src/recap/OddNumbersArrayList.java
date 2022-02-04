package recap;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumbersArrayList {

	
	        // Create an arrayList of odd numbers from 0 to 100, 
			// and using for loop remove any numbers divisible by 3 from that arrayList,
			// then using iterator remove any numbers divisible by 7 from that arrayList,
	        // then using iterator remove any numbers divisible by 5 from that arrayList
	
	public static void main(String[] args) {
		
		ArrayList<Integer>numbers=new ArrayList<>();
		
		for(int i=1;i<=100;i+=2) {
			
			numbers.add(i);
		}
		
		System.out.println("The list of numbers before removing any numbers = "+numbers);
		
		System.out.println();
		
		
		
		
		System.out.println("==========Removing the odd numbers trough for loop divisible by 3================");
		
		for(int i=0;i<numbers.size();i++) {
			
			if(numbers.get(i)%3==0) {
				
				numbers.remove(i);
				
				
				
			}
		}
		
		System.out.println("The list of numbers after removing the numbers divisible by 3 = "+numbers);

		System.out.println();
		
		
		
		System.out.println("==========Removing the odd numbers trough iterator divisible by 7================");
		
		Iterator<Integer>it=numbers.iterator();
		
		while(it.hasNext()) {
			
			Integer number=it.next();
			
			if(number%7==0) {
				
				it.remove();
			}
		}
		
		System.out.println("The list of numbers after removing the numbers divisible by 7 = "+numbers);
		
		System.out.println();
		
		
		System.out.println("==========Removing the odd numbers trough iterator divisible by 5================");
		
		Iterator<Integer>it_2=numbers.iterator();
		
		while(it_2.hasNext()) {
			
			Integer number_2=it_2.next();
			
			if(number_2 % 5==0) {
				
				it_2.remove();
			}
		}
		
		System.out.println("The list of numbers after removing the numbers divisible by 5 = "+numbers);
	}

}

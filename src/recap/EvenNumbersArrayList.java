package recap;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbersArrayList {

	public static void main(String[] args) {

		// Create an arrayList of even numbers from 0 to 50, 
		//and using iterator remove any numbers divisible by 5 from that arrayList,
		// then using iterator remove any numbers divisible by 6 from that arrayList.

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 2; i <= 50; i += 2) {

			numbers.add(i);
		}

		System.out.println("The list of numbers before removing= "+numbers);
		
		System.out.println();
		
		System.out.println("=======Remove the numbers divisible by 5 from the arrayList by using for loop========");
		
		for(int i=0;i<numbers.size();i++) {
			
			if(numbers.get(i)%5==0) {
				
				numbers.remove(i);
				
			}
		}
		
		System.out.println(numbers);
		
        System.out.println();
        
        
        
		System.out.println("=====Remove the numbers divisible by 5 from the arrayList by using Iterator=======");
		
		Iterator<Integer> it = numbers.iterator();

		while (it.hasNext()) {

			Integer number = it.next();

			if (number % 5 == 0) {

				it.remove();

			}

		}

		System.out.print(numbers + ",");

		System.out.println();
		
		System.out.println();
		
		
		System.out.println("=====Remove the numbers divisible by 6 from the arrayList by using Iterator=======");

		Iterator<Integer> it_2 = numbers.iterator();

		while (it_2.hasNext()) {

			Integer number_2 = it_2.next();

			if (number_2 % 6 == 0) {

				it_2.remove();
			}
		}

		System.out.print(numbers + ",");
		
		
		
	}

}

package recap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Countries_TreeSet {

	public static void main(String[] args) {

		int[][] nums = new int[3][4];

		nums[0][0] = 10;
		nums[0][1] = 20;
		nums[0][2] = 30;
		nums[0][3] = 40;
		nums[1][0] = 10;
		nums[1][1] = 20;
		nums[1][2] = 30;
		nums[1][3] = 40;
		nums[2][0] = 10;
		nums[2][1] = 20;
		nums[2][2] = 30;
		nums[2][3] = 40;

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums[i].length; j++) {

				System.out.print(nums[i][j] + " ");
			}

			System.out.println();
		}

		
		Set<String> countries = new TreeSet<>();

		countries.add("USA");
		countries.add("Germany");
		countries.add("Sweden");
		countries.add("Italy");
		countries.add("Belgium");
		countries.add("Turkey");
		countries.add("Turkey");
		// countries.add(null); //TreeSet does not allow null values so it is thrown
		// java.lang.NullPointerException exception.

		
		
		// Java 8 forEach / stream can be used to loop over the TreeSet in the below
		// manner.

		System.out.println("========= TreeSet for each loop ===========");

		countries.forEach(i ->

		System.out.print(i + " "));

		System.out.println();
		
		

		System.out.println("======== TreeSet Enhanced for loop=======");

		for (String country : countries) {

			System.out.print(country + " ");
		}
		
		System.out.println();
		
		
		
		System.out.println("======== TreeSet Iterator==========");
		
		Iterator<String>it=countries.iterator();
		
		while(it.hasNext()) {
			
			String country=it.next();
			
			System.out.print(country+" ");
		}
		
		System.out.println();
		
		
		Set<String> countriess = new HashSet<>();

		countriess.add("USA");
		countriess.add("Germany");
		countriess.add("Sweden");
		countriess.add("Italy");
		countriess.add("Belgium");
		countriess.add("Turkey");
		countriess.add("Turkey");
		countriess.add(null);
		
		
		// Java 8 forEach / stream can be used to loop over the TreeSet in the below manner.
		
		System.out.println("========= HashSet for each loop======");
		
		countriess.forEach(i->
		
				System.out.print(i+" "));
		
		System.out.println();
		
		
		
		System.out.println("========= HashSet Enhanced for loop======");
		
		for(String country:countriess) {
			
			System.out.print(country+" ");
		}
		
		System.out.println();
		
		
		System.out.println("========= HashSet Iterator======");
		
		Iterator<String>itt=countriess.iterator();
		
		while(itt.hasNext()) {
			
			String country=itt.next();
			
			System.out.print(country+" ");
		}
		
		System.out.println();
		
	}

}

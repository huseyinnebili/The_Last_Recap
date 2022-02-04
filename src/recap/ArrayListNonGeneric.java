package recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListNonGeneric {

	public static void main(String[] args) {

		// Generic ArrayList

		ArrayList<Double> list = new ArrayList<>(); //The Double class wraps a value of the primitive type double in an object.

		list.add(12.35);
		list.add(34.12);
		list.add(90.32);
		list.add(new Double(50));
		

		// list.add(50); We will get an error because it should have been a Double not int.

		System.out.println(list);

		// We update index 1 trough 30.25
		list.set(1, 30.25);

		list.remove(0);

		System.out.println(list);

		System.out.println("The item at index 1 = " + list.get(1));

		// We access all generic elements trough for loop

		for (Double ls : list) {

			System.out.print(ls + "-");
		}

		System.out.println();

		// Non-Generic ArrayList

		ArrayList arr = new ArrayList<>();

		arr.add("Hello");
		arr.add(12);
		arr.add(true);
		arr.add(list);
		arr.add(12.34);

		System.out.println(arr);

		
		
		// Array list
		int[] ar = new int[5];

		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;

		System.out.println(ar[1]);
		System.out.println("The items of the Array list = " + Arrays.toString(ar));

	}

}

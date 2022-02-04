package recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Demo_Flower {

	public static void main(String[] args) {

		System.out.println("=======Array========");

		// Short way to add objects into array.
		Flower[] flowerArray = { new Rose("Rose"), new Tulip("Tulip"), new SunFlower("Sunflower") };

		// Long way to add objects into array.
		Flower[] flowerArray_2 = new Flower[3];

		flowerArray_2[0] = new Rose("Rose");
		flowerArray_2[1] = new Tulip("Tulip");
		flowerArray_2[2] = new SunFlower("Sunflower");
	//	flowerArray_2[3] = new SunFlower("Sunflower"); //  ArrayIndexOutOfBound Exception will be thrown because the length of the array 

		// flowerArray[3]=new Rose("Rose");//ArrayIndexOutOfBound exception will be
		// thrown

		System.out.println("====Print out the short way======");

		for (Flower flower : flowerArray) {

			flower.bloom();
		}

		System.out.println("====Print out the long way======");

		for (Flower flower_2 : flowerArray_2) {

			flower_2.bloom();
		}

		System.out.println("=======ArrayList========");

		ArrayList<Flower> flowers = new ArrayList<>();

		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new SunFlower("Sunflower"));

		Iterator<Flower> it = flowers.iterator();

		while (it.hasNext()) {

			it.next().bloom();

		}

		System.out.println();
		
		System.out.println("=====Print out the cars array through for loop =====");
		
		 String[] cars = { "VW", "Mercedes", "Volvo", "Toyota" };
		  
		  for (String car : cars) {
			  
			  System.out.print(car + "-");
		  
		  }
		  
		  System.out.println();
		  
		  System.out.println("=====Print out the cars array through Arrays.toString() ======");
		  
		  System.out.print(Arrays.toString(cars)+"-");
		  
		  System.out.println();
		  System.out.println("=====Print out the cars array through enhanced for loop =====");
		  
		  for(int i=0;i<cars.length;i++) {
			  
		  System.out.print(cars[i]+"-");
		  }
		  
		 

	}
}

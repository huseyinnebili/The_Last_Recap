package recap;

public class Demo_Upcasting_Downcasting {

	public static void main(String[] args) {

		System.out.println("=======Parent Class =========");

		Upcasting_Downcasting obj = new Upcasting_Downcasting();

		obj.method();//not overridden
		obj.method_1();//not overridden	
		System.out.println(obj.name);//from parent class

		
		
		System.out.println("=====Upcasting========");

		Upcasting_Downcasting obj_1 = new Child_2();

		obj_1.method();//overridden
		obj_1.method_1();//not overridden
		System.out.println(obj.name);//from parent class
		
		

		System.out.println("======Child Class=======");

		Child_2 obj_5 = new Child_2();

		System.out.println(obj_5.id);//from child class
		System.out.println(obj_5.name);//from parent class
		obj_5.method();//overridden
		obj_5.method_1();

		
		
		// Child_2 obj_3= new Upcasting_Downcasting(); It will give an error.

		
		
		System.out.println("=======Downcasting=====");

		Child_2 obj_4 = (Child_2) obj_1;

		System.out.println(obj_4.id);// from child class
		System.out.println(obj_4.name);// from parent class
		obj_4.method();//overridden
		obj_4.method_1();//not overridden
		
		
	}

}

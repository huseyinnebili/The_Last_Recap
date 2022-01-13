package recap;

public class Demo_Employee_Encapsulation {

	public static void main(String[] args) {

		Employee_Encapsulation obj = new Employee_Encapsulation();

		obj.setName("Zlatan");
		obj.setAge(40);
		obj.setSalary(78945.12);

		System.out.println(
				obj.getName() + " is " + obj.getAge() + " years old, and his salary is $" + obj.getSalary() + ".");

		obj.setEmail("");
		System.out.println("The email ID  = " + obj.getEmail());

		obj.setEmail("abc@yahoo.com");
		System.out.println("The email ID  = " + obj.getEmail());

		obj.setEmail("abc@gmail.com");
		System.out.println("The email ID  = " + obj.getEmail());

	}

}

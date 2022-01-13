package recap;

public class Demo_Registration_Encapsulation {

	public static void main(String[] args) {


		Registration_Encapsulation obj=new Registration_Encapsulation();
		
		System.out.println("======Email=======");
		obj.setEmail("abc@yahoo.com");
		System.out.println(obj.getEmail());

		obj.setEmail("abcd@gmail.com");
		System.out.println(obj.getEmail());
		
		System.out.println("======Username======");
		obj.setUserName("abuzer123");
		System.out.println(obj.getUserName());
		obj.setUserName("abz12");
		System.out.println(obj.getUserName());
		obj.setUserName("");
		System.out.println(obj.getUserName());
		
		System.out.println("======Password========");
		
		obj.setPassword("123abuzr");
		System.out.println(obj.getPassword());
		obj.setPassword("abuzer");
		System.out.println(obj.getPassword());
		obj.setPassword("");
		System.out.println(obj.getPassword());
		obj.setPassword("1234abuzer123");
		System.out.println(obj.getPassword());
		
		
	}

}

package recap;

public class Employee_Encapsulation {

	private String name;
	private int age;
	private double salary;
	private String email;

	// getter
	public String getName() {

		return name;
	}

	// setter
	public void setName(String name) {

		this.name = name;

	}

	// setter
	public void setAge(int age) {

		this.age = age;
	}

	// getter
	public int getAge() {

		return age;
	}

	// setter
	public void setSalary(double salary) {

		this.salary = salary;
	}

	// getter
	public double getSalary() {

		return salary;
	}
	
	//setter
	public void setEmail(String email) {
		
		if(!email.isEmpty()) {
			
			if(email.endsWith("gmail.com")) {
				
				this.email=email;
				
			}else {
				
				System.out.println("Please use a gmail adress.");
			}
			
		}else {
			
			System.out.println("Email can not be empty!..");
		}
	}
	
	//getter
	public String getEmail() {
		
		return email;
	}
}

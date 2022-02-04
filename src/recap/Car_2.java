package recap;

public class Car_2 {
	
	String make,model;
	int year;
	
	Car_2(String make,String model,int year){
		
		this.make=make;
		this.model=model;
		this.year=year;
	}

	
	void printInfo() {
		
		System.out.println("This car is a "+make+" "+model+" of year "+year+" !!");
	}
}

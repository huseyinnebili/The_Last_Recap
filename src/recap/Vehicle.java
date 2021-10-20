package recap;

public class Vehicle {

	String type_of_vehicle;
	String make;
	String model;
	int year_of_vehicle;

	Vehicle() {

		System.out.println("We will give information about vehicles.");
	}

	Vehicle(String type_of_vehicle,String make,String model,int year_of_vehicle) {
		
		this.type_of_vehicle=type_of_vehicle;
		this.make=make;
		this.model=model;
		this.year_of_vehicle=year_of_vehicle;
		
		
		

	}
	
	public void display_vehicle() {
		
		System.out.println("I have a "+type_of_vehicle+",and its make is "+make+", and model is  "+model+",and model of year is "+year_of_vehicle+".");
	}
}

class Car extends Vehicle{
	
	
	int mileage;
	int door_num;
	
	Car(){
		
		System.out.println("My vehicle is a car.");
	}
	
	Car(String type_of_vehicle,String make,String model,int mileage,int door_num,int year_of_vehicle){
		
		super(type_of_vehicle,make,model,year_of_vehicle);
		
		this.mileage=mileage;
		this.door_num=door_num;
		
		
	}
	
	
	public void display_car() {
		
		System.out.println("I have a "+type_of_vehicle+", and its make is "+make+",and model is "+model+",and it has "+mileage+" mileage, and "+door_num+" door number.");
	}
}
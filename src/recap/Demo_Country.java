package recap;

public class Demo_Country {

	public static void main(String[] args) {

		

		System.out.println("========Informations of Turkey=========");
		
		Child_Country obj = new Child_Country("","");
       
		obj.country="Turkey";
		obj.capitol="Ankara";
		obj.GDP=12458000;
		obj.population=1235678;
		obj.continent="Asia";
		obj.isDemocracy=false;
		obj.display_of_country();
		
		obj.calculate_of_per_Capita_Country();
		
	
		System.out.println("========Informations of America=========");
		
		obj.country="USA";
		obj.capitol="Washington";
		obj.GDP=6000000;
		obj.population=150000;
		obj.continent="America";
		obj.isDemocracy=true;
		obj.display_of_country();
		
		obj.calculate_of_per_Capita_Country();

	}

}

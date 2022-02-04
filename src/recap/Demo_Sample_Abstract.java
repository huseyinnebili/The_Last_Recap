package recap;

public class Demo_Sample_Abstract {

	public static void main(String[] args) {


		Child_Sample obj=new Child_Sample();
		
		obj.last_Name="Kadayif";
		obj.ID="Driver Licence ID";
		obj.email="abuzer123@gmail.com";
		Sample_Abstract.phone="12231312";
		
		
		obj.display();
		obj.getName();
		obj.getID();
		obj.show();

	}

}

package recap;

public class Demo_Sample_Interface {

	public static void main(String[] args) {


		Child_Class obj=new Child_Class();
		
		obj.display();           // default implemented method from Interface.
		
		Sample_Interface.show();  // static implemented method from Interface
		
		obj.getName();           
		
		obj.getLastName();
		
		obj.getID();
		
		
		System.out.println(Sample_Interface .first_name);   //Static variable and can be accessed trough static way.
		System.out.println(Sample_Interface .last_name);    //Static variable and can be accessed trough static way.
		System.out.println(Sample_Interface .ID);           //Static variable and can be accessed trough static way.
		

	}

}

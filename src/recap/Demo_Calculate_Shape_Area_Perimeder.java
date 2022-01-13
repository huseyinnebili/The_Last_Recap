package recap;

public class Demo_Calculate_Shape_Area_Perimeder {

	public static void main(String[] args) {

		Rectangle obj = new Rectangle(0, 5.12, 0, 12.34);

		obj.display_shape();
		obj.display_shape("Rectangle");//Overloaded method
		obj.display_shape(4);
		

		Calculate_Shape_Area_Perimeder obj_2 = new Rectangle();

		obj_2.display_shape();//Overridden method.
		
		
		Calculate_Shape_Area_Perimeder obj_3=new Calculate_Shape_Area_Perimeder();
		
		obj_3.display_shape();
		
	}

}

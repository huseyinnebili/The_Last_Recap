package recap;

public class Demo_Print_Pattern_Constructor {

	public static void main(String[] args) {


		Print_Pattern_Constructor obj=new Print_Pattern_Constructor(6);
		System.out.println();
		Print_Pattern_Child_Class obj_2=new	Print_Pattern_Child_Class(6, "right pattern");
		
		Print_Pattern_Child_Class obj_3=new	Print_Pattern_Child_Class(6,0, "left pattern");
		
		Print_Pattern_Child_Class obj_4=new	Print_Pattern_Child_Class(6,0,0, "pyramid pattern");

	}

}

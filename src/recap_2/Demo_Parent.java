package recap_2;



import recap.Parent;

public class Demo_Parent {

	

	public static void main(String[] args) {
		
		
		Parent obj=new Parent("brown",12); //We can access only parent class public constructor from out of the same package.
		
		obj.display_parent();
		
		
		
		Parent obj_2 = new Child_1("brown", 12, "black");//We can not access any child class constructors even if it is public from out of the same package.

		obj_2.display_parent();
		obj_2.display_child_1();
	}

}

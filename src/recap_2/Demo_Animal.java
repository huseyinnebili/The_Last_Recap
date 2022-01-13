package recap_2;

import recap.Animal;


public class Demo_Animal {

	public static void main(String[] args) {

		Animal obj_1=new Animal(); //As it is a protected constructor, we can not access it out of package.
		
		//We can access a parent class' constructor from another class within different package only if it is a public constructor. 
		Animal obj=new Animal("Elefant",4,"trumpet");
		
		obj.display_animal();
		
		
		
		//We can not access a child class' constructor from another class within different package even if it is a public constructor.
	    Cat obj_2= new Cat("Cat",4,"meow","cat food",true);
	   
	    obj_2.display_cat();

	    Cat obj_2=new Cat();
	    
	    
	}

}

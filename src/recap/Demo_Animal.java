package recap;

public class Demo_Animal {

	public static void main(String[] args) {

		//We can access any parent class' constructors which are default,protected ,and public from different class at same package.
		//We can only not access a private constructor of the parent class.
        Animal objj=new Animal();
        
        
		Animal obj=new Animal("Elefant",4,"trumpet");
		obj.display_animal();
		
		
		//We can access any child class' constructors which are default,protected ,and public from different class at same package.
		//We can only not access a private constructor of the child class.
	   Cat obj_2=new Cat();
	    
	    Cat obj_3=new Cat("Cat",4,"meow",true);
	    obj_3.display_cat();
	    

	}

}

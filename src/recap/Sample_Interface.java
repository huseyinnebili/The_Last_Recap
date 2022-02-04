package recap;

   interface Sample_Interface {

	String first_name = "I am a PUBLIC STATIC variable in the Interface."; //This is a static variable even if it is not written 'static' front of it.

	static String last_name = "I am a STATIC variable in the Interface.";

	final String ID = "I am a STATIC FINAL variable in the Interface.";    //This is a static variable even if it is not written 'static' front of it.
	

	// unimplemented methods must be declared as public and it is public even if it
	// is not written 'public' front of it.
	void getName();
	public void getLastName();
	public abstract void getID();
	
	

	// default implemented method
	default void display() {

		System.out.println("I am a DEFAULT implemented method in the Interface.");
	}

	
	// static implemented method
	static void show() {

		System.out.println("I am a STATIC implemented method in the Interface.");
	}

}

abstract class Child_Abstract implements Sample_Interface {

	public void getName() {

		System.out.println(
				"I was a PUBLIC unimplemented(abstract) method in the Sample_Interface,then get implemented and overridden by the Child_Abstract!..");

	}

}

class Child_Class extends Child_Abstract {

	@Override
	public void getLastName() {

		System.out.println(
				"I was a PUBLIC unimplemented(abstract) method in the Sample_Interface,then get implemented and overridden by the Child_Class!..");

	}

	@Override
	public void getID() {

		System.out.println(
				"I was a PUBLIC abstract(unimplemented) method in the Sample_Interface,then get implemented and overridden by the Child_Class!..");

	}

}
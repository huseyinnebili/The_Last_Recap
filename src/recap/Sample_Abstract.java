package recap;

public abstract class Sample_Abstract {

	private String first_Name;
	String last_Name;
	protected String ID;
	public String email;

	static String phone;
	final String addrees = "Wayne";

	abstract void getName();

	protected abstract void getID();

	public abstract void show();

	void display() {

		System.out.println("My first name  is " + first_Name + ", last name is " + last_Name + ",ID is " + ID
				+ " ,email is " + email + " ,phone is " + phone + " and adress is " + addrees + ".");
	}
}

class Child_Sample extends Sample_Abstract {

	@Override
	public void show() {

		System.out.println(
				"I was a PUBLIC unimplemented(abstract) method in the Sample_Abstract,then get implemented and overridden by the Child_Sample!.. ");

	}

	@Override
	void getName() {
		System.out.println(
				"I was a DEFAULT unimplemented(abstract) method in the Sample_Abstract,then get implemented and overridden by the Child_Sample!..");

	}

	@Override
	protected void getID() {
		System.out.println(
				"I was a PROTECTED unimplemented(abstract) method in the Sample_Abstract,then get implemented and overridden by the Child_Sample!..");

	}

}
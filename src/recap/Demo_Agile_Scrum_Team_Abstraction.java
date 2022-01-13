package recap;

public class Demo_Agile_Scrum_Team_Abstraction {

	public static void main(String[] args) {


		Agile_Scrum_Team_Abstraction obj=new Product_OWner();
		
		obj.attend_Meeting();
		obj.getDescription();
		obj.getSalaryRange();
		obj.main_Responsibility();
		
		System.out.println("===============");
		
		Agile_Scrum_Team_Abstraction obj_2=new Scrum_Master();
		
		obj_2.attend_Meeting();
		obj_2.getDescription();
		obj_2.main_Responsibility();
		obj_2.getSalaryRange();
	}

}

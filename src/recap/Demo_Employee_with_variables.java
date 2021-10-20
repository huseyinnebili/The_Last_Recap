package recap;

public class Demo_Employee_with_variables {
	

	public static void main(String[] args) {


		Employee_with_variables  obj=new Employee_with_variables ();
		
		Employee_with_variables .name="Huseyin";    // static variable,public access modifier
		obj.age=40;                                 // instance variable,protected access modifier
		obj.number_of_kids=3;                       // instance variable,default access modifier
		Employee_with_variables.bonus=0;            // static variable,public access modifier
		obj.salary=5000;                               // instance variable,default access modifier
		obj.years_of_employee=15;                    // once created private, since it could not be accessed then it was changed as default.
		 
		
		obj.calculator_bonus();                     // protected method
		obj.display();                              // once created private, since it could not be accessed then it was changed as default method. 
	
	
		
		Employee_with_variables  obj_2=new Employee_with_variables ();
		
		Employee_with_variables .name="Hasan";
		obj_2.age=30;
		obj_2.number_of_kids=0;
		obj_2.years_of_employee=15;
		obj_2.salary=4500;
		Employee_with_variables.bonus=0;
		
		obj_2.calculator_bonus();
		obj_2.display();
		
		
	
    Employee_with_variables  obj_3=new Employee_with_variables ();
		
		Employee_with_variables .name="John";
		obj_3.age=17;
		obj_3.number_of_kids=0;
		obj_3.years_of_employee=15;
		obj_3.salary=0;
		Employee_with_variables.bonus=0;
		
		obj_3.calculator_bonus();
		obj_3.display();
	
	}

}

package recap;

public class Demo_Parent_Const_Static_Non_Static_Review {

	public static void main(String[] args) {


//		Parent_Const_Static_Non_Static_Review father= new Parent_Const_Static_Non_Static_Review("Ahmet",50,"QA Tester","Master's Degree");
//		
//	    System.out.println("================Father's Info=============");
//	    
//		Parent_Const_Static_Non_Static_Review.name="Ali";         //static variable calling from another class.
//		father.age=45;                                            //non-static variable calling from another class.
//		father.father_display();                                  //non-static method calling from another class.
//		Parent_Const_Static_Non_Static_Review.father_hoby();      //static method calling from another class.
//		Parent_Const_Static_Non_Static_Review.parent_common_hoby();     //static method calling from another class.

		
		
		
//        Parent_Const_Static_Non_Static_Review mother= new Parent_Const_Static_Non_Static_Review("Melisa",40,"teacher","Master's Degree");
//		
//        System.out.println("================Mother's Info=============");
//        
//		Parent_Const_Static_Non_Static_Review.name="Zeynep";      //static variable calling from another class.
//		mother.age=43;                                            //non-static variable calling from another class.
//		mother.mother_display();                                  //non-static method calling from another class.
//		mother.mother_hoby();                                     //non-static method calling from another class.
//		Parent_Const_Static_Non_Static_Review.parent_common_hoby();     //static method calling from another class.
		
		
       Child child= new Child("Sefer",15,"student","high school","Turkey");
		
        System.out.println("================Child's Info=============");
        
		Child.name="Ibrahim";                        //static variable calling from another class.
		child.age=18;                                //non-static variable calling from another class.
		child.country="USA";                         //non-static variable calling from another class.
		child.child_display();                       //non-static method calling from another class.
		child.child_hoby();                          //non-static method calling from another class.
		Child.family_common_hoby();                  //static method calling from another class.
		
		
		System.out.println("================Father's Info=============");
		
		Child.name="Ali";
	    child.age=45;
	    child.vocation="QA Tester";
	    child.graduation="Master's degree";
		child.father_display(); 
		Child.father_hoby();
		Child.family_common_hoby();
		
		
        System.out.println("================Mother's Info=============");
		
		Child.name="Buket";
	    child.age=42;
	    child.vocation="teacher";
	    child.graduation="Master's degree";
		child.mother_display(); 
		child.mother_hoby();
		Child.family_common_hoby();
		
		
      System.out.println("========Parent's Common Info==========");
		
		Child.parent_salary=75000;                // static variable calling from another class.
		Child.mother_salary=72000;                // a static variable calling from another class.
		Child.parent_salary_info();               // a static method calling from another class.
		child.parent_hoby();                      // a non-static method calling from another class.
		
	}

}

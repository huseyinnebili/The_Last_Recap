package recap;

public class Demo_Numbers {

	public static void main(String[] args) {

		Numbers num = new Numbers(0, 0, 5, "Hello");

	//	Numbers num_2 = new Numbers(6, "Print_Right_Star");

		Child_Numbers child_num = new Child_Numbers(0, 0, 0);

		Child_Numbers child_num_2 = new Child_Numbers(0, 0, 3, "Hello", 0, 0, 0);
		
		Child_Numbers child_num_3=new Child_Numbers(6, "Print_Right_Star", 0.0);
		
		Child_Numbers child_num_4=new Child_Numbers(6, "print_left_star", 0.0, 0);
		
		Child_Numbers child_num_5=new Child_Numbers(6, "print_diamont_star", 0.0, 2,true,'H');

	}

}

package recap;

public class Demo_Print_Star_Abstraction {

	public static void main(String[] args) {


		Print_Star_Abstraction obj= new Print_Star();
		
		obj.print_right_pattern();
		obj.print_right_pattern_down();
		obj.print_left_pattern();
		obj.print_left_pattern_down();
		obj.display();

	}

}

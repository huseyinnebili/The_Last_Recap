package Java_Certificate_Questions;

public class Demo_Question_47 {

	public static void main(String[] args) {
		
		Question_47 obj_1=(Question_47)new CC();
		
		CC obj_2 = (CC)new D();//Up-Casting
		
     	CC obj_3=(CC)new Question_47(); //A child class(CC) can not cast a parent class(Question_47).//java.lang.ClassCastException is thrown.
		
		D obj_4=(D)obj_2;//Down-casting
		
		
		
		
		
		
		
		
		

	}

}

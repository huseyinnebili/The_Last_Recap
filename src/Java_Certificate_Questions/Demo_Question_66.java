package Java_Certificate_Questions;

public class Demo_Question_66 {

	public static void main(String[] args) {


		Question_66 obj1=new C1();
		
		C2 obj2=new C1();
		
		
		Question_66 a=(Question_66)obj1;  //down-casting
		
		C2 b=(C2)obj2;                   //down-casting
				

		a.displayI();
		b.displayC2();
	}

}

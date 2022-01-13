package Java_Certificate_Questions;

public class Question_9 {

	int r;
	String name;

	Question_9(int r) {

		this.r = r;

	}

	Question_9(int r, String name) {

		this(r);

		this.name = name;
	}

}

class Question_9_1 extends Question_9 {

	int c;
	char grade;

	
	Question_9_1(int r, int c) {

		super(r);

		this.c = c;

		System.out.println(r + c);
	}
	
	Question_9_1(int r,String name,char grade){
		
		super(r,name);
		
		this.grade=grade;
		
		System.out.println(name+"'s math class score is "+r+",and his/her math class grade is "+grade+".");
	}
	

}

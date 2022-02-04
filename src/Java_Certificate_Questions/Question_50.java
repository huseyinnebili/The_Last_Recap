package Java_Certificate_Questions;

public class Question_50 {

	public static void main(String[] args) {
		
		//A
		double a=1234.34;  
		float b=a;  //double(1234.34) can not convert from double to float.
		float c=(float)a;
		float d=1234.34F;
		float dd=(float)1234.34;
		
		//B
		float e=(float)1_1231.231;
		
		
		//C
		Float f=100.00;// double(100.00) can not convert from double to float.
		Float g=100.00F;
		Float h=(float)100.00;
		Float hh=(float)f;
		float i=(float)f;
		
		//D
		int k=100;
		float kk=k;  //int can convert float directly.
		float l=(float)100;
		Float ll=100F;
		Float lll=(float)k;
		
		//E
		float m=100.00F;
		
		
		
		
		
		double jj=100.00;
		
		float ii=100.00F;
		float iii=(float)100.00;
		float iiii=(float)jj;
		
		Float aa=100.00F;
		Float aaa=(float)100.00;
		Float aaaa=(float)jj;
		
		
		int cc=43;
		
		float mm=12;
		float mmm=cc;
		float mmmm=(float)cc;
		
		
		Float nn=13F;
		Float nnn=(float)13;
		Float nnnn=(float)cc;
		
		
		int ab=13;
		Integer cd=ab; //Boxing
		Integer ij=13;//Auto-Boxing
		
		Integer de=10;
		int ff=de;  //UnBoxing
		int df=10;  //Auto-UnBoxing
		
		

	}

}

package recap;

public class Boxing_UnBoxing {

	public static void main(String[] args) {

        int x=10;
        
		Integer y=new Integer(10);  //Boxing
		Integer y2=20;            //Autoboxing
		
		System.out.println(y+" : "+y2);
		
		
		
		int z=y.valueOf(y);  //Unboxing
		int z2=z;        //AutoUnboxing
		
		System.out.println(z+" : "+z2);
		
	}

}

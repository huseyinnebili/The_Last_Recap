package recap;

public class Access_Modifiers {

	
public  String reverse_String(String str) {
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(str);
		
		System.out.print(reverse);
	
	
	return reverse;
	
	}
	
	
	public static void main(String[] args) {
		
		Access_Modifiers obj=new Access_Modifiers();
		
		obj.reverse_String("Hello World");
		
	}
}

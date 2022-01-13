package Java_Certificate_Questions;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question_16 {

	public static void main(String[] args) {


		LocalDateTime dt=LocalDateTime.of(2021, 12, 31, 04,15);
		
		System.out.println(dt.plusDays(30));
		
		System.out.println(dt.plusMonths(1));
		
		System.out.println(dt.format (DateTimeFormatter.ISO_DATE));		
	
		System.out.println(dt.format (DateTimeFormatter.ISO_DATE_TIME));
	
	}

}


import java.util.Scanner;

public class DateFormatter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Date Formatter");
		
		System.out.print("Month: ");
		int month = s.nextInt();
		
		switch(month) {
		
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		default:
			System.out.println("Invalid Month");
			
		s.close();
		}

	}

}

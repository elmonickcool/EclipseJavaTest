
import java.util.Scanner;

public class DateFormatter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Date Formatter");
		
		System.out.print("Month: ");
		int month = s.nextInt();
		
		System.out.println("Day: ");
		int day = s.nextInt();
		
		System.out.println("Year:");
		int year = s.nextInt();
		
		switch(month) {
		
		case 1:
			System.out.print("January "+ day);
			break;
		case 2:
			System.out.print("February "+day);
			break;
		case 3:
			System.out.print("March "+day);
			break;
		case 4:
			System.out.print("April "+ day);
			break;
		case 5:
			System.out.print("May ");
			System.out.print(day);
			break;
		case 6:
			System.out.print("June ");
			System.out.print(day);
			break;
		case 7:
			System.out.print("July ");
			System.out.print(day);
			break;
		case 8:
			System.out.print("August ");
			System.out.print(day);
			break;
		case 9:
			System.out.print("September ");
			System.out.print(day);
			break;
		case 10:
			System.out.print("October ");
			System.out.print(day);
			break;
		case 11:
			System.out.print("November ");
			System.out.print(day);
			break;
		case 12:
			System.out.print("December ");
			System.out.print(day);
			break;
		default:
			System.out.println("Invalid Month");
			
		s.close();
		}

	}

}

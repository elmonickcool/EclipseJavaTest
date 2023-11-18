
import java.util.Scanner;

public class DateFormatter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("***Date Formatter***");
		
		System.out.print("Month: ");
		int month = s.nextInt();
		
		System.out.print("Day: ");
		int day = s.nextInt();
		
		System.out.print("Year: ");
		int year = s.nextInt();
		System.out.println("***************");
		
		boolean isValidDay =  true;
		
		switch(month) {
		
		case 1:
			if(day>31) {
				isValidDay =false;
			}
			System.out.print("January "+ day + " " + year);
			break;
		case 2:
			System.out.print("February "+day +" " +year);
			break;
		case 3:
			System.out.print("March "+day + " " + year);
			break;
		case 4:
			System.out.print("April "+day +" "+ year);
			break;
		case 5:
			System.out.print("May "+day +" "+year);
			break;
		case 6:
			System.out.print("June "+day +" "+year);
			break;
		case 7:
			System.out.print("July "+day +" "+year);
			break;
		case 8:
			System.out.print("August "+day +" "+year);
			break;
		case 9:
			System.out.print("September "+day +" "+year);
			break;
		case 10:
			System.out.print("October "+day +" "+year);
			break;
		case 11:
			System.out.print("November "+day +" "+year);
			break;
		case 12:
			System.out.print("December "+day +" "+year);
			break;
		default:
			System.out.println("Invalid Month");
			
		
		}
		if(!isValidDay) {
			System.out.println("Invalid Day for Given Month");
		}
		s.close();
	}

}

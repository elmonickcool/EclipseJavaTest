
import java.util.Scanner;

public class GradesAverage {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Grade Average");
		
		System.out.print("English: ");
		int eng = s.nextInt();
		
		System.out.print("Math: ");
		int mat = s.nextInt();
		
		System.out.print("Science: ");
		int sci = s.nextInt();
		
		System.out.print("Computer: ");
		int com = s.nextInt();
		
		int total = eng+mat+sci+com;
		float ave = total/4.00f;
		
		System.out.println("Average: "+ave);
		
		if(ave>100) {
			System.out.println("Invalid Grade");
		}else if(ave>=98){
			System.out.println("With Highest Honor");
		}else if(ave>=95){
			System.out.println("With High Honor");
		}else if(ave>=90){
			System.out.println("With Honor");
		}else if(ave>=75){
			System.out.println("Passed!");
		}else {
			System.out.println("Failed");
		}
		
		s.close();

	}

}

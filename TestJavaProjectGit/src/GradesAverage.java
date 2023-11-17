
import java.util.Scanner;

public class GradesAverage {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Grade Average");
		
		System.out.print("English: ");
		int eng = s.nextInt();
		
		System.out.println("Math: ");
		int mat = s.nextInt();
		
		System.out.println("Science: ");
		int sci = s.nextInt();
		
		System.out.println("Computer: ");
		int com = s.nextInt();
		
		int total = eng+mat+sci+com;
		float ave = total/4.00f;
		
		
		
		System.out.println("Average: "+ave);
		s.close();

	}

}

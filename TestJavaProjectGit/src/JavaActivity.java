import java.util.Scanner;

public class JavaActivity {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Year: ");
		int year =s.nextInt();
		
		if(year%4==0) {
			System.out.print(year+ " is a Leap Year");
		}else {
			System.out.print(year+" is not a Leap Year");
		}
		
		s.close();
	}

}

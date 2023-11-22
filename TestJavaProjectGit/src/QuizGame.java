
import java.util.Scanner;

public class QuizGame {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int chance = 3;
		String answer;
		
		while(chance>0) {
			System.out.println("Who is the Goat?");
			System.out.print("Answer: ");
			answer = s.nextLine();
			
			if(answer.equalsIgnoreCase("Michael Jordan")) {
				break;
				}else {
					chance--;
				}
			System.out.println();
		}
		if(chance>0) {
			System.out.println("You got it!");
		}else {
			System.out.println("Game Over!");
		}
		s.close();
	}

}

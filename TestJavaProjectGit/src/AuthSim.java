
import java.util.Scanner;

public class AuthSim {

	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);
		String[] authUser = {"Elmo","Nickol"};
		String[] authPass = {"CodeMaster123","codeBreaker143"};
		
		System.out.print("Username: ");
		String user=s.nextLine();
		
		System.out.print("Password: ");
		String pass=s.nextLine();
		
		boolean isExist = false;
		
		for(int i=0;i<authUser.length;i++) {
			if(user.equals(authUser[i])&&pass.equals(authPass[i])) {
				isExist=true;
				break;
			}
		}
		
		if(isExist) System.out.println("Welcome "+user);
		else System.out.println(user + " Not Found");
		
		
		
		
		s.close();

	}
	
	
}

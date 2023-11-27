
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
		
		int userIndex=-1;
		int passIndex=-1;
		
		for(int i=0;i<authUser.length;i++) {
			if(authUser[i].equalsIgnoreCase(user)) {
				userIndex=i;
				break;
			}
		}
		
		for(int x=0;x<authPass.length;x++) {
			if(authPass[x].equals(pass)) {
				passIndex=x;
				break;
			}
		}
		
		if(userIndex == passIndex && userIndex != 1) {
			System.out.println("Welcome "+authUser[userIndex]);
		}else {
			System.out.println("Account Not Found");
		}
		
		s.close();

	}
	
	
}

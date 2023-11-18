
public class SwitchStatement {

	public static void main(String[] args) {
		char grade ='A';
		
		switch(grade) {
		
		case 'A':
			System.out.println("Outstanding");
			break;
		case 'B':
			System.out.println("Excellent");
			break;
		default:
			System.out.println("Invalid Grade!");
			
		}
	}

}

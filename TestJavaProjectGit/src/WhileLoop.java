
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String[] names = {"Daniel","John","Jake","Elmo","Arvin","Kent","Kara","Jasmine","Dana","Mika"};
		System.out.print("Search Names: ");
		String search = s.nextLine();
		
		int  i =0;
		boolean found = false;
		
		while(i<names.length) {
			if(names[i].equalsIgnoreCase(search)) {
				System.out.println("We found " + names[i]);
				found =true;
				break;
			}
			
			i++;
			
			if(!found) {
				System.out.println(search +" not found!");
			}
			
		}
		s.close();
		
		

	}

}

import java.util.Scanner;
public class ForEachLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Search Name: ");
		String search=s.nextLine();
		
		String[] famousPeople = {
				"Lebron",
				"Dwayne",
				"John",
				"Kobe",
				"Angelina",
				"Winona",
				"Jane"};
		boolean found =false;
		
		for(String fames:famousPeople) {
			if(fames.equalsIgnoreCase(search)) {
				System.out.println("We found "+fames);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println(search + " Not Found");
		}
		s.close();
		
		

	}

}

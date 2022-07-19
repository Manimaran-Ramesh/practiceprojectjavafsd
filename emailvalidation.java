package emailvalidation;
import java.util.ArrayList;
import java.util.Scanner;
public class emailvalidation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> gmail = new ArrayList<String>();
		gmail.add("sant@gmail.com");
		gmail.add("choco@gmail.com");
		gmail.add("master@gmail.com");
		gmail.add("cheese@gmail.com");
		gmail.add("cucumba@gmail.com");
		System.out.println("ENTER USER EMAIL ID:");
		String userId = input.nextLine();
		//check user mail id is found or not
			if (gmail.contains(userId)) {
				System.out.println();
				System.out.println("email ID " + userId + " found");
			} 
			else {
				System.out.println("email ID " + userId + " Not found");

			}
		}
	}
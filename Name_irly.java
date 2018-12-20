import java.util.Scanner;

public class Name_irly {
	public static void main(String args[]) {
		
		
		System.out.println(namePrompt());
	}
	
	
	
	
	public static String namePrompt() {
		Scanner userInput= new Scanner(System.in);
		System.out.println("Give me your name!");
		String theName = userInput.nextLine();
		return theName;
	}
	
	public static String upper(String theName) {
		theName = theName.toUpperCase();
		return theName;
	}
	
	
		
		
	
}

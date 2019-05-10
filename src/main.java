import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
	System.out.println("What is your name?");
	String userFirst = input.next();
	
	if (userFirst.toLowerCase().contentEquals("bob")) {
		System.out.println("not long enough! Try again!");
	}
	
	System.out.println("Try again!");
	String userFirsts = input.next();
	if (userFirsts.toLowerCase().contentEquals("bob")) {
		System.out.println(" ");
	}
	System.out.println("Still not long enough, try again!");
	String userFirstb = input.next();
	if (userFirstb.toLowerCase().contentEquals("bobby")) {
		System.out.println("Welcome, Bobby!");
	}
	
	}
}

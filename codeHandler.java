import java.util.Scanner;

public class codeHandler {	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Cups'R'Us\nMenu Options:\n1: Buy\n2: Sell\n3: Maintenance\n4: Inventory Report\n5: Logout");
		int input = scan.nextInt();
		if (input == 1) {
			System.out.println("What kind of cup would you like to create?\n1: Mug\n2: Glass\n3: Tumbler");
			buyCup();
		} else if (input == 2) {
			System.out.println("Which cup would you like to sell?");
			displayInventory(0);
		} else if(input == 3) {
			System.out.println("Which cup would you like to interact with?");
			displayInventory(0);
		} else if(input == 4) {
			System.out.println("Inventory report:");
			displayInventory(1);
		} else if(input == 5) return;
		else System.out.println("Please input a valid number");
	}

	private static void displayInventory(int Case) {
		
	}

	private static void buyCup() {

	}
}

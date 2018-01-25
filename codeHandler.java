import java.util.Scanner;

public class codeHandler {	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		boolean running = true;
		while(running) {
			System.out.println("Welcome to Cups'R'Us\nMenu Options:\n1: Buy\n2: Sell\n3: Maintenance\n4: Inventory Report\n5: Logout");
			int input = scan.nextInt();
			if (input == 1) {
				System.out.println("What kind of cup would you like to buy?\n1: Mug\n2: Glass\n3: Tumbler");
			} else if (input == 2) {
				System.out.println("Which cup would you like to sell?");
			} else if(input == 3) {
				System.out.println("Which cup would you like to interact with?");
			} else if(input == 4) {
				System.out.println("Inventory report:");
			} else if(input == 5) running = false;
			else System.out.println("Please input a valid number");
		}
	}

	public void buyMug() {

	}
	
	public void sellCup() {
		
	}
	
	public void maintenance() {
		
	}
	
	public void displayInventory() {
		
	}

}

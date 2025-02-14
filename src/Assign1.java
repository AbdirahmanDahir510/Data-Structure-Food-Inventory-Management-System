/**
 * CET - CS Academic Level 3
 * The class is the main class
 * Student Name: Abdirahman Dahir
 * Student Number:  041127063
 * Course: CST8130 - Data Structures
 * @author: Abdirahman Dahir
 * Professor: James Mwangi PhD. 
 * 
  */
import java.util.Scanner;
/**
 * This class is the driver of the FoodItem, Inventory
 * and the four subclasses of FoodItem
 */
public class Assign1 {

	/**
	 * Displays the options menu that the user is choosing from 
	 */
	public void displayMenu() {
		System.out.println("Please select one of the following");
		System.out.println("1. Add Item to the Inventory ");
		System.out.println("2. Display Current Inventory ");
		System.out.println("3. Buy Item(s)");
		System.out.println("4. Sell Item(s)");
		System.out.println("5. To Exit ");
	}
	/**
	 * This is the main method that reads from the user 
	 * and based on the user choice it connects to a method
	 * @param args
	 */
	public static void main(String[] args) {
		Assign1 agn1 = new Assign1();
		Inventory inventory = new Inventory();
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
	do {
		agn1.displayMenu();
		System.out.print("> ");
		
		//validating the input
		if(scanner.hasNextInt()) {
			choice = scanner.nextInt();
			 scanner.nextLine(); // Clear buffer after nextInt()
		}else {
			System.err.println("...Invalid input, please try again...");
			 scanner.nextLine(); // Clear buffer after nextInt()
			 continue; // Skip rest of loop and re-ask input
		}
	switch(choice){
		case 1: 
			inventory.addItem(scanner);
			break;
		case 2:
			System.out.println(inventory);
			break;
		case 3:
			inventory.updateQuantity(scanner, true);
			break;
		case 4:
			inventory.updateQuantity(scanner, false);
			break;
		case 5:
			System.out.println("Exiting....");
			scanner.close();
			break;
		default: System.out.println("..Invalid input please, try again...");
		break;
	}
	} while (choice != 5);
	scanner.close();

}

}

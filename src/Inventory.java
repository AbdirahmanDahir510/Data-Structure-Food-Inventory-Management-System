/**
 * CET - CS Academic Level 3
 * The Inventory class represents a collection of FoodItem objects
 * Student Name: Abdirahman Dahir
 * Student Number:  041127063
 * Course: CST8130 - Data Structures
 * @author: Abdirahman Dahir
 * Professor: James Mwangi PhD. 
 * 
  */
import java.util.Arrays;
import java.util.Scanner;
/**
 * collects the data in an array of foodItem object.
 */
public class Inventory  {
	private FoodItem [] inventory;
	private int numItems;
	
	/**
	 * The Inventory class represents a collection of FoodItem objects.
	 * It allows adding, updating, and managing food items in an inventory system.
	 */
	public Inventory() {
		this.inventory = new FoodItem[20];
		this.numItems = 0;
	}
	
	 /**
     * Checks if a given FoodItem already exists in the inventory.
     * 
     * @param item The FoodItem to check.
     * @return The index of the existing item in the inventory if found, or -1 if not found.
     */
	public int alreadyExists(FoodItem item) {
		for (int i = 0; i < numItems; i++) {
            if (inventory[i].equals(item)) {
                return i;
            }
        }
        return -1;
		
	}
	
	/**
     * Adds a new FoodItem to the inventory based on user input.
     * The user chooses between Fruit, Vegetable, or Preserve.
     * 
     * @param scanner The Scanner object used for user input.
     * @return true if the item was added successfully, false otherwise.
     */
	public boolean addItem(Scanner scanner) {
		String option = null;
		
		 do {
		        System.out.print("Do you wish to add a Fruit (f), Vegetable (v), Preserve (p), or Dairy (d)? ");
		        option = scanner.next().toLowerCase(); // Read input

		        if (!option.equals("f") && !option.equals("v") && !option.equals("p") && !option.equals("d")) {
		            System.out.println("Invalid input.");
		        }
		    } while (!option.equals("f") && !option.equals("v") && !option.equals("p") && !option.equals("d"));

			FoodItem items = null;
			//uses polymorphism to call addItem method in the correct derived FoodItem class
			switch(option) {
			case "f": 
				items = new Fruit();
				break;
			case "v": 
				items = new Vegetables();
				break;
			case "p":
				items = new Preserve();
				
				break;
			case "d":
				items = new DairyFood();
				break;
			default: System.out.println("Invalid input");
			return false;
			}
		if(items != null && items.addItem(scanner)) {
			inventory[numItems] = items; //stores the item in the array
			numItems++;
			return true;
		}
		return false;
	}
	
	/**
     * Updates the quantity of a specific FoodItem in the inventory.
     * Allows the user to buy or sell an item based on the item code.
     * 
     * @param scanner   The Scanner object used for user input.
     * @param buyOrSell A boolean flag where true represents buying and false represents selling.
     * @return true if the quantity update was successful, false otherwise.
     */
	public boolean updateQuantity(Scanner scanner, boolean buyOrSell) {
		
		if(numItems == 0 ||inventory == null) {
			System.out.println(buyOrSell ? "Error...could not buy item" : "Error...could not sell item");
			return false;
		}
		System.out.print("Enter the code for the item: ");
		int code = scanner.nextInt();
		
		for(int i=0; i<numItems; i++) {
			if(inventory[i].getItemCode() == code) {
				if(buyOrSell) {//buying items
					System.out.print("Enter valid quantity to buy: ");
					int amount = scanner.nextInt();
					if(amount > 0 ) {
						inventory[i].updateItem(amount);
						return true;
					}else {
						return false;
					}
				}else {
					System.out.print("Enter the quantity to sell: ");
					int sellingAmount = scanner.nextInt();
					
					 if (sellingAmount > inventory[i].itemQuantityInStock) {
		                    System.out.println("Error...could not sell item");
		                    return false;
		                }
					 
					if(sellingAmount > 0 ) {
						inventory[i].updateItem(-sellingAmount);
						return true;
					}else {
						return false;
					}
					
				}
			}
			
		}
		System.out.println(buyOrSell ? "Error...could not buy item" : "Error...could not sell item");
		return false;
		
	}
	 /**
     * Returns a string representation of the inventory, listing all stored FoodItems.
     * 
     * @return A formatted string containing the inventory details.
     */
	@Override
	public String toString() {
		String display ="Inventory: \n";
		for (int i = 0; i < numItems; i++) { // Loops through inventory
	        display += "Items: " + inventory[i].toString() + "\n";
	    }
		return display;
	}
	
	
	
	
	
}

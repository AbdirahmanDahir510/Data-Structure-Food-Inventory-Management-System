
/**
 * CET - CS Academic Level 3
 * This class is the Parent of Vege, Fruit, Preserve and collects the main data
 * from the user and also validates it.
 * Student Name: Abdirahman Dahir
 * Student Number:  041127063
 * Course: CST8130 - Data Structures
 * @author: Abdirahman Dahir
 * Professor: James Mwangi PhD. 
 * 
  */
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The FoodItem class represents an item in an inventory system.
 * It includes details such as item code, name, quantity in stock, cost, and price.
 */
public class FoodItem {
	private int itemCode;
	private String itemName;
	private float itemPrice;
	public int itemQuantityInStock;
	private float itemCost;
	/**
     * Default constructor for FoodItem.
     */
	public FoodItem() {
	}

	/**
     * Retrieves the item code.
     * 
     * @return The item code as an integer.
     */
	public int getItemCode() {
		return itemCode;
	}

	 /**
     * Updates the quantity of the item in stock.
     * Ensures that the quantity does not drop below zero.
     * 
     * @param amount The amount to add (positive) or remove (negative).
     * @return true if the update was successful, false if it would result in negative stock.
     */
	public boolean updateItem(int amount) {
		if (itemQuantityInStock + amount >= 0) {
			itemQuantityInStock += amount;
			return true;
		}else
		return false; // Prevents negative stock
	}

	/**
     * Checks if two FoodItem objects have the same item code.
     * 
     * @param item The FoodItem to compare against.
     * @return true if the item codes match, false otherwise.
     */
	public boolean isEqual(FoodItem item) {
		return this.itemCode == item.itemCode;
		/*
		 * this.itemCode refers to the itemCode of the current object. item.itemCode
		 * refers to the itemCode of the FoodItem object passed as a parameter.
		 */
	}

	 /**
     * Adds a new food item by taking user input for its details.
     * Ensures valid input for item code, name, quantity, cost, and price.
     * 
     * @param scanner The Scanner object used for user input.
     * @return true if the item was added successfully, false otherwise.
     */
	public boolean addItem(Scanner scanner) {
		scanner.nextLine();
        // Validating of the item Code
        while (true) {
            System.out.print("Enter the code for the item: ");
            String code = scanner.nextLine().trim();

            try {
                itemCode = Integer.parseInt(code);
                break; // Exit loop if valid integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid code");
            }
        }

        // Item name
        System.out.print("Enter the name for the item: ");
        itemName = scanner.nextLine();

        // Validating the item Quantity in stock
        while (true) {
            System.out.print("Enter the quantity for the item: ");
            String quantityInput = scanner.nextLine().trim();

            try {
                itemQuantityInStock = Integer.parseInt(quantityInput);
                if (itemQuantityInStock >= 0) break; // Exit loop if valid non-negative integer
                System.out.println("Invalid entry");
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry");
            }
           
        }

        // Validating the item Cost
        while (true) {
            System.out.print("Enter the cost of the item: ");
            String costInput = scanner.nextLine().trim();

            try {
                itemCost = Float.parseFloat(costInput);
                if (itemCost >= 0) break; 
                System.out.println("Invalid entry");
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry");
            }
        }

        // Validating the item Price
        while (true) {
            System.out.print("Enter the sales price of the item: ");
            String priceInput = scanner.nextLine().trim();

            try {
                itemPrice = Float.parseFloat(priceInput);
                if (itemPrice >= 0) break; // Exit loop if valid non-negative float
                System.out.println("Invalid entry");
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry");
            }
        }

        return true; 
    }

	/**
     * Reads and sets the item code from user input.
     * 
     * @param scanner The Scanner object used for user input.
     * @return true if a valid integer was entered, false otherwise.
     */
	public boolean inputCode(Scanner scanner) {
		if (scanner.hasNextInt()) {
			itemCode = scanner.nextInt();
			return true;
		} else {
			System.out.println("Invalid Code ");
			return false;
		}
	}

	/**
     * Returns a formatted string representation of the FoodItem.
     * 
     * @return A string containing item details.
     */
	@Override
	public String toString() {
		return String.format("%s %s %d price: $%.2f cost: $%.2f", itemCode, itemName, itemQuantityInStock, itemPrice,
				itemCost);
	}

}

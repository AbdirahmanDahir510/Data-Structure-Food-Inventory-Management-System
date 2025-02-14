/**
 * CET - CS Academic Level 3
 * This class extends FoodItems, and it collects the suppliers name
 * Student Name: Abdirahman Dahir
 * Student Number:  041127063
 * Course: CST8130 - Data Structures
 * @author: Abdirahman Dahir
 * Professor: James Mwangi PhD. 
 * 
  */
import java.util.Scanner;

/**
 * Represents a vegetable food item, extending the FoodItem class.
 * This class includes additional information about the farm supplier.
 */
public class Vegetables extends FoodItem {
	private String farmName;
	
	 /**
     * Default constructor for the Vegetables class.
     */
	public Vegetables() {
	}
	
	  /**
     * Adds a vegetable item by gathering information from the user input.
     * Calls the superclass method to collect general item details and then
     * asks for the farm name.
     * 
     * @param scanner The Scanner object for user input.
     * @return true if the item is successfully added.
     */
    @Override
	public boolean addItem(Scanner scanner) {
		super.addItem(scanner);
		System.out.print("Enter the name of the farm supplier: ");
		farmName = scanner.nextLine();
		return true;
		
	}

	 /**
     * Returns a string representation of the vegetable item, including
     * its farm supplier name.
     * 
     * @return A formatted string with item details and farm name.
     */
	@Override
	public String toString() {
		return super.toString() + " Farm Name: "+ farmName ;
	}
	
	
	
}

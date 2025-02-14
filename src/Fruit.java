/**
 * CET - CS Academic Level 3
 * This class is a child of FoodItem and collects the Orchard Name
 * Student Name: Abdirahman Dahir
 * Student Number:  041127063
 * Course: CST8130 - Data Structures
 * @author: Abdirahman Dahir
 * Professor: James Mwangi PhD. 
 * 
  */
import java.util.Scanner;

/**
 * Represents a fruit item in the inventory, extending the FoodItem class.
 * This class includes additional information about the orchard supplier.
 */
public class Fruit extends FoodItem{
	private String orchardName;
	
	public Fruit() {
		
	}
	/**
     * Adds a fruit item by gathering information from the user input.
     * Calls the superclass method to collect general item details and then
     * asks for the orchard supplier name.
     * 
     * @param scanner The Scanner object for user input.
     * @return true if the item is successfully added.
     */
    @Override
	public boolean addItem(Scanner scanner) {
		super.addItem(scanner);
		System.out.print("Enter the name of the orchard supplier: ");
		orchardName = scanner.nextLine();
		return true;
		
	}
	
    /**
     * Returns a string representation of the fruit item, including
     * its orchard supplier information.
     * 
     * @return A formatted string with item details and orchard supplier name.
     */
    @Override
	public String toString() {
		return super.toString() + " orchard supplier: " + orchardName;
	}
}

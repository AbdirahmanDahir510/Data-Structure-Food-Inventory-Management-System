/**
 * CET - CS Academic Level 3
 * This class extends FoodItems, and collects the size of the jar in mili
 * Student Name: Abdirahman Dahir
 * Student Number:  041127063
 * Course: CST8130 - Data Structures
 * @author: Abdirahman Dahir
 * Professor: James Mwangi PhD. 
 * 
  */
import java.util.Scanner;

/**
 * Represents a preserved food item stored in jars, extending the FoodItem class.
 * This class includes additional information about the jar size in milliliters.
 */
public class Preserve extends FoodItem{
	private int jarSize;
	
	/**
     * Default constructor for the Preserve class.
     */
	public Preserve() {
		
	}
	
    /**
     * Adds a preserve item by gathering information from the user input.
     * Calls the superclass method to collect general item details and then
     * asks for the jar size in milliliters.
     * 
     * @param scanner The Scanner object for user input.
     * @return true if the item is successfully added.
     */
    @Override
	public boolean addItem(Scanner scanner) {
		super.addItem(scanner);
		System.out.print("Enter the size of the jar in millilitres:  ");
		jarSize = scanner.nextInt();
		return true;
		
	}
    
    /**
     * Returns a string representation of the preserved food item, including
     * its jar size.
     * 
     * @return A formatted string with item details and jar size.
     */
    @Override
	public String toString() {
		return super.toString() + " size: " + jarSize + "mL";
	}
}

/**
* CET - CS Academic Level 3
 * Dairy Farm name
 * Student Name: Abdirahman Dahir
 * Student Number:  041127063
 * Course: CST8130 - Data Structures
 * @author: Abdirahman Dahir
 * Professor: James Mwangi PhD. 
 * 
  */
import java.util.Scanner;

/**
 * This class checks for Dairy Farm name 
 */
public class DairyFood extends FoodItem{
	private String DairyFarm;
	private int glassSize;
	
	
/**
 * This class reads the countryName from the  user and 
 * adds it to the addItem
 */
	@Override
	public boolean addItem(Scanner scanner) {
		super.addItem(scanner);
		System.out.print("Enter the glass size in mL: ");
		glassSize = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("Enter the Dairy farm name: ");
		DairyFarm = scanner.nextLine();
		return true;
	}
	
	  /**
     * Returns a string representation of the fruit item, including
     * its orchard supplier information.
     * 
     * @return A formatted string with item details and the Dairy Farm name.
     */
    @Override
	public String toString() {
		return super.toString() + " glass size: " + glassSize + "mL" + " Dairy Farm name: " + DairyFarm;
	}
	
}

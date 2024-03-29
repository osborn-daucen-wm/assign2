/**
 * 
 * @author Daucen Osborn #1212941663
 * @version 2.0
 * Class# 85141
 * Assignment #2
 * Description: The purpose of this program is to practice version control
 *  systems and to create a program that calculates inputed values
 *  and keeps track of them.
 */

package cse360assign2;

public class AddingMachine {

	/**
	 * Initialize variables of total and the string to be displayed.
	 */
	private int total;
	private String displayedNumber = "0";
	
	/**
	 * 
	 * Set total variable.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * @return total  Returns value of the total variable at the current time.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * 
	 * @param value  Adds the parameter to the 'total' variable.
	 */
	public void add (int value) {
		
		total += value;
		
		displayedNumber = displayedNumber + " + " + value;
				
	}
	
	/**
	 * 
	 * @param value  Subtracts the value from the 'total' variable.
	 */
	public void subtract (int value) {
		
		total -= value;
		
		displayedNumber = displayedNumber + " - " + value;
				
	}
		
	/**
	 * 
	 * @return String  Shows the work of the calculator to be printed.
	 */
	public String toString () {
		
		return displayedNumber;
	
	}

	/**
	 * 
	 * Resets the total value to 0 so a new value can be calculated.
	 */
	public void clear() {
		total = 0;
		displayedNumber = "0";
	}
}

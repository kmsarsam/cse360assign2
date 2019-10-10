/* Author: Kamila Sarsam
 * Class ID: CSE 360
 * Assignment: 2
 * Description: This class takes in a values and performs
 * operations on the total value */

package cse360assign2;

public class AddingMachine {

	private int total;
	private String history = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		history += " + " + value;
		total += value;
	}
	
	public void subtract (int value) {
		history += " - " + value;
		total -= value;
	}
		
	public String toString () {
		return history;
	}

	public void clear() {
		total = 0;
		history = "0";
	
	}
}

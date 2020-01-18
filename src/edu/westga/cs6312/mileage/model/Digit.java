package edu.westga.cs6312.mileage.model;
/**
 * This class will model a single digit in an odometer.
 * 
 * @author J. Allen Burton
 * @version Jan 18, 2020
 *
 */

public class Digit {
	private int currentValue;
	static final int MAX_VALUE = 9;

	/**
	 * Class constructor which initializes digit to zero
	 * 
	 * @precondition	none
	 */
	public Digit() {
		this.currentValue = 0;
	}
	
	/**
	 * This method gets the current value of the digit
	 * 
	 * @return	current value of the digit
	 * @precondition	none
	 */
	public int getValue() {
		return this.currentValue;
	}
}

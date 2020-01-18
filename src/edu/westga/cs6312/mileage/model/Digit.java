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
	
	/**
	 * This method will advance the digit by one position.  Note that
	 * if the digit is currently 9, then the digit rolls over to zero.
	 * 
	 * @precondition	none
	 */
	public void increment() {
		if (this.currentValue == MAX_VALUE) {
			this.currentValue = 0;
		} else {
			this.currentValue++;
		}
	}
}

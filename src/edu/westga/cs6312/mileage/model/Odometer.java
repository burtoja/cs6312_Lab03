package edu.westga.cs6312.mileage.model;

/**
 * This class will model 4 digit odometer
 * 
 * @author J. Allen Burton
 * @version Jan 18, 2020
 *
 */
public class Odometer {
	private Digit[] digitArray;

	/**
	 * Constructor for Odometer objects. Creates a 4 digit odometer set at 000.0
	 * 
	 * @precondition none
	 */
	public Odometer() {
		this(0, 0, 0, 0);
	}

	/**
	 * Constructor for Odometer objects. Creates a 4 digit odometer set using the
	 * digits supplied in the parameters. Any digit falling outside of 0-9 inclusive
	 * will cause the odometer to be set at the default value of 000.0.
	 * 
	 * @param hundredsPlaceDigit int to represent the hundreds place in the initial
	 *                           odometer reading
	 * @param tensPlaceDigit     int to represent the tens place in the initial
	 *                           odometer reading
	 * @param onesPlaceDigit     int to represent the ones place in the initial
	 *                           odometer reading
	 * @param decimalDigit       int to represent the tenths (decimal) place in the
	 *                           initial odometer reading
	 * 
	 * @precondition hundredsPlaceDigit >= 0 && hundredsPlaceDigit < 10 (handled in
	 *               setDigitValue method)
	 * @precondition tensPlaceDigit >= 0 && hundredsPlaceDigit < 10 (handled in
	 *               setDigitValue method)
	 * @precondition onesPlaceDigit >= 0 && hundredsPlaceDigit < 10 (handled in
	 *               setDigitValue method)
	 * @precondition decimalDigit >= 0 && hundredsPlaceDigit < 10 (handled in
	 *               setDigitValue method)
	 */
	public Odometer(int hundredsPlaceDigit, int tensPlaceDigit, int onesPlaceDigit, int decimalDigit) {
		this.digitArray = new Digit[4];
		if (this.validateDigitInputValue(hundredsPlaceDigit) && this.validateDigitInputValue(tensPlaceDigit)
				&& this.validateDigitInputValue(onesPlaceDigit) && this.validateDigitInputValue(decimalDigit)) {
			this.setDigitValue(0, hundredsPlaceDigit);
			this.setDigitValue(1, tensPlaceDigit);
			this.setDigitValue(2, onesPlaceDigit);
			this.setDigitValue(3, decimalDigit);
		} else {
			this.setDigitValue(0, 0);
			this.setDigitValue(1, 0);
			this.setDigitValue(2, 0);
			this.setDigitValue(3, 0);
		}
	}

	/**
	 * This helper method validates that an input parameter is an integer 0-9
	 * inclusive
	 * 
	 * @param digitValue input digit value
	 * @return true if value is an integer 0-9 inclusive
	 */
	private boolean validateDigitInputValue(int digitValue) {
		return (digitValue >= 0 && digitValue < 10);
	}

	/**
	 * This helper method sets a specified digit to a specified value on the
	 * odometer. Digits are ordered from left to right begining with digit 0 (i.e.
	 * digit 0 is the hundreth place for a 4 digit odometer: xxx.x). If the digit
	 * position is not a value 0-3 (inclusive) then the method will not create a
	 * digit. If the digit value is not a number 0-9 (inclusive) then the digit will
	 * be set at zero.
	 * 
	 * @param digitPosition
	 * @param digitValue
	 * 
	 * @precondition digitPosition >= 0 && digitPosition < 4 (not externally
	 *               determined so no check needed)
	 * @precondition digitValue >= 0 && digitValue < 10
	 */
	private void setDigitValue(int digitPosition, int digitValue) {
		this.digitArray[digitPosition] = new Digit();
		for (int currentDigitValue = 0; currentDigitValue < digitValue; currentDigitValue++) {
			this.digitArray[digitPosition].increment();
		}
	}

	/**
	 * Method to return a string containing a message stating the current odometer
	 * reading
	 * 
	 * @return String containing a statement including the current odometer reading
	 * 
	 * @precondition none
	 */
	public String toString() {
		String odometerDigitsString = "";
		for (Digit value : this.digitArray) {
			odometerDigitsString += value.getValue();
		}
		odometerDigitsString = odometerDigitsString.substring(0, (odometerDigitsString.length() - 1)) + "."
				+ odometerDigitsString.substring((odometerDigitsString.length() - 1), odometerDigitsString.length());
		return "Odometer with mileage " + odometerDigitsString;
	}

	/**
	 * This method will cause the specified dial on the odometer to advance the
	 * number of turns specified. The position references dials from left with 0
	 * being the left-most dial. Dials to the right are unaffected but dials to the
	 * left are incremented appropriately as the current dial rolls over from 9 to
	 * 0.
	 * 
	 * @param position      references which dial to turn (0 is left-most dial)
	 * @param numberOfTurns how many turns to advance the dial
	 * 
	 * @precondition positions >= 0 && position < 4
	 * @precondition numberOfTurns >= 0
	 */
	public void incrementDigit(int position, int numberOfTurns) {
		if (position < 0 || position >= 4) {
			return;
		}
		for (int incrementLevel = 0; incrementLevel < numberOfTurns; incrementLevel++) {
			this.digitArray[position].increment();
			if (this.digitArray[position].getValue() == 0 && position != 0) {
				this.incrementDigit((position - 1), 1);
			}
		}
	}

	/**
	 * This method will cause the specified dial on the odometer to roll back the
	 * number of turns specified. The position references dials from left with 0
	 * being the left-most dial. Dials to the right are unaffected but dials to the
	 * left are decremented appropriately as the current dial rolls over from 0 back
	 * to 9.
	 * 
	 * @param position      references which dial to turn (0 is left-most dial)
	 * @param numberOfTurns how many turns to advance the dial
	 * 
	 * @precondition position >= 0 && position < 4
	 * @precondition numberOfTurns >= 0
	 */
	public void decrementDigit(int position, int numberOfTurns) {
		if (position < 0 || position >= 4) {
			return;
		}
		for (int incrementLevel = 0; incrementLevel < numberOfTurns; incrementLevel++) {
			this.digitArray[position].decrement();
			if (this.digitArray[position].getValue() == 9 && position != 0) {
				this.decrementDigit((position - 1), 1);
			}
		}
	}

}

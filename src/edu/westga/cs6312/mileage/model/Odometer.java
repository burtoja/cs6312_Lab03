package edu.westga.cs6312.mileage.model;

import java.text.DecimalFormat;

/**
 * This class will model 4 digit odometer
 * 
 * @author J. Allen Burton
 * @version Jan 18, 2020
 *
 */
public class Odometer {
	private Digit[] digitArray;
	
	public Odometer() {
		this.digitArray = new Digit[4];
		for (int currentDigit = 0; currentDigit < this.digitArray.length; currentDigit++) {
			this.digitArray[currentDigit] = new Digit();
		}
	}
	
	/**
	 * Method to return a string containing a message stating the current odometer reading
	 * 
	 * @return String containing a statement including the current odometer reading
	 * @precondition	none
	 */
	public String toString() {
		String odometerDigitsString = "";
		for (int currentPosition = 0; currentPosition < this.digitArray.length; currentPosition++) {
			if (currentPosition == (this.digitArray.length - 1)) {
				odometerDigitsString += ".";
			}
			odometerDigitsString += this.digitArray[currentPosition].getValue();
		}
		return "Odometer with mileage " + odometerDigitsString;
		
		
		/*
		for (Digit value : this.digitArray) {
			odometerDigitsString += value.getValue();
		}
		Double odometerReading = Double.parseDouble(odometerDigitsString);
		DecimalFormat decim = new DecimalFormat("000.0");
		return "Odometer with mileage " + decim.format(odometerReading);
		*/
	}
}

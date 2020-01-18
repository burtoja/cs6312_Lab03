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
	
	/**
	 * Constructor for Odometer objects.  Creates a 4 digit odometer set at 000.0
	 * 
	 * @precondition	none
	 */
	public Odometer() {
		this(0, 0, 0, 0);
	}
	
	/**
	 *  Constructor for Odometer objects.  Creates a 4 digit odometer set using 
	 * the digits supplied in the paramaters.
	 * 
	 * @param hundredsPlaceDigit	int to represent the hundreds place in the initial odometer reading
	 * @param tensPlaceDigit		int to represent the tens place in the initial odometer reading
	 * @param onesPlaceDigit		int to represent the ones place in the initial odometer reading
	 * @param decimalDigit			int to represent the tenths (decimal) place in the initial odometer reading
	 * 
	 * @precondition	hundredsPlaceDigit >= 0 && hundredsPlaceDigit < 10
	 * @precondition	tensPlaceDigit >= 0 && hundredsPlaceDigit < 10
	 * @precondition	onesPlaceDigit >= 0 && hundredsPlaceDigit < 10
	 * @precondition	decimalDigit >= 0 && hundredsPlaceDigit < 10
	 */
	public Odometer(int hundredsPlaceDigit, int tensPlaceDigit, int onesPlaceDigit, int decimalDigit) {
		this.digitArray = new Digit[4];
		this.setDigitValue(0, hundredsPlaceDigit);		
		this.setDigitValue(1, tensPlaceDigit);	
		this.setDigitValue(2, onesPlaceDigit);	
		this.setDigitValue(3, decimalDigit);	
	}
	
	/**
	 * This helper method sets a specified digit to a specified value on the odometer.  Digits
	 * are ordered from left to right begining with digit 0 (i.e. digit 0 is the hundreth place
	 * for a 4 digit odometer: xxx.x) 
	 * 
	 * @param digitPosition
	 * @param digitValue
	 * 
	 * @precondition	digitPosition < 4
	 * @precondition	digitValue >= 0 && digitValue < 10
	 */
	private void setDigitValue(int digitPosition, int digitValue) {
		this.digitArray[digitPosition] = new Digit();
		for (int currentDigitValue = 0; currentDigitValue < digitValue; currentDigitValue++) {
			this.digitArray[digitPosition].increment();
		}
	}
	
	/**
	 * Method to return a string containing a message stating the current odometer reading
	 * 
	 * @return String containing a statement including the current odometer reading
	 * 
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

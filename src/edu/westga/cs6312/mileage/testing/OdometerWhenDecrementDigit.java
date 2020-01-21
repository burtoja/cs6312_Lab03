package edu.westga.cs6312.mileage.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.mileage.model.Odometer;

/**
 * This JUnit test class will test the decrementDigit method in the Odometer
 * class
 * 
 * @author J. Allen Burton
 * @version Jan 20, 2020
 *
 */
public class OdometerWhenDecrementDigit {

	/**
	 * Test to be sure decrementDigit rolls back the 100s place on a Odometer set to
	 * 000.0 by 4 turns showing 600.0
	 */
	@Test
	public void test100sPlaceStartAt0000DecrementBy4ShouldHave6000() {
		Odometer theOdometer = new Odometer();
		theOdometer.decrementDigit(0, 4);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 600.0", value);
	}

	/**
	 * Test to be sure decrementDigit rolls back the 10ths (decimal) place on a
	 * Odometer set to 000.0 by 4 turns showing 999.6
	 */
	@Test
	public void test10thsPlaceStartAt0000DecrementBy4ShouldHave9996() {
		Odometer theOdometer = new Odometer();
		theOdometer.decrementDigit(3, 4);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 999.6", value);
	}

	/**
	 * Test to be sure decrementDigit rolls back the ones place on a Odometer set to
	 * 000.0 by 4 turns showing 996.0
	 */
	@Test
	public void test1sPlaceStartAt0000DecrementBy4ShouldHave9960() {
		Odometer theOdometer = new Odometer();
		theOdometer.decrementDigit(2, 4);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 996.0", value);
	}

	/**
	 * Test to be sure decrementDigit rolls back the 10ths (decimal) place on a
	 * Odometer set to 000.0 by 12 turns showing 998.8
	 */
	@Test
	public void test10thsPlaceStartAt0000DecrementBy4ShouldHave9988() {
		Odometer theOdometer = new Odometer();
		theOdometer.decrementDigit(3, 12);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 998.8", value);
	}

	/**
	 * Test to be sure decrementDigit rolls back the 100s place on a Odometer set to
	 * 000.0 by 12 turns showing 800.0
	 */
	@Test
	public void test100sPlaceStartAt0000DecrementBy12ShouldHave2000() {
		Odometer theOdometer = new Odometer();
		theOdometer.decrementDigit(0, 12);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 800.0", value);
	}

	/**
	 * Test to be sure decrementDigit rolls back the 10ths place on a Odometer set
	 * to 000.0 by 5678 (large number affecting all dials) turns showing 432.2
	 */
	@Test
	public void test100sPlaceStartAt0000DecrementBy5678ShouldHave4322() {
		Odometer theOdometer = new Odometer();
		theOdometer.decrementDigit(3, 5678);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 432.2", value);
	}

	/**
	 * Test to be sure decrementDigit rolls back the 10ths place on a Odometer set
	 * to 000.0 by 5678 (large number affecting all dials) turns showing 432.2
	 */
	@Test
	public void test100sPlaceStartAt0000DecrementBy25678ShouldHave4322() {
		Odometer theOdometer = new Odometer();
		theOdometer.decrementDigit(3, 25678);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 432.2", value);
	}

	/**
	 * Test to be sure decrementDigit rolls back the 10s place on a Odometer set to
	 * 555.5 by 4 turns showing 515.5
	 */
	@Test
	public void test10sPlaceStartAt5555DecrementBy4ShouldHave5155() {
		Odometer theOdometer = new Odometer(5, 5, 5, 5);
		theOdometer.decrementDigit(1, 4);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 515.5", value);
	}

	/**
	 * Test to be sure decrementDigit by zero does not move the dial. This test uses
	 * the 100s place on a Odometer set to 555.5 by 0 turns showing 555.5
	 */
	@Test
	public void test100sPlaceStartAt5555DecrementBy0ShouldHave5555() {
		Odometer theOdometer = new Odometer(5, 5, 5, 5);
		theOdometer.decrementDigit(0, 0);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 555.5", value);
	}

	/**
	 * Test of precondition. Odometer set at 555.5. Given dial -1. Odometer should
	 * stay at 555.5.
	 */
	@Test
	public void testPreconditionOdometerSetAt5555ChooseDialNeg1ShouldHave5555() {
		Odometer theOdometer = new Odometer(5, 5, 5, 5);
		theOdometer.decrementDigit(-1, 8);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 555.5", value);
	}

	/**
	 * Test upperlimit to be sure decrementDigit by 4 on the 100s place on an
	 * Odometer starting at 999.9 results in 599.9
	 */
	@Test
	public void test100sPlaceStartAt9999DecrementBy4ShouldHave5999() {
		Odometer theOdometer = new Odometer(9, 9, 9, 9);
		theOdometer.decrementDigit(0, 4);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 599.9", value);
	}

	/**
	 * Test upperlimit to be sure decrementDigit by 4 on the 10ths place on an
	 * Odometer starting at 999.9 results in 999.5
	 */
	@Test
	public void test100sPlaceStartAt9999DecrementBy4ShouldHave9995() {
		Odometer theOdometer = new Odometer(9, 9, 9, 9);
		theOdometer.decrementDigit(3, 4);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 999.5", value);
	}

}

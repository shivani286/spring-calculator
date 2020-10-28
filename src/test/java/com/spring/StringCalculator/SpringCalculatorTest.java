package com.spring.StringCalculator;

import static org.junit.Assert.*;
import org.junit.Test;


/**
 * @author Shivani Thakur
 **/

public class SpringCalculatorTest {
	
	
/*	1) Create a simple String calculator with a method signature:
		———————————————
		int Add(string numbers)
		———————————————
		The method can take up to two numbers, separated by commas, and will return their sum. 
		for example “” or “1” or “1,2” as inputs.
		(for an empty string it will return 0) 
		Hints:
		——————
		 - Start with the simplest test case of an empty string and move to one and two numbers
		 - Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
		 - Remember to refactor after each passing test*/
	@Test
	public final void returnZeroOnEmptytSring() {
	   assertEquals(0, SpringCalculator.add(""));
	}
	
	@Test
	public final void returnNumberOnNumber() {
	   assertEquals(1, SpringCalculator.add("1"));
	}
	
	@Test
	public final void returnSumOfTwoNumberSeparatedByCommas() {
	   assertEquals(3, SpringCalculator.add("1,2"));
	}
	
/*	2. Allow the Add method to handle an unknown amount of numbers*/
	
	@Test
	public final void returnUnknownAmountOfNumbers() {
	   assertEquals(6, SpringCalculator.add("1,2,3"));
	}
	
/*	3) Allow the Add method to handle new lines between numbers (instead of commas).
	     1)the following input is ok: “1\n2,3” (will equal 6)*/

	@Test
	public final void returnHandleNewLinesBetweenNumbers() {
		assertEquals(6, SpringCalculator.add("1\n2,3"));
	}
	
}

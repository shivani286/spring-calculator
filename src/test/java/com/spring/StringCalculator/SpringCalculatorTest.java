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
	
/*	4) Support different delimiters
		1) To change a delimiter, the beginning of the string will contain a separate line that looks like this:
	 “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’.*/
	
	@Test
	public final void returnDifferentDelimiters() {
	   assertEquals(6, SpringCalculator.add("//;\n1;2;3"));
	}
	
	
/*  5) Calling Add with a negative number will throw an exception 
	    “negatives not allowed” - and the negative that was passed. 
		 if there are multiple negatives, show all of them in the exception message.*/
	
	@Test
	public final void returnNegativeNumbersRuntimeExceptionIsThrown() {
		try {
			SpringCalculator.add("3,-6,15,-18,46,33");
		} catch (RuntimeException e) {	
			assertEquals("Negatives not allowed: [-6, -18]", e.getMessage());
		}
	}
	
/*	6) Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2*/
	
    @Test
    public final void returnSumOfNumbersAreBiggerThan1000() {
        assertEquals(1009, SpringCalculator.add("3,1000,1001,6,1234"));
    }
    
/*  7) Delimiters can be of any length with the following format: 
 		“//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6*/    
    
    @Test
	public final void returnSumAnyLenghtWithDelimiters() {
	   assertEquals(6, SpringCalculator.add("//***\n1***2***3"));
	}
    
/*  8) Allow multiple delimiters like this: “//[delim1][delim2]\n” for example “//[*][%]\n1*2%3” should return 6.*/
    
    @Test
    public void shouldAllowDifferentDelimitersWithMoreThanOneCharAndMoreThanOneConsecutive(){
        assertEquals(6, SpringCalculator.add("//[*][%]\\n1*2%3"));
    }

}

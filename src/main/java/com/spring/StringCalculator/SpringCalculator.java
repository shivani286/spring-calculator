package com.spring.StringCalculator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Shivani Thakur
 **/

public class SpringCalculator {

	public static int add(String string) {

		if (string.isEmpty()) {
			return 0;
		} else {
			return delimiterWithString(string);
		}
	}

	private static int delimiterWithString(String string) {

		List<Integer> numbersList = removeStringDelimiterAndExtractNumbers(string);
		return sumOfNumber(numbersList);

	}

	private static List<Integer> removeStringDelimiterAndExtractNumbers(String string) {

		List<Integer> result = new LinkedList<Integer>();
		if (string != null && !string.isEmpty()) {
			Matcher matcher = Pattern.compile("-?\\d+").matcher(string);

			while (matcher.find()) {
				int number = Integer.parseInt(matcher.group());
				result.add(number);
			}
		}
		return result;
	}

	private static int sumOfNumber(List<Integer> numbersArray) {
		int sum = 0;
		List<Integer> negativeNumbers = new ArrayList<Integer>();
		
		for (Integer numberInt : numbersArray) {
			if (numberInt < 0) {
				negativeNumbers.add(numberInt);
			} else if (numberInt <= 1000) {
				sum += numberInt;
			}
		}

		if (negativeNumbers.size() > 0) {
			throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
		}
		
		return sum;
	}
}

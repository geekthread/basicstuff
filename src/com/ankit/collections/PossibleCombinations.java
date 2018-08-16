package com.ankit.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Generate all possible combinations of numbers. A number should be a valid
 * number
 * 
 ***************************
 * example 1: 2112 can be treated as **** 
 * a. (2)(1) (1) (2) 
 * b. (2) (1) (12)
 * c. (2) (11) (2)
 * d. (21) (1) (2) 
 * e. (21)(12)
 * 
 * and has as much as 5 possible combinations.
 ***************************
 * example : 24312 can be treated as 
 * a. (2) (4) (3) (1) (2)
 * b. (2) (4) (3) (12)
 * c. (2) (4) (31) (2) -- not a valid combination as 31 is greater than 26.Moving on. 
 * d. (2) (4) (31) (2) -- not a valid combination as 31 is greater than 26. Moving on.
 * e. (2) (43) (1) (2) -- not a valid combination as 43 is greater than 26. Moving on. 
 * f. (24) (3) (1) (2)
 * 
 * and has only 3 possible combinations
 * 
 * @author ankit.gupta1
 *
 */

/**
 * 
 * there should be iterations a. ShiftLeft And Find All elements b. ShiftRight
 * And Find All elements.
 * 
 * @author ankit.gupta1
 *
 */

public class PossibleCombinations {

	// private static Set<String> allNumbers = new HashSet<String>();
	private static List<String> allNumbers = new CopyOnWriteArrayList<String>();

	static long calculatePossibleCombinations(String input) {
		System.out.println("EVALUATING :-" + input);
		String[] tokens = input.split("");
		// int possibleCombinations = 0;

		switchElementPositionsAndCheck(tokens, allNumbers);
		// shift elements to the left

		// System.out.println(allNumbers);
		// System.out.println("Possible Combinations are: " +
		// allNumbers.size());
		reEvaluateOutput(allNumbers);
		System.out.println(allNumbers);
		return allNumbers.size();

	}

	private static void switchElementPositionsAndCheck(String[] tokens,
			List<String> allNumbers) {

		for (int index = 1; index <= tokens.length - 1; index++) {
			int elementAtPreviousIndex = Integer.parseInt(tokens[index - 1]);
			int elementAtCurrentIndex = Integer.parseInt(tokens[index]);
			int length1 = String.valueOf(elementAtPreviousIndex).length();
			int length2 = String.valueOf(elementAtCurrentIndex).length();

			if (length1 > 0 & length1 < 2 && length2 > 0 && length2 < 2) {
				int number = generateTwoDigitNumber(elementAtPreviousIndex,
						elementAtCurrentIndex);
				if (validateNumber(number)) {
					generateComination(number, index, index + 1, tokens,
							allNumbers, "left");
				}
			} else {
				return;
			}

		}
		// shift elements to the right
		for (int index = 1; index <= tokens.length - 1; index++) {

			int elementAtCurrentIndex = Integer.parseInt(tokens[index]);
			int elementAtNextIndex = (index == tokens.length - 1) ? -1
					: Integer.parseInt(tokens[index + 1]);

			int length1 = String.valueOf(elementAtCurrentIndex).length();
			int length2 = String.valueOf(elementAtNextIndex).length();
			if (length1 > 0 & length1 < 2 && length2 > 0 && length2 < 2) {
				int number = generateTwoDigitNumber(elementAtCurrentIndex,
						elementAtNextIndex);
				if (validateNumber(number)) {
					generateComination(number, index, index + 1, tokens,
							allNumbers, "right");
				}
			} else {
				return;
			}

		}

	}

	private static void reEvaluateOutput(List<String> allNumbers) {
		Iterator<String> keySetIterator = allNumbers.iterator();
		while (keySetIterator.hasNext()) {
			String element = keySetIterator.next();
			switchElementPositionsAndCheck(convertElementToArray(element),
					allNumbers);
		}

	}

	/**
	 * should generate all possible arrays from the input. If a number is 2
	 * digit then the method should split the number and perform switching.
	 * 
	 * @param element
	 * @return
	 */
	private static String[] convertElementToArray(String element) {
		System.out.println(element);

		String tokens[] = element.split("\\)\\(");
		String[] tempArr = new String[tokens.length];

		for (int i = 0; i < tokens.length; i++) {
			String refinedElement = tokens[i].replaceAll("\\(", "").replaceAll(
					"\\)", "");
			tempArr[i] = refinedElement;
		}

		return tempArr;

	}

	
	//TBO - to be optimized.
	private static void generateComination(int number, int actualIndex,
			int index, String[] tokens, List<String> allNumbers,
			String direction) {
		String output = "";
		// fetch previous entries
		String preOut = "";
		String temporaryOutput = "";

		if (direction.equals("left")) {
			if (actualIndex > 1) {
				for (int i = 0; i < actualIndex - 1; i++) {
					preOut = preOut + "(" + tokens[i] + ")";
				}
			}
		}
		if (direction.equals("right")) {
			if (actualIndex > 0) {
				for (int i = 0; i <= actualIndex - 1; i++) {
					preOut = preOut + "(" + tokens[i] + ")";
				}
			}
		}

		temporaryOutput = preOut + "(" + number + ")";

		if (direction.equals("left")) {
			for (int i = index; i <= tokens.length - 1; i++) {
				output = output + "(" + tokens[i] + ")";

			}
		} else {
			for (int i = index + 1; i <= tokens.length - 1; i++) {
				output = output + "(" + tokens[i] + ")";

			}
		}

		if (direction.equals("left")) {
			if (!allNumbers.contains(temporaryOutput + output)) {
				allNumbers.add(temporaryOutput + output);
			}
		}
		if (direction.equals("right")) {
			if (!allNumbers.contains(temporaryOutput + output)) {
				allNumbers.add(temporaryOutput + output);
			}
		}
		// System.out.println("Number is:->"+"("+number+")"+output);

	}

	/**
	 * generates a 2 digit number
	 * 
	 * @param elementAtPreviousIndex
	 *            - number at 10's place
	 * @param elementAtCurrentIndex
	 *            - number at 0's place
	 * @return
	 */
	private static int generateTwoDigitNumber(int elementAtPreviousIndex,
			int elementAtCurrentIndex) {
		int number = -1;
		if (elementAtCurrentIndex < 0) {
			number = elementAtCurrentIndex;
		} else {
			number = 10 * elementAtPreviousIndex + elementAtCurrentIndex;
		}
		return number;

	}

	/**
	 * validates if a number is valid alphabet. The number should be between 1
	 * and 26.
	 * 
	 * @param number
	 * @return
	 */
	private static boolean validateNumber(int number) {
		boolean isValidNumber = false;
		if (number >= 1 && number <= 26) {
			// System.out.println("number:-" + number);
			isValidNumber = true;

		} else if (number == 0 || number > 26) {
			System.err.println("Invalid Number: =" + number);
			isValidNumber = false;
		}
		return isValidNumber;

	}

	public static void main(String[] args) {
		// PossibleCombinations.calculatePossibleCombinations("2112");
		// PossibleCombinations.calculatePossibleCombinations("212");
		PossibleCombinations.calculatePossibleCombinations("226288");
		// PossibleCombinations.calculatePossibleCombinations("12345");

	}

}

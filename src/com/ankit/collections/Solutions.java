package com.ankit.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * GoldmanSachs interview question 1
 * Attempted on 28052017
 * @author ankit.gupta1
 *
 */

/*
 * Convert the input String to it's alphanumeric representation
 */

public class Solutions {
	/*
	 * Complete the function below.
	 */

	static String collapseString(String input) {
		String output = "";
		String[] array = input.split("");

		Map<String, Integer> elementOccurenceMap = new HashMap<String, Integer>();
		
		int count = 1;
		for (int index = 0; index <= array.length - 1; index++) {
			String element = array[index];
			if (elementOccurenceMap.containsKey(element.toLowerCase())) {
				count = elementOccurenceMap.get(element.toLowerCase()) + 1;
			} else {
				count = 1;
			}
			elementOccurenceMap.put(element.toLowerCase(), count);

		}

		System.out.println(elementOccurenceMap);

		return output;

	}

	public static void main(String[] args) {
		System.out.println(Solutions.collapseString("GGGGGrrrrrrrrrrrrrrtTttttTrR"));
		System.out.println(Solutions.collapseString("GrtGrTtTtT222T"));
	}
}

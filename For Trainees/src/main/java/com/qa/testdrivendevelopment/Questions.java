package com.qa.testdrivendevelopment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Write a function which takes 2 integers greater than 0, X,Y as input and
	 * generates a 2-dimensional array. The element value in the i-th row and j-th
	 * column of the array should be i*j. <br>
	 * Note: i=0,1.., X-1; j=0,1,¡­Y-1. <br>
	 * <br>
	 * For Example: <br>
	 * multiply(3,2) → [[0,0,0],[0,1,2]] <br>
	 * multiply(2,1) → [[0,0]] <br>
	 * multiply(3,4) → [[0,0,0],[0,1,2],[0,2,4],[0,3,6]]
	 */
	public int[][] multiply(int arrayLength, int numOfArrays) {
		int[][] multArray = new int[numOfArrays][arrayLength];
		for (int i = 0; i < numOfArrays; i++) {
			for (int j = 0; j < arrayLength; j++) {
				multArray[i][j] = i * j;
			}
		}
		return multArray;
	}// works

	/**
	 * Write a function that accepts a comma separated sequence of words as input
	 * and prints the words in a comma-separated sequence after sorting them
	 * alphabetically.
	 * 
	 * For Example: sortAlphabetically({"bag","car","dog"}) → {"bag","car","dog"}
	 * sortAlphabetically({"dog","car","bag"}) → {"bag","car","dog"}
	 * sortAlphabetically({"car","bark","bag","dog"}) → {"bag","bark","car","dog"}
	 */
	public String[] sortAlphabetically(String[] wordSequence) {
		List<String> wordList = Arrays.asList(wordSequence);
		Collections.sort(wordList);
		String[] sortedSequence = (String[]) wordList.toArray();
		return sortedSequence;
	}// works

	/**
	 * Write a function which takes an input, a, and returns the sum a+aa+aaa+aaaa.
	 * So if 2 was the input, the function should return 2+22+222+2222 which is
	 * 2468.
	 * 
	 * For Example: aPlus(5) → 6170 aPlus(9) → 11106
	 */
	public int aPlus(int num) {
		// convert int num to string and then back
		String a = String.valueOf(num);
		String sum = a + aa + aaa + aaaa;
		int finalSum = Integer.parseInt(sum);
		return finalSum;
	}

	/**
	 * Write a function which takes a string of numbers, separated by commas, and
	 * returns all the odd numbers as a string, separated by commas. If there are no
	 * odd numbers then the function should return "null".
	 * 
	 * Inputs will always be given in ascending order, eg "3,4,5". Outputs should
	 * also be given in ascending order.
	 * 
	 * For Example: oddNum("1,2,3,4,5") → "1,3,5" oddNum("2,4,6,8") → "null"
	 * oddNum("23,48,52,57") → "23,57"
	 */
	public String oddNum(String allNums) {
		int[] numArray = new int[allNums.length()];
		String odds = "";

		for (int i = 0; i < allNums.length(); i++) {
			numArray[i] = allNums.charAt(i);
			System.out.println(numArray[i]);
			if (numArray[i] % 2 == 1) {
				odds += numArray[i] + ", ";
			}
		}
		return odds;
	}

	/**
	 * Define a function that can accept two strings as input and returns the string
	 * of largest length
	 * 
	 * If two strings have the same length, then the function should return both
	 * strings separated by a single space. In this case, the strings should be
	 * returned in the same order in which they were given.
	 * 
	 * For Example: longString("hi","hello") → "hello" longString("three", "two") →
	 * "three" longString("three", "hello") → "three hello"
	 */
	public String longString(String input1, String input2) {
		int len1 = input1.length();
		int len2 = input2.length();
		String bigger = "";

		if (len1 > len2) {
			bigger = input1;
		} else if (len1 < len2) {
			bigger = input2;
		} else {
			bigger = input1 + " " + input2;
		}
		return bigger;
	}// works

	/**
	 * Given an email address person@company.com, and a parameter "person" or
	 * "company", write a function which returns the corresponding piece of
	 * information. Your function should ignore case.
	 * 
	 * For Example: email("john@google.com", "person") → "john"
	 * email("jane@Microsoft.com", "company") → "microsoft" email("Dave@amazon.com",
	 * "person") → "dave"
	 */
	public String email(String email, String parameter) {
		String result = "";
		if (parameter.equals("person")) {
			result = email.substring(0, email.indexOf("@"));
			result = result.toLowerCase();
		} else {
			result = email.substring(email.indexOf("@") + 1, email.indexOf("."));
			result = result.toLowerCase();
		}
		return result;
	}// works

	/**
	 * The fibonacci sequence is the sum of the last two numbers, with index 0 and 1
	 * having a value of 0 and 1 respectively
	 * 
	 * So fibonacci(5) is the sum of fibonacci(4) + fibonacci(3)
	 * 
	 * For Example: fibbonaci(0) → 0 fibbonaci(1) → 1 fibbonaci(2) → 1 fibbonaci(3)
	 * → 2 fibbonaci(4) → 3 fibbonaci(5) → 5 fibbonaci(8) → 21
	 */
	public int fibonacci(int num) {
		int fib = 1;
		if (num == 0) {
			fib = 0;
		}

		if (num == 1) {
			fib = 1;
		}

		int a = 1;
		int b = 1;
		for (int i = 2; i < num; i++) {
			fib = a + b;
			a = b;
			b = fib;
			System.out.println(fib);
		}
		return fib;
	}// works

	/**
	 * Write a function which, given a string input, returns a string which contains
	 * only the characters with odd indexes.
	 * 
	 * For Example: oddLetters("Sponge") → "pne" oddLetters("hi") → "i"
	 * oddLetters("0H1e2l3l4o5w6o7r8l9d") → "Helloworld"
	 */
	public String oddLetters(String input) {
		String oddStr = "";
		for (int i = 1; i < input.length(); i = i + 2) {
			oddStr += input.charAt(i);
		}
		return oddStr;
	}// works

	/**
	 * Write a function which solves the following puzzle. A farm has chickens and
	 * rabbits, and scanners are able to detect the number of heads and legs. How
	 * many chickens do we have, if we know the number of heads and legs? The values
	 * for 'heads' and 'legs' will be inputs. If there are no solutions to the
	 * puzzle, return null
	 * 
	 * For Example: chickenAndRabbits(35, 94) → 23 chickenAndRabbits(2, 6) → 1
	 * chickenAndRabbits(12,63) → null
	 */

	public Integer chickenAndRabbits(int heads, int legs) {
		Integer chickens = 0;
		if (legs % 4 != 0) {
			chickens = legs / 4;
		} else if (legs % 4 == 7.5) {
			chickens = null;
		}
		return chickens;
	}

	/**
	 * Write a function which checks the validity of a credit card number. The
	 * function should return a boolean, True if the card is valid, or False if it
	 * is not.
	 * 
	 * A credit card has a valid number if it satisfies the following criteria. - it
	 * must start with a 4, 5 or 6. - it must contain exactly 16 digits. - each
	 * digit must be 0-9 inclusive. - it may contain hyphens ("-"), to separate
	 * groups of 4 digits only, but it cannot contain any other characters. - it
	 * must not have 4 or more consecutive repeated digits.
	 * 
	 * For Example: validCard("4012-3456-7890-1234") → True
	 * validCard("0123-4567-8901-2345") → False validCard("401234567890123") → False
	 * validCard("4012 3456 7890 1234") → False validCard("4444-0123-4567-8901") →
	 * False validCard("4012345678901234") → True
	 */
	public boolean validCard(String cardNumber) {
		boolean isValid = false;
		if (cardNumber.length() == 16) {
			if (cardNumber.charAt(0) == 4 || cardNumber.charAt(0) == 5 || cardNumber.charAt(0) == 6) {
			}
		}
		return isValid;
	}
}
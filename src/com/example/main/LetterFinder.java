package com.example.main;

public class LetterFinder {

	public LetterFinder() {

	}

	/**
	 * Find the position of "chr" in "sentence"
	 * 
	 * Example: find 'a' in bcdefgabcdefg will return 7
	 * 
	 * @param sentence: In which we shall look for the letter
	 * @param chr: The chr we are looking for
	 * @return If we find the char, we will return the position in the sentence
	 *         (start with 1) If we can not find it or sentence is null or empty, it
	 *         will return -1.
	 */
	public int findLetter(String sentence, char chr) {
		char[] array = stringToCharArray(sentence);
		if (array == null) {
			return -1;
		}

		int ret = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == chr) {
				ret = i + 1;
				break;
			}
		}
		return ret;
	}

	/**
	 * Build char array from a string
	 * 
	 * @param text: The string that we input.
	 * @return: The char array that compose the string. or null if sentence is empty
	 *          or null
	 */
	char[] stringToCharArray(String text) {
		if (text == null || text.isEmpty()) {
			return null;
		}
		char[] ret = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			ret[i] = text.charAt(i);
		}
		return ret;
	}
}

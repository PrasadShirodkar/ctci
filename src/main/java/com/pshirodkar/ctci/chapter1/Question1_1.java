package com.pshirodkar.ctci.chapter1;

/**
 * Solution to Question 1.1
 *
 * @author pshirodkar
 */
public class Question1_1 {

	//Assume Unicode character set
	public static final int DEFAULT_CHARACTER_SET_LENGTH = 65535;

	private boolean[] c;

	Question1_1() {
		 c = new boolean[DEFAULT_CHARACTER_SET_LENGTH];
	}

	public boolean hasUniqueCharacters(String s) {

		if(s == null || s.length() == 0) {
			throw new IllegalArgumentException("Input cannot be null or size zero.");
		} else if (s.length() == 1) {
            return true;
        } else if (s.length() > c.length) {
			return false;
		} else {
			for(int i = 0; i < s.length(); i++) {
				int offset = s.charAt(i);
				if(c[offset]) {
					return false;
				} else {
					c[offset] = true;
				} 	
			}			
		}
		return true;
	}
}

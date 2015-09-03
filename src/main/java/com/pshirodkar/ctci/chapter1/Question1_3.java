package com.pshirodkar.ctci.chapter1;

/**
 * Solution to Question 1.3
 *
 * @author pshirodkar
 */
public class Question1_3 {

	public boolean isPermutation(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}

        int[] frequency = new int[65535];

        // Calculate the frequency of characters in s1
        for (int i = 0; i < s1.length(); i++) {
            int index = (int)s1.charAt(i);
            frequency[index]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            int index = (int)s2.charAt(i);
            if (frequency[index] == 0) {
                //Same or different character is found more than that in s1
                return false;
            }
            frequency[index]--;
        }
        return true;

	}

}
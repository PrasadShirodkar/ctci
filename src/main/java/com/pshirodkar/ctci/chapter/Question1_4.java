package com.pshirodkar.ctci.chapter;

/**
 * Solution to Question 1.4
 *
 * @author pshirodkar
 */
public class Question1_4 {
	
	public static String replaceAllSpaces(char[] ch, int n) {
		
		int spaceCount = 0;
		//count the number of spaces
		for (int i = 0; i < n; i++) {
			if (ch[i] == ' ') {
				spaceCount++;
			}			
		}
		
		//Start from the last non-space character to move the characters in the char array
		for (int i = n - 1; i >= 0; i--) {

            int offset = 2 * spaceCount;

			if (ch[i] != ' ') {
                // For every space character preceding the non-space character,
                // the non-space character moves forward by twice the space count.
				ch[i + offset] = ch[i];
			} else {
                ch[i + offset] = '0';
                ch[i + offset - 1] = '2';
                ch[i + offset - 2] = '%';
				spaceCount--;
			}	
		}
        return new String(ch);
	}

	public static void main(String[] args) {
		
		String s = "Mr John Smith    ";
		int n = 13;
		String t = Question1_4.replaceAllSpaces(s.toCharArray(), n);
		System.out.println(t);	
	}
}
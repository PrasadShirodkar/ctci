package com.pshirodkar.ctci.chapter1;

/**
 * Solution to Question 1.5
 *
 * @author pshirodkar
 */
public class Question1_5 {

	public static String compress(String s) {
		
		String compressed;

		char previous = s.charAt(0);
		int count = 1;
		StringBuffer sb = new StringBuffer();
	
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == previous && i > 0) {
				count++;
			} else {
				sb.append(previous);
				sb.append(count);
				previous = s.charAt(i);
				count = 1;
			}
		}
        sb.append(previous);
        sb.append(count);

		if (sb.length() < s.length()) {
			compressed = sb.toString();
		} else {
			compressed = s;
		}

		return compressed;		
	}

    public static void main(String[] args) {

        String s = "abbcccccde";
        String compressed = Question1_5.compress(s);
        System.out.println(compressed);

        s = "abc";
        compressed = Question1_5.compress(s);
        System.out.println(compressed);
    }
}
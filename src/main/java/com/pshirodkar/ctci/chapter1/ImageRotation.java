package com.pshirodkar.ctci.chapter1;

/**
 * Solution to Question 1.6
 *
 * @author pshirodkar
 */
public class ImageRotation {

	private static void rotateImageBy90(int[][] matrix) {
		
		System.out.println("Before rotation");
		print(matrix);
		
		int n = matrix.length;

		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;

            for (int offset = first; offset < last; offset++) {

                int temp = matrix[first][first + offset];

                matrix[first][first + offset] = matrix[first + offset][first];
				matrix[first + offset][first] = matrix[last][first + offset];
				matrix[last][first + offset] = matrix[first + offset][last];
				matrix[first + offset][last] = temp;
			}
			
		}

		System.out.println("After rotation");
		print(matrix);
	}

	private static void print(int[][] matrix) {

		for (int[] rows : matrix) {
			for (int element : rows) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	private static int[][] image = {{0, 1, 2, 3}, {0, 1, 2, 3}, {0, 1, 2, 3}, {0, 1, 2, 3}};

	public static void main(String[] args) {
		
		rotateImageBy90(image);
	}
	
}
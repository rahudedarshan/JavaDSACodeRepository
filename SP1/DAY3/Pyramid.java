package com.sp1.app;

public class Pyramid {

	public static void main(String[] args) {

		System.out.println("Pyramid.main()");

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("\nPyramid.main()");
		int rows = 5; // change as needed

		for (int i = 0; i < rows; i++) {
			int spaces = rows - i - 1;
			int stars = 2 * i + 1;

			// build spaces
			StringBuilder line = new StringBuilder();
			for (int s = 0; s < spaces; s++)
				line.append(' ');

			// build stars
			for (int j = 0; j < stars; j++)
				line.append('*');

			System.out.println(line.toString());
		}
		
		System.out.println( );
		
		 rows = 5; // produces 1,3,5,7,9 stars
        for (int i = 1; i <= rows; i++) {
            // print leading spaces
            for (int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }
            // print stars: 2*i - 1 stars on row i
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}

package com.sp1.app;

public class FibonnaciSeries {

	public static void main(String[] args) {

		System.out.println("FibonnaciSeries.main()");

		int limit = 10;
		int sum = 0;
		int first = 0, second = 1;
		// Output: [0, 1, 1, 2, 3, 5, 8]
		System.out.print(first + " , " + second);

		while (true) {
			sum = first + second;
			if (sum > limit)
				break;

			System.out.print(" , " + sum);

			first = second;
			second = sum;

		}
	}
}
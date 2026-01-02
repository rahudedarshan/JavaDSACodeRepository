package com.sp1.app;

public class SumOfFactorial {

	public static void main(String[] args) {

		System.out.println("SumOfFactorial.main()");

		int num = 4;
		sumOfFactorial(num);
	}

	private static void sumOfFactorial(int num) {
		int sum = 1;
		int multiplier = 1;

		while (num > 0) {
			sum = sum * num;
			num--;
		}

		System.out.println("Factorial is :: " + sum);

		int total = 0;
		while (sum != 0) {

			int rem = sum % 10;
			total = total + rem;
			sum = sum / 10;

		}

		System.out.println(" Factorial Sum is :: " + total);

	}
}

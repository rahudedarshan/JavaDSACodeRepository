package com.sp1.app;


public class EvenOddNumbers {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 45, 56, 23, 13 };

		int evenCount = 0, oddCount = 0;

		for (int num : arr) {
			if (num % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}

		int[] even = new int[evenCount];
		int[] odd = new int[oddCount];

		int eIndex = 0, oIndex = 0;

		for (int num : arr) {
			if (num % 2 == 0) {
				even[eIndex++] = num;
			} else {
				odd[oIndex++] = num;
			}
		}

		System.out.println("Even array:");
		for (int x : even)
			System.out.print(x + " ");

		System.out.println("\nOdd array:");
		for (int x : odd)
			System.out.print(x + " ");

	}
}

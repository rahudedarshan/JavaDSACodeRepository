package com.sp1.app;

public class SorttingArraySelectionSort {

	public static void main(String[] args) {

		System.out.println("SorttingArray.main()");

		int arr[] = { 3, 1, 4, 1, 5, 9 };

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {

					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}

		System.out.println("Sorted Array :: " + arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}

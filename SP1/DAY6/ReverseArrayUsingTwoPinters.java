package com.sp1.app;

import java.util.Arrays;

public class ReverseArrayUsingTwoPinters {

	public static void main(String[] args) {

		/// int[] arr = new int [10];

		int[] arr = { 10, 20, 30, 40, 70, 90 };

		reverseArrayCodeUsingTwoPinters(arr);
	}

	private static void reverseArrayCodeUsingTwoPinters(int[] arr) {

		int left = 0, right = arr.length - 1;

		while (left < right) {

			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}

package com.sp1.app;

import java.util.Arrays;

public class MovesZeroToEnd {

	public static void main(String[] args) {

		System.out.println("MovesZeroToEnd.main()");

		int[] arr = { 10, 0, 0, 40, 70, 90 };

		movesZeroToEndAlgo(arr);
	}

	private static void movesZeroToEndAlgo(int[] arr) {
		int start = 0, end = arr.length - 1;

		while (start < end) {
			if (arr[start] == 0 && arr[end] != 0) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}

			if (arr[start] != 0)
				start++;
			if (arr[end] == 0)
				end--;
		}

		System.out.println(Arrays.toString(arr));
	}
}

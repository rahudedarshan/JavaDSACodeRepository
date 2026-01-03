package com.sp1.app;

public class TwoSumSortedArray {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 70, 90 };

		int target = 70;

		Boolean check = findPairOfTagetSum(arr, target);
		
		System.out.println("Pair Found!");

	}

	private static Boolean findPairOfTagetSum(int[] arr, int target) {
		int left = 0, right = arr.length - 1;

		while (left < right) {

			if (target == arr[left] + arr[right]) {
				return true;
			} else if (target < left) {
				left++;
			} else {
				right--;
			}

		}
		return false;

	}
}

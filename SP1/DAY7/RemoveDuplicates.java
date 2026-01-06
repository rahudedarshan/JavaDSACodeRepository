package com.sp1.app;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 3, 4 };

		int count = removeDuplicates(arr);
		System.out.println(count);

	}

	public static int removeDuplicates(int[] nums) {

		int slow = 0;
		for (int fast = 1; fast < nums.length; fast++) {
			if (nums[slow] != nums[fast]) {
				slow++;
				nums[slow] = nums[fast];

			}
		}

		return slow + 1;
	}
}

package com.sp1.app;

public class LargeastAndSmallestElement {

	public static void main(String[] args) {
		
		System.out.println("LargeastAndSmallestElement.main()");
		
		int arr[] = {4, 7, 1, 8, 5};
		
		int largest = arr[0],smallest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			largest = Math.max(largest, arr[i]);
			smallest = Math.min(smallest, arr[i]);
		}
		
		System.out.println("Smallest ::"+smallest+ " Largest ::"+largest);
		
		System.out.println("-----------------------------");
		
		int[] arr1 = {12, 5, 8, 20, -4, 15};

        if (arr1 == null || arr1.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = arr1[0];
        int max = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr[i];
            }
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Largest number : " + max);

	}
}

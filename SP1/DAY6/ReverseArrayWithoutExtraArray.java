package com.sp1.app;

public class ReverseArrayWithoutExtraArray {

	public static void main(String[] args) {
		
		System.out.println("ReverseArrayWithoutExtraArray.main()");
		
		int arr[] = {1, 2, 3, 4};
		
		reverseArray(arr);
	}

	private static void reverseArray(int[] arr) {
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		}
		
	}
}

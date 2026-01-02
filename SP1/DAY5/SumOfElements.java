package com.sp1.app;

public class SumOfElements {

	public static void main(String[] args) {
		
		System.out.println("SumOfElements.main()");
		int arr[] = {1, 2, 3, 4, 5};
		
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum = sum +arr[i];
		}
		
		System.out.println("Sum :: "+sum);
		
		
	}
}

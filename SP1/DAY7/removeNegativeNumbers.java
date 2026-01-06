package com.sp1.app;

import java.util.Arrays;

public class removeNegativeNumbers {


	
	public static void main(String[] args) {
		
		 int []arr = {-1, 2, -3, 4, 5};
		 
		int [] num =  removeNegativeNumbers(arr);
		
		System.out.println(Arrays.toString(num));
	}

	private static int[] removeNegativeNumbers(int[] arr) {
		
		int slow =  0;
		
		for(int fast=0;fast<arr.length;fast++) {
			if(arr[fast]>0) {
				arr[slow++] = arr[fast];
			}
		}
		return Arrays.copyOf(arr, slow);
	}
}

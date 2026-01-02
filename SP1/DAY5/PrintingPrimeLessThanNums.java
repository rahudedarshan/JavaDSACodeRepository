package com.sp1.app;

import java.util.ArrayList;
import java.util.List;

public class PrintingPrimeLessThanNums {

	public static void main(String[] args) {

		int num = 20;

		findPrimeNum(num);
	}

	private static void findPrimeNum(int num) {

		List<Integer> list = new ArrayList<>();
		System.out.println("PrintingPrimeLessThanNums.findPrimeNum()");

		
		for (int i = 1; i <= num; i++) {

			if (i < 2) {
				continue;
			}

			boolean isPrime = true;
			for (int j = 2; j < Math.sqrt(i); j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				list.add(i);
			}

		}

		System.out.println(" List is :" + list);

	}
}

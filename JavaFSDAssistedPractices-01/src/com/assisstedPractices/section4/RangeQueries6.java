package com.assisstedPractices.section4;

public class RangeQueries6 {
	public static void sumOfRange(int[] arr, int l, int r) {
		if (l > r && l < arr.length && r < arr.length)
			System.out.println("L and R should be in range");
		else {
			int sum = 0;
			for (int i = l; i <= r; i++)
				sum += arr[i];
			System.out.printf("\nSum from %d to %d is %d ", l, r, sum);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 7, 2, 5, 8, 9 };
		sumOfRange(arr, 0, 5);
		sumOfRange(arr, 3, 5);
		sumOfRange(arr, 2, 4);
	}
}

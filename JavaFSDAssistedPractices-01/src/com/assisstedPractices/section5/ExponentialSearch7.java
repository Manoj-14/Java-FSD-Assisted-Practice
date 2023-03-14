package com.assisstedPractices.section5;

import java.util.Arrays;

public class ExponentialSearch7 {
	public static int exponentialSearch(int arr[], int key) {
		int len = arr.length;
		if (arr[0] == key) {
			return 0;
		}
		int i = 1;
		while (i < len && arr[i] <= key) {
			i *= 2;
		}
		return Arrays.binarySearch(arr, i / 2, Math.min(len, i), key);
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 1, 0, 3, 23, 2 };
		int key = 0;
		Arrays.sort(arr);
		int index = exponentialSearch(arr, key);
		System.out.println(Arrays.toString(arr));
		if (index > -1)
			System.out.println(key + " found at index " + index + " of sorted array " + Arrays.toString(arr));
		else
			System.out.println(key + " not found");
	}
}

package com.assisstedPractices.section5;

import java.util.Arrays;

public class BinarySearch5 {
	public static int binarySearch(int[] arr, int key) {
		bubbleSort(arr);
		int start = 0, end = arr.length, mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (key == arr[mid])
				return mid;
			else if (key > mid)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 1, 0, 3, 23, 2 };
		int key = 7;
		int index = binarySearch(arr, key);
		System.out.println(Arrays.toString(arr));
		if (index != -1)
			System.out.println(key + " found at index " + index + " of sorted array " + Arrays.toString(arr));
		else
			System.out.println(key + " not found");
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}

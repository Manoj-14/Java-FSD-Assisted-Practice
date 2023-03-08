package com.assisstedPractices.section5;

import java.util.Arrays;

public class InsertionSort13 {
	public static void insertionSort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				swap(arr, i, i + 1);
			}
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1])
					swap(arr, j, j - 1);
			}
		}
	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 1, 0, 3, 23 };
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

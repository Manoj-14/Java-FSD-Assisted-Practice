package com.assisstedPractices.section5;

import java.util.Arrays;

public class QuickSort17 {
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partition(int[] arr, int start, int end) {
		int piviot = arr[end];
		int x = start - 1;
		for (int i = start; i < end; i++) {
			if (arr[i] < piviot) {
				x++;
				swap(arr, i, x);
			}
		}
		swap(arr, end, x + 1);
		return x + 1;
	}

	public static void quickSort(int arr[], int start, int end) {
		if (start < end) {
			int p = partition(arr, start, end);
			quickSort(arr, start, p - 1);
			quickSort(arr, p + 1, end);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 1, 0, 3, 23 };
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}

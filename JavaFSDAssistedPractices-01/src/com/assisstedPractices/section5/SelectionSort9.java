package com.assisstedPractices.section5;

import java.util.Arrays;

public class SelectionSort9 {
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min_ind = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min_ind])
					min_ind = j;
			}

			int temp = arr[min_ind];
			arr[min_ind] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 1, 0, 3, 23 };
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

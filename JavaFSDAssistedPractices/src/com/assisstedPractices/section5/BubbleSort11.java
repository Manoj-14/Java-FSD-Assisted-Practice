package com.assisstedPractices.section5;

import java.util.Arrays;

public class BubbleSort11 {
	public static void bubbleSort(int[] arr) {
		for(int i =0 ; i<arr.length ;i++) {
			for(int j=0; j<arr.length-i-1 ;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 5, 7, 1, 0, 3, 23 };
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

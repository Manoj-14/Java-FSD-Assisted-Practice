package com.assisstedPractices.section5;

import java.util.Arrays;

public class MergeSort15 {
	public static void mergeSort(int[] arr ,int start,int end) {
		if(start < end) {
			int mid = (end-start)/2 + start;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}

	public static void merge(int[] arr, int start, int mid, int end) {
		int i = start, j = mid + 1;
		int[] arrTemp = new int[end - start + 1];
		for (int k = 0; k < arrTemp.length; k++) {
			if (i <= mid && (j > end || arr[i] <= arr[j])) {
				arrTemp[k] = arr[i];
				i++;
			} else {
				arrTemp[k] = arr[j];
				j++;
			}
		}
		System.arraycopy(arrTemp, 0, arr, start, arrTemp.length);
	}
	
	public static void main(String[] args) {
		int[] arr = { 5, 7, 1, 0, 3, 23 };
		System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}

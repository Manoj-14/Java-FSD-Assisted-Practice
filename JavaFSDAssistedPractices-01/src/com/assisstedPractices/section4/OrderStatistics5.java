package com.assisstedPractices.section4;

import java.util.HashSet;
import java.util.Set;

public class OrderStatistics5 {
	public static void fourthSmallest(int[] arr,int k) {
		
		if(k<arr.length) {
			int res;
			Set<Integer> set = new HashSet<>();
			for (int i : arr) {
				set.add(i);
			}
			int i = 0;
			for (int j : set) {
				if (i == k)
					System.out.println(k+"th smallest element is :"+j);
				i++;
			}
		}
		else {
			System.out.println("Index out of range");
		}
 	}
	public static void main(String[] args) {
		int arr[] = {12, 3, 5, 7, 4, 19, 26};
		fourthSmallest(arr, 4);
	}
}


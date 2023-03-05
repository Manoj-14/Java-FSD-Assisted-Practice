package com.assisstedPractices.section4;

import java.util.Arrays;

public class ArrayRotation4 {
	public static int[] rotateClockWise(int arr[],int k) {
		if(k>arr.length) k = k % arr.length ;
		int res[] = new int[arr.length];
		int j = 0 ;
		for(int i=k ; i <arr.length ; i++) {
			res[j] = arr[i];
			j++;
		}
		j = arr.length-1;
		for(int i =0 ; i<k ; i++) {
			res[j] = arr[i];
			j--;
		}
		
		return res;	
	}
	
	public static int[] rotateAntiClockWise(int arr[],int k) {
		if(k>arr.length) k = k % arr.length ;
		int res[] = new int[arr.length];
		int j = arr.length - k ;
		for(int i=0 ; i <k ; i++) {
			res[i] = arr[j];
			j++;
		}
		j = 0;
		for(int i =k ; i<arr.length ; i++) {
			res[i] = arr[j];
			j++;
		}
		
		return res;	
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7} , res[];
		System.out.println("Rotating array clockwise");
		res = rotateClockWise(arr, 5);
		for(int i:res) System.out.print(i+",");
		System.out.println("\nRotating array anti clockwise");
		res = rotateAntiClockWise(arr, 5);
		for(int i:res) System.out.print(i+",");
	}
}
	
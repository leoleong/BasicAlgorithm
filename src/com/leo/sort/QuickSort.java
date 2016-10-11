package com.leo.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, -5, 3, 6, 0, 5, -1};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] src, int start, int end) {
		if (start >= end) {
			return;
		}
		int pivot = partition(src, start, end);
		quickSort(src, start, pivot - 1);
		quickSort(src, pivot + 1, end);
		
	}
	
	private static int partition(int[] src, int start, int end) {
		int i = start - 1, j = start;
		
		while (j < end) {
			if (src[j] <= src[end]) {
				swap(src, ++i, j);
			}
			j++;
		}
		swap(src, ++i, end);
		
		return i;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}

package com.leo.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] src = {1, -1, 0, 5, 2, 4, 3};
		int[] dst = new int[src.length];
		mergeSort(src, dst, 0, src.length - 1);
		System.out.println(Arrays.toString(src));
	}

	private static void mergeSort(int[] src, int[] dst, int start, int end) {
		if (start >= end) {
			return;
		}
		
		int mid = (start + end) / 2;
		mergeSort(src, dst, start, mid);
		mergeSort(src, dst, mid + 1, end);
		merge(src, dst, start, mid, end);
	}
	
	private static void merge(int[] src, int[] dst, int start, int mid, int end) {
		int i = start, j = mid + 1, k = start;
		while (i <= mid && j <= end) {
			if (src[i] <= src[j]) {
				dst[k++] = src[i++];
			} else {
				dst[k++] = src[j++];
			}
		}
		while (i <= mid) {
			dst[k++] = src[i++];
		}
		while (j <= end) {
			dst[k++] = src[j++];
		}
		for (k = start; k <= end; k++) {
			src[k] = dst[k];
		}
	}
}

package com.nero.www;

public class Sort {
	
	public static void merge(int[] array, int left, int mid, int right){
		int[] tmpArray = new int[right - left + 1];
		int i = left;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j <= right){
			if(array[i] < array[j]){
				tmpArray[k++] = array[i++];
			}else{
				tmpArray[k++] = array[j++];
			}
		}
		
		if(i > mid){
			while(j<=right){
				tmpArray[k++] = array[j++];
			}
		}
		
		if(j > right){
			while(i<=mid){
				tmpArray[k++] = array[i++];
			}
		}
		
		k = 0;
		while(k < tmpArray.length){
			array[left+k] = tmpArray[k++];
		}
		
	}
	
	public static void sort(int[] array, int left, int right){
		int len = right - left + 1;
		if(len == 1){
			return;
		}
		
		int mid = (left + right)/2;
		sort(array, left, mid);
		sort(array, mid + 1, right);
		merge(array, left, mid, right);
	}
}

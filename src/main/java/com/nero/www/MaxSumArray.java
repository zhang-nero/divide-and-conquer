package com.nero.www;

public class MaxSumArray {
	
	public static int getMaxSumArray(int[] array, int left, int right)
	{
		int maxLeftSum, maxRightSum;
		int maxLeftBorderSum, maxRightBorderSum;
		int leftBorderSum, rightBorderSum;
		int center;
		
		if(left == right){
			if(array[left] > 0){
				return array[left];
			}else{
				return 0;
			}
		}
		
		center = (left+right)/2;
		maxLeftSum = getMaxSumArray(array, left, center);
		maxRightSum = getMaxSumArray(array, center+1, right);
		
		leftBorderSum = 0;
		maxLeftBorderSum = 0;
		for(int i = center; i >= left; i--){
			leftBorderSum += array[i];
			if(leftBorderSum > maxLeftBorderSum){
				maxLeftBorderSum = leftBorderSum;
			}
		}
		
		rightBorderSum = 0;
		maxRightBorderSum = 0;
		for(int i = center + 1; i <= right; i++){
			rightBorderSum += array[i];
			if(rightBorderSum > maxRightBorderSum){
				maxRightBorderSum = rightBorderSum;
			}
		}
		
		return getMax3(maxLeftSum, maxRightSum, maxLeftBorderSum+maxRightBorderSum);
		
	}
	
	public static int getMax3(int num1, int num2, int num3){
		int max;
		if(num1 >= num2 && num1 >= num3){
			max = num1;
		}else if(num2 >= num1 && num2 >= num3){
			max = num2;
		}else{
			max = num3;
		}
		return max;
	}
		
}

package com.nero.www;

import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	Main test = new Main();
    	Random random = new Random();
    	int[] originArray;
    	int len = random.nextInt()%91;
    	if(len <= 0){
    		len += 91;
    	}
    	System.out.println("The array's lenght is: " + len);
    	
    	originArray = new int[len];
    	
    	for(int i = 0; i < len; i++){
    		originArray[i] = random.nextInt()%91;
    	}
    	
    	test.maxSumArrayTest(originArray);
    	test.sortTest(originArray);
    	
    }
    
    public void maxSumArrayTest(int[] array){
    	System.out.println("The origin array is:" + Arrays.toString(array));
    	int maxSubArraySum = MaxSumArray.getMaxSumArray(array, 0, array.length-1);
    	System.out.println("The max sub array sum is: " + maxSubArraySum);
    }
    
    public void sortTest(int[] array){
    	System.out.println("The origin array is:" + Arrays.toString(array));
    	Sort.sort(array, 0, array.length-1);
    	System.out.println("The sorted array is:" + Arrays.toString(array));
    }
}

package Algorithm;

/*
// Problem link: https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1/#
 */

import java.util.*;

public class Kadanes_Algo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,-2,5};
        System.out.println("Maximum conntiguous subarray sum is: "+ maxSubarraySum(arr,5));
    }

    static long maxSubarraySum(int arr[], int n){

        // Your code here
        int current_sum=0,max_sum=Integer. MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(current_sum < 0)
            {
                current_sum = 0;
            }

            current_sum += arr[i];
            max_sum = Math.max(current_sum,max_sum);
        }
        return max_sum;
    }
}

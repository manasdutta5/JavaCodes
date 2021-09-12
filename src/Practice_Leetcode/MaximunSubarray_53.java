package Practice_Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MaximunSubarray_53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of the array :");
        n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();

        }

        System.out.println(maxSubArray(a));
    }

    public static int maxSubArray(int[] nums)
    {
        int max_sum_so_far=0;
        int sum_current_subsequence=0;

//        if all elements are negative
        int c = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0) c++;
        }

        if(c==nums.length)
        {
            Arrays.sort(nums);
            return nums[nums.length-1];
        }


        for(int i=0;i<nums.length;i++)
        {
            if(sum_current_subsequence>max_sum_so_far)
            {
                max_sum_so_far = sum_current_subsequence;
//                System.out.println("max_sum_so_far = "+max_sum_so_far);
            }

            if(sum_current_subsequence<0)
            {
                sum_current_subsequence = 0;
            }
                sum_current_subsequence+=nums[i];
//                System.out.println("sum_current_subsequence = "+sum_current_subsequence);

        }
        if(sum_current_subsequence>max_sum_so_far)
        {
            max_sum_so_far = sum_current_subsequence;
//            System.out.println("max_sum_so_far = "+max_sum_so_far);
        }
        return max_sum_so_far;
    }
}

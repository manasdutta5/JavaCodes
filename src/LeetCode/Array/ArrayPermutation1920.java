package LeetCode.Array;

/*
 Problem link: https://leetcode.com/problems/build-array-from-permutation/
 make result[i] = nums[nums[i]] , nums is given
 challenge was to do it in O(1) space

 instead of directly storing nums[nums[i]] in res[i], we can store modified value such that we can extract original
 value of nums[i] from stored value

 use nums[i] = nums[i] + nums[nums[i]] * nums.size

 to get original value of nums[i], use nums[i]%nums.size
 further in final array nums, use nums[i]/nums.size to get answer array


 Solution link: https://youtu.be/IEr74xZGNoU
 */

public class ArrayPermutation1920 {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i] < i)
            {
                nums[i] = (nums[nums[i]]%n)*n + nums[i] ;
            }
            else
            {
                nums[i] = nums[i] + n*nums[nums[i]];
            }

        }

        for(int i=0;i<nums.length;i++)
        {
            nums[i] /=n;
        }
        return nums;
    }
}

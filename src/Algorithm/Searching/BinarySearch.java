package Algorithm.Searching;
//leetcode Algorithm1  Day1 Problem 2
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,2,5,7,8};
        int target = 7;
        int index = search(nums,target);
        System.out.println(index);

    }

    public static int search(int[] nums, int target) {
        int low=0,high=nums.length-1,mid=0;

        while(low<=high)
        {

            mid= low + (high - low)/2;

            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}

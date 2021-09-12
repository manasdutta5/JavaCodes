package Practice_Leetcode;

import java.util.*;

public class removeElement {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter array size :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array element :");

        for(int i=0;i<n;i++)
        {

        }


    }

    public int removeElement(int[] nums, int val)
    {
        Arrays.sort(nums);
        int i=0,c=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==val) c++;
        }

        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                for(int j=nums.length-1;nums[j]!=val;j--)
                {
                    nums[i++]=nums[j];
                }
            }
        }
        return nums.length-c;

    }
}

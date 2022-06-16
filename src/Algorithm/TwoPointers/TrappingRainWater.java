package Algorithm.TwoPointers;

/*
// Problem link: https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
// Problem link 2: https://practice.geeksforgeeks.org/problems/amount-of-water1348/1
// Video solution: https://youtu.be/m18Hntz4go8
 */

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println("Max Water trapped is "+ bruteForceSolve(arr)+" units.");
        System.out.println("Max Water trapped is "+ optimalSolve(arr)+" units.");
    }

    static int bruteForceSolve(int[] arr)
    {
        int waterCollected = 0;
        int currmax = 0;
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];

        for(int i =0; i<arr.length; i++)
        {
            leftMax[i] = Math.max(currmax, arr[i]);
            if(currmax < arr[i])  currmax = arr[i];
        }
        currmax = 0;
        for(int i = arr.length - 1; i>-1; i--)
        {
            rightMax[i] = Math.max(currmax, arr[i]);
            if(currmax < arr[i])  currmax = arr[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            waterCollected += Math.min(leftMax[i],rightMax[i]) - arr[i];
        }


        return waterCollected;
    }

    static int optimalSolve(int[] arr)
    {
        int waterCollected = 0;

        int leftMax = 0, rightMax = 0;
        int left = 0, right = arr.length - 1;

        while(left <= right)
        {
            if(arr[left] <= arr[right])
            {
                if(arr[left] < leftMax) waterCollected += leftMax - arr[left];
                else leftMax = arr[left];

                left++;
            }
            else
            {
                if(arr[right] < rightMax) waterCollected += rightMax - arr[right];
                else rightMax = arr[right];
                right--;
            }
        }

        return waterCollected;
    }
}

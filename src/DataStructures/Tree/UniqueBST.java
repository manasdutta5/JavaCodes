package DataStructures.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UniqueBST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter size :");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" node values");
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        List<Integer> res = numBST(arr);

        System.out.println("Answer for each node vcalue is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(res.get(i)+" ");
        }
        System.out.println();
    }

    public static List<Integer> numBST(List<Integer> nodeValues)
    {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nodeValues.size();i++)
        {
            res.add(numTrees(nodeValues.get(i) % 10000007));
        }

        return res;
    }


    public static int numTrees(int n) {
        int[] dp = new int[20];

        //Initialise each value to -1
        Arrays.fill(dp, -1);

        //below is required base condition
        dp[0] = 1;
        return calculate(n, dp); /* returning new calculated value for new node value */
    }

    public static int calculate(int n, int[] dp) {
        if(dp[n] != -1) {
            return dp[n];
        }

        /* count value to store results till now */
        int count = 0;
        for(int i = 1; i <= n; i++) {
            int left = calculate(i-1, dp);
            int right = calculate(n-i, dp);
            count = count + (left * right);
        }
        dp[n] = count;
        return count;
    }
}

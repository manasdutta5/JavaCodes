package DataStructures.Tree;

/*
// Problem Link : https://practice.geeksforgeeks.org/problems/root-to-leaf-path-sum/1/?company[]=Amazon&company[]=Amazon&problemStatus=unsolved&problemType=functional&page=2&sortBy=submissions&query=company[]AmazonproblemStatusunsolvedproblemTypefunctionalpage2sortBysubmissionscompany[]Amazon#
// Video Solution : https://youtu.be/__BOscZAIFk
// Similar problem to Leetcode 112
 */


public class CheckIfRootToLeafSumMatchesGivenSum {

    static class Node{
        int data;
        Node left,right;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        int S = 4;
        System.out.println(hasPathSum(root,S));
    }

    static boolean hasPathSum(Node root, int S) {
        // Your code here
        return check(root,0,S);
    }

    static boolean check(Node root, int sum, int S)
    {
        if(root == null) return false;
        sum += root.data;
        if(sum == S && root.left == null && root.right == null)
        {
            return true;
        }

        Boolean left = check(root.left,sum, S);
        Boolean right = check(root.right,sum, S);

        return left || right;
    }
}

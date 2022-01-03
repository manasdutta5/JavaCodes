package DataStructures.Tree;

//In this we are considering complete path from leaf to leaf

/*
//  Problem Link: https://practice.geeksforgeeks.org/problems/maximum-path-sum/1#
//  (this video solution needs a little modification to handle case of skew trees, which has been handled in the code below)
// Video Solution: https://youtu.be/kSSAdqB7qsw
 */

public class MaximumPathSumLeaveToLeave {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(-10);
        root.left.right = new Node(4);

        if(findMaxPathSum(root).LTLmaxSum == Integer.MIN_VALUE)
        {
            System.out.println(findMaxPathSum(root).NTLmaxSum);
        }
        else
            System.out.println(findMaxPathSum(root).LTLmaxSum);

    }

    static class pair{
        int LTLmaxSum = -(int)(1e9)-1;
        int NTLmaxSum = -(int)(1e9)-1;
    }

    static pair findMaxPathSum(Node root){
        pair myAns = new pair();
        if(root == null) return myAns;
        if(root.left == null && root.right == null){
            myAns.NTLmaxSum = root.data;
            return myAns;
        }

        pair LTSum = findMaxPathSum(root.left);
        pair RTSum = findMaxPathSum(root.right);

        myAns.LTLmaxSum = Math.max(LTSum.LTLmaxSum,RTSum.LTLmaxSum);


        if(root.left != null && root.right != null){
            myAns.LTLmaxSum = Math.max(myAns.LTLmaxSum, LTSum.NTLmaxSum + root.data + RTSum.NTLmaxSum);
        }

        myAns.NTLmaxSum = Math.max(LTSum.NTLmaxSum,RTSum.NTLmaxSum) + root.data;

        return myAns;
    }
}

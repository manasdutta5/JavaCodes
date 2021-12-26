package DataStructures.Tree;

/*
// Problem Link: https://practice.geeksforgeeks.org/problems/check-for-bst/1
 */


//************************************************
//****************                ****************
// *************** WRONG code yet ****************
//****************                ****************
//************************************************


public class CheckForBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(isBST(root));
    }

    //Function to check whether a Binary Tree is BST or not.
    static boolean isBST(Node root)
    {
        // code here.
        if(root.left != null)
            if(root.data < root.left.data) return false;

        if(root.right != null)
            if(root.data > root.right.data) return false;

        if(root.left == null && root.right == null) return true;

        boolean leftAns = isBST(root.left);
        boolean rightAns = isBST(root.right);

        return (leftAns && rightAns);
    }
}

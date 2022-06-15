package DataStructures.Tree;

import java.util.ArrayList;

public class ArrayToBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        Node root = ConvertToBST(nums,0,nums.length - 1);
        preorder(root);

    }

    public static Node ConvertToBST(int[] nums,int start,int end)
    {
        if (start > end) {
            return null;
        }

        int mid = (start+end)/2;

        Node root = new Node(nums[mid]);
        root.left = ConvertToBST(nums,start,mid-1);
        root.right = ConvertToBST(nums,mid+1,end);

        return root;
    }

    //printing the result
    public static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

}

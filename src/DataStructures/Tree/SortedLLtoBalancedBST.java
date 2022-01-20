package DataStructures.Tree;

/*
// Problem link: https://practice.geeksforgeeks.org/problems/sorted-list-to-bst/1/?category[]=Linked%20List&category[]=Linked%20List&problemStatus=unsolved&difficulty[]=2&page=1&query=category[]Linked%20ListproblemStatusunsolveddifficulty[]2page1category[]Linked%20List
// Video Solution:https://youtu.be/C59kWTK4_Zs
 */


import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class SortedLLtoBalancedBST {

    static class Node{
        int data;
        Node next = null;

        public Node(int data){
            this.data = data;
        }
    }

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);
//        head.next.next.next.next.next = new Node(6);
////        head.next.next.next.next.next.next = new Node(7);

        TreeNode root = sortedListToBST(head);
        preorder(root);
    }

    // Code below function
    public static TreeNode sortedListToBST(Node head)
    {
        //code here
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;
        while(temp != null)
        {
            arr.add(temp.data);
            temp = temp.next;
        }
        //System.out.println((int)Math.ceil(0.5));
        //System.out.println("Array Size : "+arr.size());
        TreeNode root = utilToBST(arr,0,arr.size()-1);
        return root;
    }

    public static TreeNode utilToBST(ArrayList<Integer> arr,int start,int end)
    {
        if(start > end) return null;
        int middle = (int) Math.ceil((start+end)/2.0);
        TreeNode root = new TreeNode(arr.get(middle));

        root.left = utilToBST(arr,start,middle - 1);
        root.right = utilToBST(arr,middle+1,end);

        return root;
    }



    //utility function below to print Tree's preorder traversal
    public static void preorder(TreeNode root)
    {
        if(root == null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}

package DataStructures.Tree;

/*
//  problem link: https://practice.geeksforgeeks.org/problems/sum-tree/1/?category[]=Tree&category[]=Tree&problemStatus=unsolved&difficulty[]=1&page=2&query=category[]TreeproblemStatusunsolveddifficulty[]1page2category[]Tree#
 */


import java.util.*;
public class SumTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    //Tree creation and driver function
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(10);
        root.left.right = new Node(10);

        System.out.println(isSum(root));
    }

    static boolean isSum(Node root){
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        int res = findSum(root.left) + findSum(root.right);
        if(root.data == res) return true;

        return false;
    }

    static int findSum(Node root){
        if(root == null) return 0;
        return root.data + findSum(root.left) + findSum(root.right);
    }
}

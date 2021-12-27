package DataStructures.Tree;

/*
// Problem Link: https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1/?category[]=Tree&category[]=Tree&problemStatus=unsolved&page=3&query=category[]TreeproblemStatusunsolvedpage3category[]Tree#
// Video solution: https://youtu.be/_-QHfMDde90
 */

import java.util.*;

public class LowestCommonAncestor {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);

        int n1 = 3, n2 = 4;
        System.out.println(lca(root,n1,n2).data);
    }

    static Node lca(Node root,int n1,int n2){
        if(root == null) return null;
        if(root.data == n1 || root.data == n2) return root;

        Node res1 = lca(root.left,n1,n2);
        Node res2 = lca(root.right,n1,n2);

        if(res1 == null) return res2;
        if(res2 == null) return res1;
        else return root;
    }

}

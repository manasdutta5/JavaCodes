package DataStructures.Tree;

/*
//  Problem link: https://practice.geeksforgeeks.org/problems/nodes-at-given-distance-in-binary-tree/1
//  Video Solution : https://youtu.be/i9ORlEy6EsI
//  Video Solution (used for this code): https://youtu.be/s22QClql9LU
 */

import java.util.*;
public class NodesAtKDistance {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    static ArrayList<Node> rootToNode = new ArrayList<>();
    static int i = 0;

    public static void main(String[] args) {
//        Node root = new Node(20);
//        root.left = new Node(8);
//        root.right = new Node(22);
//        root.left.left = new Node(4);
//        root.left.right = new Node(12);
//        root.left.right.left = new Node(10);
//        root.left.right.right = new Node(14);

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int target = 6;
        int k = 4;

        ArrayList<Integer> nodes = new ArrayList<>();
        distanceK(root,target,k,nodes);
        for(int i=0;i<nodes.size();i++)
        {
            System.out.print(nodes.get(i)+" ");
        }

    }

    public static int distanceK(Node root,int target,int k,ArrayList<Integer> path)
    {
        if(root == null)
        {
            return -1;
        }

        if(root.data == target)
        {
            kdown(root,null,k,path);
            return 1;
        }

        int left_dist = distanceK(root.left,target,k,path);
        if(left_dist != -1)
        {
            kdown(root,root.left,k-left_dist,path);
            return 1+left_dist;
        }

        int right_dist = distanceK(root.right,target,k,path);
        if(right_dist != -1)
        {
            kdown(root,root.right,k-right_dist,path);
            return 1+right_dist;
        }

        return -1;
    }

    public static void kdown(Node root,Node block,int k,ArrayList<Integer> path){
        if(root == null || root == block || k<0)
        {
            return;
        }

        if(k==0)
        {
            path.add(root.data);
            return;
        }

        kdown(root.left,block,k-1,path);
        kdown(root.right,block,k-1,path);
    }
}

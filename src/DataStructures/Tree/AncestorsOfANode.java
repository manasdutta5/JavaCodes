package DataStructures.Tree;

/*
// Problem Link: https://practice.geeksforgeeks.org/problems/ancestors-in-binary-tree/1/?category[]=Tree&category[]=Tree&problemStatus=unsolved&page=3&query=category[]TreeproblemStatusunsolvedpage3category[]Tree#
// Do Root To Node Path first before doing this problem
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AncestorsOfANode {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(7);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target Node");
        int target = sc.nextInt();
        ArrayList<Integer> path = new ArrayList<Integer>();
        findPath(root,path,target);
        System.out.println(path);
    }

    static boolean findPath(Node root, ArrayList<Integer> path,int data){
        if(root == null) return false;

        if(root.data == data) return true;

        if(findPath(root.left,path,data)){
            path.add(root.data);
            return true;
        }

        if(findPath(root.right,path,data)){
            path.add(root.data);
            return true;
        }
        return false;
    }
}

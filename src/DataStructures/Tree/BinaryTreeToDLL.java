package DataStructures.Tree;

/*
//  Problem Link: https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
//  Video Solution link: https://youtu.be/cgsGrbRPH6I
 */

import java.util.*;
public class BinaryTreeToDLL {

    //create tree nodes
    static class Node{
        int data;
        Node left = null;
        Node right = null;

        public Node(int data){
            this.data = data;
        }
    }

    //main driver function
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(15);
        root.left.left = new Node(25);
        root.left.right = new Node(30);
        root.right.left = new Node(36);

        BinaryTreeToDLL btodll = new BinaryTreeToDLL();
        Node head = btodll.bToDLL(root);

        printList(head);
    }

    //print function
    static void printList(Node head){
        while(head.right != null) {
            System.out.print(head.data+" ");
            head = head.right;
        }
        System.out.print(head.data+" ");

        System.out.println();

        while(head.left != null) {
            System.out.print(head.data+" ");
            head = head.left;
        }
        System.out.print(head.data+" ");
    }

    //driver code ends here
    //solution below
    Node previous = null;
    Node headOfLL = null;

    Node bToDLL(Node root)
    {
        //  Your code here
        if(root == null) return null;

        //start converting
        bToDLL(root.left);

        if(previous == null){
            headOfLL = root;
            previous = root;

        }
        else{
            root.left = previous;
            previous.right = root;
            previous = root;
        }

        bToDLL(root.right);

        return headOfLL;
    }

}

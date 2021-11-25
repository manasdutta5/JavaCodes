package DataStructures.Tree;

/*
//************************DO BINARY TREE TO DLL FIRST********************************
// This Problem link: https://practice.geeksforgeeks.org/problems/binary-tree-to-cdll/1
 */



public class BinaryTreeToCircularDLL {


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

        BinaryTreeToCircularDLL func = new BinaryTreeToCircularDLL();
        Node head = func.bTreeToClist(root);

    }

    //driver code ends here
    //solution below
    Node previous = null;
    Node headOfLL = null;
    //Function to convert binary tree into circular doubly linked list.
    Node bTreeToClist(Node root)
    {
        //your code here
        Node head = bToDLL(root);
        Node temp = head;

        while(temp.right != null){
            temp = temp.right;
        }

        temp.right = head;
        head.left = temp;

        return head;
    }

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

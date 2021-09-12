package DataStructures.Tree;

import java.util.*;

public class PreOrder_Iterative {
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
        root.right.left = new Node(6);
        root.left.left.left = new Node(7);
        PreOrder(root);
    }

    static void PreOrder(Node root){

        Stack<Node> st = new Stack<>();

        if(root != null)
        {
            st.push(root);
        }

        while(!st.isEmpty()){
            Node popped = st.pop();
            System.out.print(popped.data);
            if(popped.right != null) st.push(popped.right);
            if(popped.left != null) st.push(popped.left);
        }
    }
}

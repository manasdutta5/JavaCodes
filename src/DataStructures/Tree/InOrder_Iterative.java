package DataStructures.Tree;

import java.util.*;

public class InOrder_Iterative {
    static class Node {
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
        InOrder(root);
    }

    static void InOrder(Node root){

        Stack<Node> st = new Stack<>();

        if(root != null) st.push(root);
        Node popped;
        while(!st.isEmpty()){
            popped = st.pop();

            while(popped != null){
                st.push(popped.left);
                popped = popped.left;
            }
            popped = st.pop();
            if(popped != null) System.out.println(popped.data);
            if(popped.right != null) st.push(popped.right);

        }

    }
}


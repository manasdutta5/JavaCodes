package DataStructures.Tree;

public class AVLtreeInsertion {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        //current BST
        Node root = new Node(8);
        root.right = new Node(9);
        root.right.right = new Node(10);
        root.right.right.right = new Node(11);

    }
}

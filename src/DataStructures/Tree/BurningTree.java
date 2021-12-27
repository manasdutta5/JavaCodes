package DataStructures.Tree;

public class BurningTree {

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
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.right.left = new Node(10);

        Node target = root.left.right.left;
        System.out.println();
    }
}

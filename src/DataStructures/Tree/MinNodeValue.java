package DataStructures.Tree;

public class MinNodeValue {

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

        System.out.println(findMin(root));
    }

    static int findMin(Node node){
        if(node == null) return Integer.MAX_VALUE;
        int min = node.data;
        min = Math.min(min,findMin(node.left));
        min = Math.min(min,findMin(node.right));
        return min;
    }
}

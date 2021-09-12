package DataStructures.Tree;

public class SumoFLeafNodes {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        root.right.left = new Node(90);

        System.out.println(sumleaf(root));
    }

    static int sumleaf(Node node){
        if(node == null) return 0;
        if(node.left == null && node.right == null) return node.data;
        return sumleaf(node.left) + sumleaf(node.right);
    }

}

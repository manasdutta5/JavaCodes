package DataStructures.Tree;

public class MaximumPathSum {
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

        System.out.println(findMaxPathSum(root));
    }

    static int findMaxPathSum(Node node){
        if(node == null) return 0;
        return node.data + Math.max(findMaxPathSum(node.left),findMaxPathSum(node.right));

    }
}

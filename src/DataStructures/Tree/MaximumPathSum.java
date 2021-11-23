package DataStructures.Tree;

//In this we are considering complete path from leaf to leaf

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
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        System.out.println(findMaxPathSum(root));
    }

    static int findMaxPathSum(Node node){
        if(node == null) return 0;
        return node.data + Math.max(findMaxPathSum(node.left),findMaxPathSum(node.right));

    }
}

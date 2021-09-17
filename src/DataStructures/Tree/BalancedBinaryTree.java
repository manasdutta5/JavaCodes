package DataStructures.Tree;

public class BalancedBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){ this.data = data; }
    }

    public static void main(String[] args) throws Exception{
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.left.left.left = new Node(7);

        System.out.println(isBalanced(root));
    }

    /*Function to check whether a binary tree is balanced or not.*/
    public static boolean isBalanced(Node root)
    {
        if(root == null) return true;

        //check for curremt node
        if(Math.abs(height(root.left)-height(root.right)) >1) return false;

        //check for all nodes
        if(isBalanced(root.left)==false || isBalanced(root.right)==false) return false;


        return true;
    }

    static int height(Node node){
        if(node == null) return 0;
        return 1 + Math.max(height(node.left) , height(node.right));
    }

}

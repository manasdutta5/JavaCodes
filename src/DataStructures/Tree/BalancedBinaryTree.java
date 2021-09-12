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

        System.out.println(checkBalanced(root));
    }

    public static boolean checkBalanced(Node root)
    {
        return false;
    }

}

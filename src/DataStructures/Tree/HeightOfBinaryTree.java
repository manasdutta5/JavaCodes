package DataStructures.Tree;

public class HeightOfBinaryTree {

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

        System.out.println(findDepth(root));
    }

    public static int findDepth(Node root){
        if(root == null) return 0;
        return (1+Math.max(findDepth(root.left),findDepth(root.right)));
    }

}

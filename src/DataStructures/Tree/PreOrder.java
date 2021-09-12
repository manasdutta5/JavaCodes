package DataStructures.Tree;

public class PreOrder {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){this.data = data;}
    }

    public static void main(String[] args) throws Exception{
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        preorder(root);
    }

    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}

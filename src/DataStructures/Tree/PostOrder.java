package DataStructures.Tree;

public class PostOrder {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){this.data = data;}
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        postorder(root);
    }

    public static void postorder(Node root)
    {
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
}

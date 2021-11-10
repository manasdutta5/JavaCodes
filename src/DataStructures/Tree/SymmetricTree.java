package DataStructures.Tree;

public class SymmetricTree {
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
        System.out.println(isSymmetric(root));

    }

    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        return ismirror(root,root);
    }

    static boolean ismirror(Node node1,Node node2){
        if(node1 == null && node2==null) return true;
        if(node1 != null && node2 != null && node1.data == node2.data)
            return ismirror(node1.left,node2.right) && ismirror(node1.right,node2.left);

        return false;
    }
}

package DataStructures.LinkedList;

public class FlattenBinaryTreetoLL {

    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(6);

        Node temp = flattenBTtoLL(root);
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.right;
        }
    }
    static Node previous = null;
    public static Node flattenBTtoLL(Node root)
    {
            if(root == null) return null;
            flattenBTtoLL(root.right);
            flattenBTtoLL(root.left);

            root.right = previous;
            root.left = null;
            previous = root;

            return root;
    }
}

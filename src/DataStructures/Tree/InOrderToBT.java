package DataStructures.Tree;

public class InOrderToBT {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    public static void main(String[] args)
    {
        int[] inorder = new int[]{1, 5, 10, 40, 30, 15, 28, 20};
        Node root = ConstructBST(inorder,0,inorder.length - 1);
        printTree(root);
    }

    static Node ConstructBST(int[] inorder,int startIndex,int EndIndex)
    {
        if(startIndex > EndIndex) return null;
        /*
        // we are making balanced BST so we are assuming mid element as root node
        // else we can also assume max(array inorder) as root node
        */
        int mid = (startIndex + EndIndex)/2;
        Node root = new Node(inorder[mid]);

        root.left = ConstructBST(inorder,startIndex,mid-1);
        root.right = ConstructBST(inorder,mid + 1,EndIndex);

        return root;
    }

    static void printTree(Node root)
    {
        if(root == null) return;
        printTree(root.left);
        System.out.print(root.data + " ");
        printTree(root.right);
    }
}

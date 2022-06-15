package DataStructures.Tree;

public class IdenticalBT {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){this.data = data;}
    }

    public static void main(String[] args){
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);

        System.out.println(isIdentical(root1,root2));
    }

    static boolean isIdentical(Node p,Node q){
        if(p == null && q == null) return true;
        if((p==null && q!=null) || (p!=null && q==null)) return false;
        if(p.data != q.data) return false;
        return (isIdentical(p.left,q.left) && isIdentical(p.right,q.right));
    }
}

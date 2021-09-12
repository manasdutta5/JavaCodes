package DataStructures.Tree;
import java.util.*;

public class CountNodesInAGivenRange{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.left.left.left = new Node(7);
        System.out.println("Enter l and h :");
        int l = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(getCount(root,l,h));
    }

    static int getCount(Node root,int l, int h)
    {
        //Your code here
        if(root == null) return 0;
        if(root.data>=l && root.data<=h) return 1 + getCount(root.left,l,h) + getCount(root.right,l,h);
        else return getCount(root.left,l,h) + getCount(root.right,l,h);
    }


}

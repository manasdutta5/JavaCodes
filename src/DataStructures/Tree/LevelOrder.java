package DataStructures.Tree;

import java.util.*;

public class LevelOrder {
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
        root.right.left = new Node(6);
        root.left.left.left = new Node(7);
        levelOrder(root);

    }

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int Current_size = q.size();
            for(int i=0;i<Current_size ; i++)
            {
                Node remove = q.remove();
                System.out.print(remove.data+" ");
                if(remove.left!=null) q.add(remove.left);
                if(remove.right!=null) q.add(remove.right);
            }
            System.out.println();

        }
    }

}

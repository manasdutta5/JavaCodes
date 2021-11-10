package DataStructures.Tree;

import java.util.*;
public class LeftView {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){ this.data = data; }
    }

    public static void main(String[] args) throws Exception{
        Node root = new Node(4);
        root.left = new Node(5);
        root.right = new Node(2);
        root.right.left = new Node(3);
        root.right.right = new Node(1);
        root.right.left.left = new Node(6);
        root.right.left.right = new Node(7);

        System.out.println(leftView(root));
    }




    static ArrayList<Integer> leftView(Node root)
    {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node removed = q.remove();

                if(removed.left!=null) q.add(removed.left);
                if(removed.right!=null) q.add(removed.right);
                if(i==0) res.add(removed.data);
            }
        }

        return res;
    }
}

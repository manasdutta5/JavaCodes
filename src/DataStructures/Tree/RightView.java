package DataStructures.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightView {

    static class Node{
        int data;
        LeftView.Node left;
        LeftView.Node right;

        public Node(int data){ this.data = data; }
    }

    public static void main(String[] args) throws Exception{
        LeftView.Node root = new LeftView.Node(4);
        root.left = new LeftView.Node(5);
        root.right = new LeftView.Node(2);
        root.right.left = new LeftView.Node(3);
        root.right.right = new LeftView.Node(1);
        root.right.left.left = new LeftView.Node(6);
        root.right.left.right = new LeftView.Node(7);

        System.out.println(rightView(root));
    }




    static ArrayList<Integer> rightView(LeftView.Node root)
    {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<LeftView.Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                LeftView.Node removed = q.remove();

                if(removed.left!=null) q.add(removed.left);
                if(removed.right!=null) q.add(removed.right);
                if(i==size-1) res.add(removed.data);
            }
        }

        return res;
    }
}

package DataStructures.Tree;

/*
//  Problem link : https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1#
//  Refer top view of Binary tree
//  In the approach of top view, print last node in each arraylist
//  containing top view traversal of each vertical level
*/
import java.util.*;
public class BottomViewOfTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    static class vPair{
        Node node;
        int hLevel;

        public vPair(Node node,int hLevel){
            this.node = node;
            this.hLevel = hLevel;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(21);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        System.out.println(BottomView(root));
    }

    static ArrayList<Integer> BottomView(Node root){
        int leftLevel = 0, rightLevel = 0;
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        Queue<vPair> q = new LinkedList<>();

        q.add(new vPair(root,0));

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                vPair removed = q.remove();
                leftLevel = Math.min(leftLevel,removed.hLevel);
                rightLevel = Math.max(rightLevel,removed.hLevel);

                map.putIfAbsent(removed.hLevel,new ArrayList<>());
                map.get(removed.hLevel).add(removed.node.data);

                if(removed.node.left != null) q.add(new vPair(removed.node.left,removed.hLevel - 1));
                if(removed.node.right != null) q.add(new vPair(removed.node.right,removed.hLevel + 1));
            }
        }

        for(int i=leftLevel;i<=rightLevel;i++){
            ArrayList<Integer> arr = map.get(i);
            res.add(arr.get(arr.size()-1));
        }




        return res;
    }

}

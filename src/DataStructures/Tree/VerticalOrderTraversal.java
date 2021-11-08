/*
//  Problem link on gfg : https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1
//  solution video pepecoding: https://youtu.be/LscPXvD1N1A
//  solution video striver: https://youtu.be/q_a6lpbKJdw
 */


package DataStructures.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class VerticalOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    //creation of tree
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.left.left.left = new Node(7);

        System.out.println(VerticalOrder(root));
    }

    //make a vertical pair vPair class
    //It will hold the node with their horizontal level value
    static class vPair{
        Node node = null;
        int hLevel = 0;

        vPair(Node node, int level){
            this.node = node;
            this.hLevel = level;
        }
    }

    //main function
    static ArrayList<ArrayList<Integer>> VerticalOrder(Node root){
        int minLevel = 0, maxLevel = 0;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        Queue<vPair> q = new LinkedList<>();

        //assign root as 0 level from left
        //all node left to it will be at level -1, -2 ,-3 etc
        //all node right tob it will be at level +1, +2, +3 etc
        q.add(new vPair(root,0));

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0; i<size; i++)
            {
                //take out first node
                vPair removed = q.remove();
                map.putIfAbsent(removed.hLevel,new ArrayList<>());
                map.get(removed.hLevel).add(removed.node.data);
                minLevel = Math.min(removed.hLevel,minLevel);
                maxLevel = Math.max(removed.hLevel,maxLevel);

                // if left of the removed node isn't null. add its vPair to queue
                // if we move left, level will be -1
                if(removed.node.left != null) q.add(new vPair(removed.node.left,removed.hLevel-1));

                // if right of the removed node isn't null. add its vPair to queue
                // if we move left, level will be +1
                if(removed.node.right != null) q.add(new vPair(removed.node.right,removed.hLevel+1));
            }
        }
        for(int i = minLevel;i<=maxLevel;i++)
        {
            res.add(map.get(i));
        }
//        System.out.println(minLevel);
//        System.out.println(maxLevel);
//        System.out.println(res);
//        System.out.println(map);




        return res;
    }
}

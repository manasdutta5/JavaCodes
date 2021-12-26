package DataStructures.Tree;

/*
// Problem Link: https://practice.geeksforgeeks.org/problems/root-to-leaf-paths/1
 */


import java.util.ArrayList;

public class RootToLeafPath
{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }

        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.left.left.left = new Node(7);
            root.right.left.right = new Node(8);
            root.right.left.right.right = new Node(9);
            root.right.left.right.left = new Node(10);
            root.left.right.left = new Node(11);
            root.left.right.left.left = new Node(12);
            root.left.right.left.left.left = new Node(13);

            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            ArrayList<Integer> paths = new ArrayList<>();

            findPath(root,paths,res);
            System.out.println(res);
        }

        public static void findPath(Node root,ArrayList<Integer> paths, ArrayList<ArrayList<Integer>> res){
            if(root == null) return;
            paths.add(root.data);
            if(root.left == null && root.right == null){
                res.add(paths);
                return;
            }

            findPath(root.left,new ArrayList<>(paths),res);
            findPath(root.right,paths,res);
        }
    }
}

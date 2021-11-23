package DataStructures.Tree;

/*
//  Problem link: https://practice.geeksforgeeks.org/problems/diagonal-traversal-of-binary-tree/1
//  Video Solution Link: https://youtu.be/cvK3Sb6zJ1k
 */

import java.util.*;

public class DiagonalOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(7);
        root.right.left = new Node(6);
        root.right.right = new Node(8);
        root.right.left.left = new Node(11);
        root.right.right.right = new Node(9);
        root.right.right.right.left = new Node(10);

        System.out.println(printDiagonalOrder(root));
    }

    static ArrayList<ArrayList<Integer>> printDiagonalOrder(Node root){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<Node> qLeft = new LinkedList<>();

        qLeft.add(root);
        while(!qLeft.isEmpty()){
            int size = qLeft.size();
            ArrayList<Integer> currentDiagonal = new ArrayList<>();

            for(int i=0;i<size;i++){
                Node traverse = qLeft.remove();

                while(traverse != null){
                    currentDiagonal.add(traverse.data);
                    if(traverse.left != null) qLeft.add(traverse.left);
                    traverse = traverse.right;
                }
            }
            res.add(currentDiagonal);
        }


        return res;
    }

}

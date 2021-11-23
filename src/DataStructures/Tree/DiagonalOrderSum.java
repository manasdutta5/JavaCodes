package DataStructures.Tree;

import java.util.*;

public class DiagonalOrderSum {
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

        System.out.println(findDiagonalSum(root));

    }

    static ArrayList<Integer> findDiagonalSum(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> qLeft = new LinkedList<>();

        qLeft.add(root);

        while(!qLeft.isEmpty()){
            int size = qLeft.size();
            int sum = 0;
            for(int i=0;i<size;i++){
                Node diagonalNode = qLeft.remove();
                while(diagonalNode != null){
                    sum += diagonalNode.data;
                    if(diagonalNode.left != null) qLeft.add(diagonalNode.left);
                    diagonalNode = diagonalNode.right;
                }
            }
            res.add(sum);
        }


        return res;
    }
}

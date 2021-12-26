package DataStructures.Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class RootToNodePath {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    static ArrayList<Integer> path = new ArrayList<>();
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

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to be searched :");
        int data = sc.nextInt();

        boolean flag = findPath(root,path,data);
        if(flag) System.out.println(path);
        else System.out.println("-1");
    }

    public static boolean findPath(Node root,ArrayList<Integer> path,int data){
        if(root == null) {
            return false;
        }

        if(root.data == data) {
            path.add(root.data);
            return true;
        }

        if(findPath(root.left,path,data)) {
            path.add(root.data);
            return true;
        }

        if(findPath(root.right,path,data)){
            path.add(root.data);
            return true;
        }

        return false;
    }
}

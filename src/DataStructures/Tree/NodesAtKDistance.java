package DataStructures.Tree;

/*
//  Problem link: https://practice.geeksforgeeks.org/problems/nodes-at-given-distance-in-binary-tree/1
//  Video Solution : https://youtu.be/i9ORlEy6EsI
//  Video Solution : https://youtu.be/s22QClql9LU
 */

import java.util.*;
public class NodesAtKDistance {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    static ArrayList<Node> rootToNode = new ArrayList<>();
    static int i = 0;

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        int target = 8;
        int k = 2;

        findPath(root,target,rootToNode);
        for(int j=0;j<rootToNode.size();j++){
            System.out.print(rootToNode.get(j).data+" ");
        }
        System.out.println();
        ArrayList<Integer> pathAtDistanceK = new ArrayList<>();

        NodesAtKDistance(root,null,k,pathAtDistanceK);
        System.out.println(pathAtDistanceK);
    }

    //To find target node to root path
    public static boolean findPath(Node root,int target, ArrayList<Node> path){
        if(root == null) return false;

        if(root.data == target){
            path.add(root);
            return true;
        }

        if(findPath(root.left,target,path)){
            path.add(root);
            return true;
        }

        if(findPath(root.right,target,path)){
            path.add(root);
            return true;
        }


        return false;
    }

    //To find Nodes at a distance K from the target node
    public static void NodesAtKDistance(Node root, Node block,int k,ArrayList<Integer> path){
        System.out.println("k= "+k+" , root = "+root.data);
        System.out.println(k);

        if(root == null || root == block || k < 0){
            return;
        }

        if(k==0){
            path.add(root.data);
            return;
        }

        System.out.println("yes");
        NodesAtKDistance(root.left,rootToNode.get(i),k-1,path);
        NodesAtKDistance(root.right,rootToNode.get(i),k-1,path);
        i++;
    }

}

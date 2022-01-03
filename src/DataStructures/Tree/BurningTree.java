package DataStructures.Tree;

/*
//  Problem link: https://practice.geeksforgeeks.org/problems/burning-tree/1#
//  Video Solution: https://youtu.be/dtBj2A_7JOk
 */


public class BurningTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    private static int time = 0;
    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.right = new Node(7);
//        root.left.left.left = new Node(8);
//        root.left.right.left = new Node(10);

        //tree 2
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);
        root.right.right = new Node(6);
        root.right.right.right = new Node(9);
        root.right.right.right.right = new Node(10);

        int target = 1;
        burningTree(root,target);
        System.out.println(time);
    }

    public static void burn(Node root,Node blockNode,int t){
        if(root == null || root == blockNode) return;

        time = Math.max(time,t);

        burn(root.left,blockNode,t+1);
        burn(root.right,blockNode,t+1);

    }

    public static int burningTree(Node root,int fireNode)
    {
        if(root == null)
        {
            return -1;
        }

        if(root.data == fireNode)
        {
            burn(root,null,0);
            return 1;
        }

        int leftTime = burningTree(root.left,fireNode);
        if(leftTime != -1)
        {
            burn(root,root.left,leftTime);
            return leftTime+1;
        }
        int rightTime = burningTree(root.right,fireNode);
        if(rightTime != -1)
        {
            burn(root,root.right,rightTime);
            return rightTime+1;
        }

        return -1;
    }
}

package DataStructures.Tree;


//do vertical order traversal first

import java.util.*;
public class TopViewOfBST {

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

    //creation of tree
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.left.left.left = new Node(7);

        System.out.println(TopView(root));
    }

    static ArrayList<Integer> TopView(Node root){
        int leftLevel = 0, rightLevel = 0;
        boolean flag = false;
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        Queue<vPair> q = new LinkedList<>();

        q.add(new vPair(root,0));
        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                vPair removed = q.remove();
                //for root level
                if(removed.hLevel == 0 && !flag)
                {
                    flag = true;
                    map.putIfAbsent(0,new ArrayList<>());
                    map.get(0).add(removed.node.data);
                }
                if(removed.hLevel > rightLevel || removed.hLevel < leftLevel)
                {
                    map.putIfAbsent(removed.hLevel,new ArrayList<>());
                    map.get(removed.hLevel).add(removed.node.data);
                }
                leftLevel = Math.min(leftLevel,removed.hLevel);
                rightLevel = Math.max(rightLevel,removed.hLevel);
                if(removed.node.left != null) q.add(new vPair(removed.node.left,removed.hLevel -1));
                if(removed.node.right != null) q.add(new vPair(removed.node.right,removed.hLevel +1));
            }
        }

        for(int i = leftLevel;i<=rightLevel;i++)
        {
            for(int data: map.get(i))
            {
                res.add(data);
            }
        }
        //System.out.println(map);

        return res;
    }





}

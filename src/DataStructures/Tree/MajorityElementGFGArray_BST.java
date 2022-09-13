package DataStructures.Tree;

/*
//  This problem involves insertion in BST for array based question
//  to reduce the time complexity to O(n)
//  Problem Link: https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
 */

public class MajorityElementGFGArray_BST {

    //create a node
    // with constructor for insertion
    static class Node{
        int data;
        int count = 0;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            count = 1;
            left = right = null;
        }
    }

    // utility function for insertion in BST
    public static Node utilInsert(Node root, int value)
    {
        if(root == null)
        {
            maxCount = 1;
            return new Node(value);
        }

        Node current = root;

        while(true)
        {
            if(value == current.data)
            {
                current.count++;
                break;
            }
            else if(value > current.data)
            {
                if(current.right != null) current = current.right;
                else
                {
                    current.right = new Node(value);
                    break;
                }
            }
            else
            {
                if(current.left != null) current = current.left;
                else
                {
                    current.left = new Node(value);
                    break;
                }
            }
        }
        maxCount = Math.max(current.count,maxCount);
        return root;
    }

    /*
    // utility function to find node with max count value
    // we will use inorder traversal (you can use any) - all have time complexity O(n)
    */

    // create a global variable to store max count and element
    static int maxCount = 0;
    static int element = -1;
    public static void inorder(Node root)
    {
        if(root == null) return;
        inorder(root.left);
        if(root.count == maxCount)
        {
            element = root.data;
        }
        inorder(root.right);
    }

    // driver code

    public static void main(String[] args) {
        //int[] arr = {3,1,3,3,2};

        int[] arr = {15};

        Node root = null;
        for(int i=0;i<arr.length;i++)
        {
            root = utilInsert(root,arr[i]);
        }

        inorder(root);
        //System.out.println("MaxC = "+maxCount+" ele = "+element+" "+(arr.length)/2);
        if(maxCount <= (arr.length/2))
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(element);
        }
    }

}

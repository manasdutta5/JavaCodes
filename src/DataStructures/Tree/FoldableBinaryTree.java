package DataStructures.Tree;

/*
// Problem Link: https://practice.geeksforgeeks.org/problems/foldable-binary-tree/1
// Video Solution: https://youtu.be/h0iTbaNF9zw
 */

// Driver Code Not Present Below, it is just to demonstrate the logical part of the code

class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

public class FoldableBinaryTree {
    //Function to check whether a binary tree is foldable or not.
    boolean IsFoldable(Node node)
    {
        // your code
        return CheckFoldable(node,node);
    }

    boolean CheckFoldable(Node node1, Node node2)
    {
        if(node1 == null && node2 == null) return true;
        if(node1 != null && node2 != null)
            return CheckFoldable(node1.left,node2.right) && CheckFoldable(node1.right,node2.left);

        return false;
    }
}

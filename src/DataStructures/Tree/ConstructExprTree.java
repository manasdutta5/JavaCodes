package DataStructures.Tree;
import java.util.*;

/*
//  Problem Link: https://practice.geeksforgeeks.org/problems/construct-an-expression-tree/1#
//  Video Explanation: https://youtu.be/WHs-wSo33MM
 */
public class ConstructExprTree {

    static class Node{
        char val;
        Node left;
        Node right;

        public Node(char val){
            this.val = val;
        }
    }

    static void printInorder(Node root){
        if(root == null) return;

        printInorder(root.left);
        System.out.print(root.val+"");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        char[] postfix = {'a','b','+','e','f','*','g','*','-'};
        Node root = ConstructTree(postfix);
        printInorder(root);
    }

    static Node ConstructTree(char[] postfix){
        Stack<Node> st = new Stack<>();
        for(char ch: postfix)
        {
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z' ))
            {
                Node temp = new Node(ch);
                st.push(temp);
            }
            else
            {
                Node b = st.pop();
                Node a = st.pop();
                Node temp = new Node(ch);
                temp.left = a;
                temp.right = b;
                st.push(temp);
            }
        }

        return st.pop();
    }
}

package DataStructures.Tree;
import java.util.*;
        /*
        // Relate it with code of Level Order Traversal
        //See Level Order Code First
        */
public class MaxLevelSum {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.left.left.left = new Node(7);

        System.out.println(maxLevelSum(root));
    }

    static int maxLevelSum(Node root) {
        /*
        // Relate it with code of Level Order Traversal
        //See Level Order Code First
        */
        if(root == null) return 0;
        int sum = 0;
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        sum = root.data;

        while(!q.isEmpty()){
            int size = q.size();

            int current_level_sum = 0;

            for(int i=0;i < size ; i++){
                Node current = q.remove();
                current_level_sum += current.data;
                if(current.left != null) q.add(current.left);
                if(current.right != null) q.add(current.right);

                if(current_level_sum > sum) sum = current_level_sum;
            }
        }

        return sum;
    }
}

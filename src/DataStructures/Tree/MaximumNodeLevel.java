package DataStructures.Tree;
import java.util.*;
        /*
        // print node number
        //containing maximum number of nodes
        //
        // Relate it with code of Level Order Traversal
        // and Maximum level sum questions
        //See Level Order Code First
        */

public class MaximumNodeLevel {

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

        System.out.println(maxNodeLevel(root));
    }

    // Return the level (0-indexed) with maximum number of nodes.
        static int maxNodeLevel(Node root) {
        /*
        // Relate it with code of Level Order Traversal
        // and Maximum level sum questions
        //See Level Order Code First
        */
        int answer_level = 0;
        int max_node_count = 0;
        int level = 0;
        Queue<Node> q = new LinkedList<>();

        if (root != null) {
            answer_level = 0;
            max_node_count = 1;
        }

        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            if (size > max_node_count) {
                max_node_count = size;
                answer_level = level;
            }
            level++;

            for (int i = 0; i < size; i++) {
                Node current = q.remove();
                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);

            }
        }

        return answer_level;
    }
}

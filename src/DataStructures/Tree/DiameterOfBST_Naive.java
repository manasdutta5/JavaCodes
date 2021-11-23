package DataStructures.Tree;


//giving wrong output for some inputs in gfg

public class DiameterOfBST_Naive {

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
        int diameter = 0;
        System.out.println(findDiameter(root,diameter));
    }

    static int findDiameter(Node root,int diameter){
        if(root == null) return 0;
        int current_diameter = findheight(root.left) + findheight(root.right);

        diameter = Math.max(current_diameter,diameter);

        findDiameter(root.left,diameter);
        findDiameter(root.right,diameter);

        return diameter;
    }

    static int findheight(Node node){
        if(node == null) return 0;
        return 1+Math.max(findheight(node.left),findheight(node.right));
    }

}

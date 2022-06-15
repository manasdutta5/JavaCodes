package DataStructures.LinkedList;

/*
// Problem Link: https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1/
// Asked
// Video solution: https://youtu.be/ysytSSXpAI0 (Striver's)
 */


public class FlatteningALinkedList {
    static class Node{
        int data;
        Node next;
        Node bottom;

        public Node(int data){
            this.data = data;
            next = bottom = null;
        }
    }

    public static void main(String[] args) {

        //driver code

        Node root = new Node(5);
        root.bottom = new Node(7);
        root.bottom.bottom = new Node(8);
        root.bottom.bottom.bottom = new Node(30);

        root.next = new Node(10);
        root.next.bottom = new Node(20);

        root.next.next = new Node(19);
        root.next.next.bottom = new Node(22);
        root.next.next.bottom.bottom = new Node(50);

        root.next.next.next = new Node(28);
        root.next.next.next.bottom = new Node(35);
        root.next.next.next.bottom.bottom = new Node(40);
        root.next.next.next.bottom.bottom.bottom = new Node(45);

        Node head = flattenLL(root);

        while(head.bottom != null)
        {
            System.out.print(head.data+" ");
            head = head.bottom;
        }
    }

    static Node flattenLL(Node head)
    {
        if(head == null || head.next == null) return head;

        //attach flattened node to current node head
        //recur towards right
        head.next = flattenLL(head.next);

        //merge flatttened part with current part

        head = merge(head,head.next);

        return head;
    }

    static Node merge(Node a, Node b)
    {
        Node low = new Node(0);
        Node newHead = low;

        while(a!=null && b!=null)  //till any one list exhausts
        {
            if(a.data < b.data)
            {
                low.bottom = a;
                low = a;
                a = a.bottom;
            }
            else
            {
                low.bottom = b;
                low = b;
                b = b.bottom;
            }
        }

        if(a == null) low.bottom = b;
        else low.bottom = a;

        return newHead.bottom;
    }
}

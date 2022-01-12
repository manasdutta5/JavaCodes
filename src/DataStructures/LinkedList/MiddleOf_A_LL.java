package DataStructures.LinkedList;


/*
// Make two pointers, one slow and other fast
// While fast != null and fast.next != null ( increase slow by one and fast by two)
// Slow will reach middle when fast reaches null or end of LL
 */

public class MiddleOf_A_LL {

    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = null;

        System.out.println(findMid(head).data);
    }

    public static Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

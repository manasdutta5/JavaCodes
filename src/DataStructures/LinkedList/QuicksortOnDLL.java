package DataStructures.LinkedList;

public class QuicksortOnDLL {
    static class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data)
        {
            this.data = data;
            prev = next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);

        head.next = new Node(4);
        head.next.prev = head;

        head.next.next = new Node(9);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(2);
        head.next.next.next.prev = head.next.next;


    }
}

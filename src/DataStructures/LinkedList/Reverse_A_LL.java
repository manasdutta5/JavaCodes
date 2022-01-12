package DataStructures.LinkedList;

public class Reverse_A_LL {

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
        head.next.next.next.next.next.next = null;

        Node temp = head;
//        while(temp.next != null)
//        {
//            System.out.print(temp.data +" ");
//            temp = temp.next;
//        }

        temp = reverseLL(head);
        while(temp != null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    public static Node reverseLL(Node head)
    {
       Node prev = null;
       while(head != null)
       {
           Node after = head.next;
           head.next = prev;
           prev = head;
           head = after;
       }
       return prev;
    }

}

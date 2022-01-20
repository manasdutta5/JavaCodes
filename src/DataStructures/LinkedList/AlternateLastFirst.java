package DataStructures.LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class AlternateLastFirst {
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
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = null;

        Node temp = reArrangeLinkedList(head);
        while(temp != null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    public static Node reArrangeLinkedList(Node head)
    {
        Deque<Integer> deque = new ArrayDeque<>();
        Node current = head;
        while(current != null)
        {
            deque.addLast(current.data);
            current = current.next;
        }
        current = head;
        int i = 0;

        while(!deque.isEmpty())
        {
            if(i % 2 != 0)
            {
                current.data = deque.removeFirst();
            }
            else
            {
                current.data = deque.removeLast();
            }
            i++;
            current = current.next;
        }
        return head;
    }

}

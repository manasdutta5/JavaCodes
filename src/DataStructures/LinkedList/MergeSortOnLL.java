package DataStructures.LinkedList;

public class MergeSortOnLL {

    static class Node{
        int data;
        Node next = null;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.next = new Node(8);
        System.out.println("Unsorted list:");
        Node newHead = head;
        while(newHead != null)
        {
            System.out.print(newHead.data);
            newHead = newHead.next;
        }

        newHead = mergeSort(head);
        System.out.println("Sorted list:");
        while(newHead != null)
        {
            System.out.print(newHead.data);
            newHead = newHead.next;
        }

    }

    public static Node UtilfindMid(Node head)
    {
        Node slow = head, fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node mergeTwoSortedLL(Node h1, Node h2)
    {
        Node newHead=null;
        Node l1 = h1,l2 = h2;
        if(h1.data > h2.data && h1 != null)
        {

        }

        return newHead;
    }
    public static Node mergeSort(Node head)
    {
        Node newHead = null;

        return newHead;
    }
}

package DataStructures.LinkedList;

/*
// Problem Link: https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
// Video Solution: https://youtu.be/Xb4slcp1U38
 */

public class MergeTwoSortedLL {


    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(5);
        head1.next.next.next.next = new Node(7);
        head1.next.next.next.next.next = null;

        Node head2 = new Node(3);
        head2.next = new Node(4);
        head2.next.next = new Node(8);
        head2.next.next.next = null;

        Node temp = mergeLL(head1,head2);
        while(temp != null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static Node mergeLL(Node h1, Node h2)
    {
        Node l1 = h1,l2 = h2,newHead = null;
        if(h1.data > h2.data)
        {
            Node swap = l1;
            l1 = l2;
            l2 = swap;
        }

        newHead = l1;

        while(l1 != null && l2 != null)
        {
            Node temp = null;

            while(l1 != null && l1.data <= l2.data)
            {
                temp = l1;
                l1 = l1.next;
            }

            temp.next = l2;


            /*
            // Swap l1 aqnd l2 as we have to make l1 point lower value
            // but after exiting from internal while loop it started to point
            //larger value
            */

            //********** SWAP *********//

            Node swap = l1;
            l1 = l2;
            l2 = swap;
        }

        return newHead;
    }

}

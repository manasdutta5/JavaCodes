package DataStructures.LinkedList;

/*
// Problem link: https://practice.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1#
// Video Solution referred: https://youtu.be/4apaOcK586U
// ( the expanation in the video requires little modificationn in third while loop where an
// extra check need to be added to check for null condition of copy list's pon=inter when orig reaches null)
 */

public class CloneLLwithNextAndRandomPointers {

    static class Node{
        int data;
        Node next = null;
        Node arb = null;

        public Node(int data)
        {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        //create LL with next and random pointer and make function call
    }

    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here

        //make zigzag node using original LL
        Node cur = head;

        while(cur != null)
        {
            Node temp = new Node(cur.data);
            temp.next = cur.next;
            cur.next = temp;
            cur = cur.next.next;
        }

        cur = head;
        while(cur != null)
        {
            if(cur.next != null)
            {
                cur.next.arb = (cur.arb != null)?cur.arb.next:null;

            }
            cur = cur.next.next;
        }

        cur = head;
        Node newHead = cur.next;
        Node tmp = cur.next;

        while(cur != null)
        {
            cur.next = cur.next.next;
            tmp.next = tmp.next.next;
            cur = cur.next;
            tmp = tmp.next;
        }

        return newHead;
    }
}
